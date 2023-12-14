package spring.project.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import spring.project.model.UserModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spring.project.services.UserService;
import spring.project.services.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Qualifier;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;



@RestController
public class UserController {

    private UserService service;

    public UserController(@Qualifier("primary") UserService userService){
        this.service = userService;
    }


    public UserController(){
   }

    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getUser(@PathVariable(name = "userName") String userName) {
        return ResponseEntity.of(Optional.ofNullable(service.getUser(userName)));

    }

    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserModel user){
        service.addUser(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/deleteUser/{userName}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userName) {
        service.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }


}
