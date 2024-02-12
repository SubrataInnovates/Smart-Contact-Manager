package com.smart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.dao.UserRepository;
import com.smart.entities.User;



@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String homeController(Model model)
    {
       model.addAttribute("title","Home - Smart Contact Manager");
        
        // Logging messages
          log.info("Home controller working perfectly...");
          log.info("Home Page landed");
          log.debug("Home Page Request ");
        
        return "home";
    }
    @GetMapping("/about")
    public String aboutController(Model model)
    {
       model.addAttribute("title","About - Smart Contact Manager");
        
        // Logging messages
          log.info("About controller working perfectly...");
          log.info("About Page Landed");
          log.debug("About Page Request !!");
        
        return "about";
    }
    @GetMapping("/signup")
    public String signupController(Model model)
    {
    	model.addAttribute("title","Register - Smart Contact Manager");
    	
    	 log.info("Signup controller working perfectly...");
         log.info("Register Page Landed");
         log.debug("Signup Page Request !!");
    	
    	return "signup";
    }
    @GetMapping("/login")
    public String loginController(Model model)
    {
    	model.addAttribute("title","Login - Smart Contact Manager");
    	
    	 log.info("Login controller working perfectly...");
         log.info("Login Page Landed");
         log.debug("Login Page Request !!");
    	
    	return "login";
    }
}
