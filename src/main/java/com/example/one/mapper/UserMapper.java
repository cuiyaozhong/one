package com.example.one.mapper;

import com.example.one.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}
