package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user User
     * @param mv  Model对象
     * @param session 会话对象
     * @return
     */
    @RequestMapping("login")
    public String  login(User user, Model mv, HttpSession session){
        //执行登录操作
        User login = userService.login (user);
        if (null!=login) {
            session.setAttribute ("user",login);
            String type="admin";
            if (type.equals (login.getType ())){
                return "admin/main1.jsp";
            }else {
                return "zuke/main.jsp";
            }
        }else {
            // 该用户不存在
            String error = "error";
            mv.addAttribute("error", error);
            // 返回登陆页
            return "login.jsp";
        }
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute ("error");
        //返回登录页面
        return  "login.jsp";
    }
}
