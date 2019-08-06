package com.hanyinh.marketweb.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 没有用的 测试用的
 * @Author Hanyinh
 * @Date 2019/7/30 9:32
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TestVO {
    private String username;
    private String password;
}
