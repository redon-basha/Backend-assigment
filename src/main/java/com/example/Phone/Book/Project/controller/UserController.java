package com.example.Phone.Book.Project.controller;

import com.example.Phone.Book.Project.model.User;
import com.example.Phone.Book.Project.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private  UserService userService;

    @GetMapping("/view/user/{id}")
    public ResponseEntity<Optional<User>> viewusebyid(@PathVariable("id") String id){
        Optional<User> selecteduser=userService.selectuserbyid(id);
        return new ResponseEntity<>(selecteduser,HttpStatus.OK);
    }






    @GetMapping("/view/{sortby}")
    public ResponseEntity<List<User>> viewAllUsers(@PathVariable("sortby") String sortby){
        List<User> user = userService.getAllUsers(sortby);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }

    @GetMapping("/view")
    public ResponseEntity<List<User>> viewAllUsers(){
        List<User> user = userService.getAllUsers();
        return new ResponseEntity<>(user, HttpStatus.OK);

    }


    @PostMapping("/add")
    public ResponseEntity<User> addUsers(@RequestBody User user){
        User newuser = userService.add(user);
        return new ResponseEntity<>(newuser, HttpStatus.CREATED);

    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id){
        userService.deleteuser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<User> updateUsers(@RequestBody User user) {
        User updateduser = userService.updateuser(user);
        return new ResponseEntity<>(updateduser, HttpStatus.OK);
    }




}
