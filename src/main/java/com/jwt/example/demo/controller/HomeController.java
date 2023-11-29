package com.jwt.example.demo.controller;


import com.jwt.example.demo.models.User;
import com.jwt.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;
@RestController
@RequestMapping("/home")
public class HomeController {
  @Autowired
    private UserService userService;
  @GetMapping("/users")
    public List<User> getUsers(){
      System.out.println("getting users");
      return userService.getUsers();
  }

}
