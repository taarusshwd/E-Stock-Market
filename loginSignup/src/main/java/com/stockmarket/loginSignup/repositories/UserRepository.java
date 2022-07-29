package com.stockmarket.loginSignup.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stockmarket.loginSignup.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
