package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
     // 用户主键
    private Integer id;
    //用户名
    private String username;
    //用户密码
    private String password;
    //用户类型：管理员/租户
    private String type;


}