package com.example.management_system.controller;

import com.example.management_system.model.User;
import com.example.management_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/v1/users")
    public User createNewUser(@RequestBody User user){
         userService.createUser(user);
         return user;
    }

    @GetMapping("/api/v1/users")
    public List<User> retrievAllUser(){
        return userService.retrieveUser();

    }

    @GetMapping("/api/v1/users/{id}")
    public User retrieveUserById(@PathVariable Long id){
        return userService.retrieveUserById(id);
    }

    @GetMapping("/api/v1/user/{name}")
    public User retrieveUserByName(@PathVariable String name){
        return userService.retrieveUserByName(name);
    }

    @PutMapping("/api/v1/users/{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable long id){
        userService.deleteUserById(id);
    }

    @DeleteMapping("/api/v1/users/")
    public void deleteUsers(){
        userService.deleteAllUser();
    }


}
