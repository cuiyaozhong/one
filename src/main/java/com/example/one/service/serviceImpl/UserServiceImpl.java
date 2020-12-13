package com.example.one.service.serviceImpl;

import com.example.one.bean.UserBean;
import com.example.one.mapper.UserMapper;
import com.example.one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 崔耀中
 * @since 2020-05-17
 */
@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password){
        return userMapper.getInfo(name,password);
    }

}
