package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    List<User> getAllUser();

    //getting single user
    User getUser(String userId);
}
