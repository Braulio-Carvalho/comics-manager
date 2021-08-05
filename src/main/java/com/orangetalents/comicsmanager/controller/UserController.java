package com.orangetalents.comicsmanager.controller;
import com.orangetalents.comicsmanager.dto.UserListComicsDTO;
import com.orangetalents.comicsmanager.model.User;
import com.orangetalents.comicsmanager.service.ComicsService;
import com.orangetalents.comicsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ComicsService comicsService;


    @GetMapping()
    public ResponseEntity<List<User>> listUsers() {
        return ResponseEntity.ok(userService.listUser());
    }

    @GetMapping("{id}")
    public ResponseEntity<UserListComicsDTO> list(@PathVariable Long id) {
        return ResponseEntity.ok(comicsService.getUserComicList(id));
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }


}
