package com.orangetalents.comicsmanager.service;

import com.orangetalents.comicsmanager.model.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    User createUser(User user);
}
