package com.smart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.smart.dao.UserRepository;
import com.smart.entities.User;

@RestController
public class HomeController 
{

	@Autowired
	private UserRepository repository;
	@GetMapping("/test")
	public String test()
	{
		User user=new User();
		user.setName("Subrata");
		user.setEmail("subrata@gmail.com");
		user.setAbout("Hello bbu");
		
		repository.save(user);
		System.out.println(user);
		
		return "Working perfetly";
	}
}
