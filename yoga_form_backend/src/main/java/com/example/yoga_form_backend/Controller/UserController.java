package com.example.yoga_form_backend.Controller;

import com.example.yoga_form_backend.Exception.ResourceNotFoundException;
import com.example.yoga_form_backend.Repository.UserRepository;
import com.example.yoga_form_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@CrossOrigin(origins="https://master.d379w6x7i1thpz.amplifyapp.com/")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllCourses(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User CreateUser(@RequestBody User user){

        user.setLastDate();
        return userRepository.save(user);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){

        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with id:"+ id));
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User userDetails) throws ParseException {
       User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:"+ id));
        user.setMobileNumber(user.getMobileNumber());
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setAge(userDetails.getAge());
        user.setJoiningDate(userDetails.getJoiningDate());
        user.setBatch(userDetails.getBatch());
        user.setPayment(userDetails.getPayment());
        user.setLastDate();



        User updateUser = userRepository.save(user);
        return ResponseEntity.ok(updateUser);
    }

}
