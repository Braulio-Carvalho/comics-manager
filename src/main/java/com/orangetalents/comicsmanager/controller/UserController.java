package com.orangetalents.comicsmanager.controller;

import com.orangetalents.comicsmanager.facade.UserFacade;
import com.orangetalents.comicsmanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserFacade userFacade;


    @GetMapping()
    public ResponseEntity<List<User>> listUsers(){
       return userFacade.listUsers();
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
      return userFacade.createUser(user);
    }

}
