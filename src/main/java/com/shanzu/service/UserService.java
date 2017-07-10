package com.shanzu.service;

import com.shanzu.model.User;

import java.util.List;

/**
 * Created by markee on 2016/11/1.
 */
public interface UserService {

    public boolean add(User user);

    public List<User> findAll();
}
