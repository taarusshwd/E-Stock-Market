package com.stockmarket.loginSignup.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmarket.loginSignup.entities.Contact;
import com.stockmarket.loginSignup.entities.User;
import com.stockmarket.loginSignup.models.Passwords;
import com.stockmarket.loginSignup.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
    private UserService userService;
    
    @GetMapping("/greet/{fn}/{ln}")
    public String greet(@PathVariable String fn, @PathVariable String ln){
    	return "Welcome "+fn+ " "+ln;
    }
    @GetMapping("{id}")
    public Optional<User> getUser(@PathVariable Integer id) {
    	return userService.getUser(id);	
    }
    @GetMapping("")
    public List<User> getUsers(){
    	return userService.getAllUsers();	
    }
    @PostMapping("/login")
    public ResponseEntity<Boolean> getLogin(@RequestBody User user){
        boolean isValid = userService.getLogin(user);
        return new ResponseEntity<Boolean>(isValid, HttpStatus.OK);
    }
    
    @PostMapping("/register")
    public ResponseEntity<Boolean> getSignup(@RequestBody User user){
        boolean u = userService.getSignup(user);
        return new ResponseEntity<Boolean>(u, HttpStatus.OK);
    }
    @PostMapping("{userId}/contact")
    public ResponseEntity<Boolean> addContact(@RequestBody Contact contact, @PathVariable Integer userId){
    	boolean idAdded = userService.addContact(userId, contact);
    	return new ResponseEntity<Boolean>(idAdded, HttpStatus.OK);
    }
    @PutMapping("{userId}/updatePassword")
    public String updatePassword(@RequestBody Passwords passwords, @PathVariable Integer userId){
    	return userService.updatePassword(passwords, userId);
    }
    @PutMapping("{userId}/updateContact")
    public String updateContact(@RequestBody Contact contact, @PathVariable Integer userId) {
    	return userService.updateContact(contact, userId);
    }
}
