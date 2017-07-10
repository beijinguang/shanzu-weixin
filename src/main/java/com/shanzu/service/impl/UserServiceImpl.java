package com.shanzu.service.impl;

import com.shanzu.mapper.UserMapper;
import com.shanzu.model.User;
import com.shanzu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by markee on 2016/11/1.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;

    public boolean add(User user) {
        return mapper.insert(user) > 0;
    }

    public List<User> findAll() {
        return mapper.selectByExample(null);
    }
}
