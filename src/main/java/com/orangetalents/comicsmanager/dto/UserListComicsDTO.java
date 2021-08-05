package com.orangetalents.comicsmanager.dto;

import com.orangetalents.comicsmanager.model.Comics;
import com.orangetalents.comicsmanager.model.User;

import java.util.Date;
import java.util.List;

public class UserListComicsDTO {

    private String name;
    private String email;
    private String cpf;
    private Date birthDate;

    private List<Comics> listComics;

    public UserListComicsDTO(User user, List<Comics> listComics) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.birthDate = user.getBirthDate();
        this.listComics = listComics;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Comics> getListComics() {
        return listComics;
    }

    public void setListComics(List<Comics> listComics) {
        this.listComics = listComics;
    }
}
