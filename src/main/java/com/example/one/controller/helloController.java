package com.example.one.controller;

import com.example.one.bean.UserBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author 崔耀中
 * @since 2020-05-15
 */
@Api
@RestController
public class helloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @PostMapping("/hello")
    public UserBean hello(){
        System.out.println("124");
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setName("张三");
        userBean.setPassword("123456");
        return userBean;
    }

    @ApiOperation("Hello Spring Boot 方法")
    @GetMapping("/helloSwager")
    public String hello(@RequestParam(required = false) @ApiParam("名字") String name) {
        if (name != null && !"".equals(name)) {
            return "Hello " + name;
        }
        return "Hello Spring Boot";
    }
}
