package com.example.Phone.Book.Project.repository;

import com.example.Phone.Book.Project.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.Optional;

public interface UserRepository  extends MongoRepository <User,String> {

}
