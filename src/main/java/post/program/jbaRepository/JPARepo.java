package post.program.jbaRepository;

import javax.servlet.Registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepo extends JpaRepository<Registration,Integer>{

}
