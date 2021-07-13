package com.example.management_system.services;

import com.example.management_system.model.User;
import com.example.management_system.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void createUser(User user){

         userRepo.save(user);

    }

    public List<User> retrieveUser(){

        List<User> user = userRepo.findAll();
        return user;
    }

    public User retrieveUserById(Long id){
        User user = userRepo.findById(id).orElseThrow(()-> new RuntimeException("User not found") );
        return user;
    }

    public User retrieveUserByName(String name){
        User user = userRepo.findByName(name);
        return user;
    }

    public User updateUserById(Long id, User user){
        userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        user.setName(user.getName());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        userRepo.save(user);
        return user;
    }

    public void deleteUserById(Long id){
       userRepo.deleteById(id);

    }

    public void deleteAllUser(){
        userRepo.deleteAll();
    }


}
