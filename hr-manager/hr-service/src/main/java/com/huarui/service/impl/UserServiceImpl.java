package com.huarui.service.impl;

import com.huarui.dao.impl.UserDaoImpl;
import com.huarui.entity.Users;
import com.huarui.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class UserServiceImpl implements UserService {

    private UserDaoImpl userDao;
    @Override
    public List<Users> findall() {
        userDao = new UserDaoImpl();
        return userDao.findall();
    }
}
