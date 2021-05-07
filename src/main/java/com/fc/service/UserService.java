package com.fc.service;

import com.fc.bean.User;

public interface UserService {
    /**
     * 查询用户是否存在
     * @param user
     * @return
     */
    User login(User user);
}
