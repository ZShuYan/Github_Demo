package com.fc.dao;

import com.fc.bean.User;

public interface UserMapper {

    //查询用户是否存在
    User login(User user);
}
