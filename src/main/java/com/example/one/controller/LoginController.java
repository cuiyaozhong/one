package com.example.one.controller;

import com.example.one.bean.UserBean;
import com.example.one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 崔耀中
 * @since 2020-05-17
 */
@Controller
public class LoginController {
    //将service注入web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if (userBean != null){
            return "success";
        }else {
            return "error";
        }
    }
}
