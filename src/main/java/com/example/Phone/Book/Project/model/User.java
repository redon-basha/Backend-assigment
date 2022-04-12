package com.example.Phone.Book.Project.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private List<PhoneBooks> phonebook;

    public User(String firstname, String lastname,List<PhoneBooks> phonebook) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonebook = phonebook;
    }
}
