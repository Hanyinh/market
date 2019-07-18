package com.hanyinh.marketweb.controller;

import com.hanyinh.marketweb.model.entity.User;
import com.hanyinh.marketweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 用户Controller
 * @Author Hanyinh
 * @Date 2019/7/18 8:40
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }

}
