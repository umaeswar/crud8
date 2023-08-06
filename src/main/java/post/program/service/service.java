package post.program.service;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import post.program.jbaRepository.JPARepo;

@Service
public class service {
  @Autowired
  JPARepo repo;
  public Registration addData(Registration reg)
  {
	  return this.repo.save(reg);
  }
}
