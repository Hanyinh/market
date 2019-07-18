package com.hanyinh.marketweb.dao;

import com.hanyinh.marketweb.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 用户Dao
 * @Author Hanyinh
 * @Date 2019/7/18 8:30
 */
@Mapper
public interface UserDao {
    /**
     * 查找用户列表
     * @return
     */
    List<User> getUserList();
}
