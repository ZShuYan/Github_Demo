package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.dao.UserMapper;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        User isUser = userMapper.login (user);
        return isUser;
    }
}

