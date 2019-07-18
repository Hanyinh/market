package com.hanyinh.marketweb.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: 用户实体
 * @Author Hanyinh
 * @Date 2019/7/18 8:27
 */
@Data
@Accessors(chain = true)
public class User {
    private Integer id;

    private String name;

    private String password;

    private String email;
}
