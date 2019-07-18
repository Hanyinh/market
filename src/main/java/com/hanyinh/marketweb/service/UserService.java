package com.hanyinh.marketweb.service;

import com.hanyinh.marketweb.pojo.entity.User;

import java.util.List;

/**
 * @Description: 用户Service接口
 * @Author Hanyinh
 * @Date 2019/7/18 8:34
 */
public interface UserService {
    /**
     * 查找用户列表
     * @return
     */
    List<User> getUserList();
}
