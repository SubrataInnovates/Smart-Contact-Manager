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

    @GetMapping("/home")
    public String homeController(Model model)
    {
       model.addAttribute("title","Home - Smart Contact Manager");
        
        // Logging messages
          log.info("Home controller working perfectly...");
//        log.info("New User Added: {}", user);
//        log.debug("User details: {}", user);
        
        return "home";
    }
    @GetMapping("/about")
    public String aboutController(Model model)
    {
       model.addAttribute("title","About - Smart Contact Manager");
        
        // Logging messages
          log.info("Home controller working perfectly...");
//        log.info("New User Added: {}", user);
//        log.debug("User details: {}", user);
        
        return "about";
    }
}
