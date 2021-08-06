package com.orangetalents.comicsmanager.excepion;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException() {
        super("User Already Exists!");
    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }

}
