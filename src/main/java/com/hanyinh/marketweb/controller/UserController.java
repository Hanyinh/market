package com.hanyinh.marketweb.controller;

import com.hanyinh.marketweb.model.entity.User;
import com.hanyinh.marketweb.model.vo.TestVO;
import com.hanyinh.marketweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 没什么用的 测试用的
     * @param testVO
     * @return
     */
    @PostMapping("/insert")
    @ResponseBody
    public String insert(TestVO testVO) {
        System.out.println("用户名: " + testVO.getUsername() + "密码：" + testVO.getPassword());
        return "insert方法访问成功!";
    }

    /**
     * 没什么用的 测试用的
     * @param testVO
     * @return
     */
    @GetMapping("/get")
    public String get(TestVO testVO) {
        System.out.println("用户名: " + testVO.getUsername() + "密码：" + testVO.getPassword());
        return "get方法访问成功!";
    }

}
