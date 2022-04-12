package com.example.Phone.Book.Project.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;




@Data
@Document
public class PhoneBooks {
    private Type type;
    private String number;

}
