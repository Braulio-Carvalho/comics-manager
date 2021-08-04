package com.orangetalents.comicsmanager.facade;

import com.orangetalents.comicsmanager.model.User;
import com.orangetalents.comicsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserFacade {

    @Autowired
    private UserService userService;


    public ResponseEntity<List<User>> listUsers(){
        return ResponseEntity.ok(userService.listUser());
    }


    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }
}
