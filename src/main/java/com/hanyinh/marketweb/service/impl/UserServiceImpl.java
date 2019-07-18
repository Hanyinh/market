package com.hanyinh.marketweb.service.impl;

import com.hanyinh.marketweb.dao.UserDao;
import com.hanyinh.marketweb.pojo.entity.User;
import com.hanyinh.marketweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 用户Service实现
 * @Author Hanyinh
 * @Date 2019/7/18 8:38
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 查找用户列表
     * @return
     */
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
