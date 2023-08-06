package post.program.controller;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import post.program.service.service;

@RestController
@RequestMapping("/homepage")
public class controller {
	
	@Autowired
	service serv;
	@PostMapping("/Registeration")
	public Registration addValues(@RequestBody Registration reg)
	{
	return this.serv.addData(reg);

}
}
