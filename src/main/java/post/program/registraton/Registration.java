package post.program.registraton;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentReg")
public class Registration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Student_Id")
	private int StudentId;
	
	@Column(name="Student_Name")
	private String Name;
	
	@Column(name="Student_Dept")
	private String  Dept;
	
	@Column(name="Student_Address")
	private String Address;
	
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}


	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}


}
