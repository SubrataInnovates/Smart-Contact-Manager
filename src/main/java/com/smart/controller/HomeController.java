package com.smart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserRepository repository;

    @GetMapping("/test")
    public String test() {
        User user = new User();
        user.setName("Subrata ");
        user.setEmail("subrataqa@gmail.com");
        user.setAbout("Hello bbu");
        
        repository.save(user);
        
        // Logging messages
        log.info("Test controller working perfectly...");
        log.info("New User Added: {}", user);
        log.debug("User details: {}", user);
        
        return "Working perfectly";
    }
}
