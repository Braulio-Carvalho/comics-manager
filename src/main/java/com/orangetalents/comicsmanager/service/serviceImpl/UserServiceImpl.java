package com.orangetalents.comicsmanager.service.serviceImpl;

import com.orangetalents.comicsmanager.excepion.UserAlreadyExistsException;
import com.orangetalents.comicsmanager.model.User;
import com.orangetalents.comicsmanager.repository.UserRepository;
import com.orangetalents.comicsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;





@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> listUser() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        try {
            return userRepository.save(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserAlreadyExistsException();
        }
    }
}
