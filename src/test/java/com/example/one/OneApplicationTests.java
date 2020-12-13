package com.example.one;

import com.example.one.bean.UserBean;
import com.example.one.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("one","one");
        System.out.println("该用户的id为：");
        System.out.println(userBean.getId());
    }

}
