package com.stockmarket.loginSignup.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.loginSignup.entities.Contact;
import com.stockmarket.loginSignup.entities.User;
import com.stockmarket.loginSignup.models.Passwords;
import com.stockmarket.loginSignup.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository repo;

    public boolean getLogin(User user){
    	//user is not null-->check at UI end
//    	Optional<User> userentity = repo.findById(user.getId());
//		if(userentity.isPresent()) {
//            return userentity.get().getPassword().equals(user.getPassword()); 
//		}
//        return false;
    	Iterable<User> iterable = repo.findAll();
		boolean found = false;
		for(User u : iterable) {
            if(u.getUsername().equals(user.getUsername())){
                found = u.getPassword().equals(user.getPassword());
                break;
            }
		}

        return found;
    }
    
	public boolean getSignup(User user) {
		// logic -> user.username != null
//		Optional<User> userentity = repo.findById(user.getId());
//		if(userentity.isPresent()) {
//			return false;
//		}
//		else {
//			repo.save(user);
//			return true;
//		}
		Iterable<User> iterable = repo.findAll();
		boolean found = false;
		for(User u : iterable) {
            if(u.getUsername().equals(user.getUsername())){
                found = true; //user found with same username
                break;
            }
		}
		if(found) {
			return false;
		}
		else {
			repo.save(user);
			return true;
		}
	}

	public boolean addContact(Integer userId, Contact contact) {
		Optional<User> user = repo.findById(userId);
		if(user.isPresent()) {
			(user.get()).setContact(contact);
			repo.save(user.get());
			return true;
		}
		else return false;
	}
	public Optional<User> getUser(Integer id) {
		return repo.findById(id);
	}
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		repo.findAll()
		.forEach(users::add);
		return users;
	}
	public String updatePassword(Passwords password, Integer userId) {
		Optional<User> user = repo.findById(userId);
		if(user.isPresent()) {
			if(user.get().getPassword().equals(password.getOldPassword())){
				user.get().setPassword(password.getNewPassword());
				repo.save(user.get());
				return "Password updated successfully!!";
			}
			else return "Incorrect current password!";
		}
		else {
			return "User is not present";
		}
	}
	public String updateContact(Contact contact, Integer userId) {
		Optional<User> user = repo.findById(userId);
		if(user.isPresent()) {
			user.get().setContact(contact);
			repo.save(user.get());
			return "Contact updated";
		}
		else return "User is not present";
	}
}
