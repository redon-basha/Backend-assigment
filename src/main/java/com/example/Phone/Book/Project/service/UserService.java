package com.example.Phone.Book.Project.service;

import com.example.Phone.Book.Project.model.PhoneBooks;
import com.example.Phone.Book.Project.model.User;
import com.example.Phone.Book.Project.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private  UserRepository userRepository;


    public Optional<User> selectuserbyid(String id){
        return userRepository.findById(id);
    }


    public User add(User user){
        return userRepository.save(user);
    }


    public List<User> getAllUsers(String sortby){
        switch(sortby){
            case "firstname":
                return userRepository.findAll(Sort.by(Sort.Direction.ASC, sortby));
            case "lastname":
                return userRepository.findAll(Sort.by(Sort.Direction.ASC, sortby));
            default:
                return userRepository.findAll();
        }
    }

    public List<User> getAllUsers(){
                return userRepository.findAll();
        }



    public User updateuser(User user){
        return userRepository.save(user);
    }


    public void deleteuser(String Id){
        userRepository.deleteById( Id);
    }
}
