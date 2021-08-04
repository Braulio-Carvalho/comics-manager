package com.orangetalents.comicsmanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    @Column(name = "birth_date")
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
