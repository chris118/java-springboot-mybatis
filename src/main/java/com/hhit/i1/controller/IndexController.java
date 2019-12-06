package com.hhit.i1.controller;

import com.hhit.i1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public String getAllUser() {
        return userService.findAll().toString();
    }

    @RequestMapping("/users/{id}")
    public String getUser(@PathVariable Integer id) {
        return userService.findById(id).getName();
    }
}

