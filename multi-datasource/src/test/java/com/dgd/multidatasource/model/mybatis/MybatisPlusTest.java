package com.dgd.multidatasource.model.mybatis;

import com.dgd.multidatasource.model.mybatis.entity.User;
import com.dgd.multidatasource.model.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:39
 * @description : MybatisPlus 功能测试
 */
@SpringBootTest
public class MybatisPlusTest
{
    @Autowired
    UserMapper userMapper;
    @Test
    void userTest()
    {
        User user = userMapper.selectById(2L);
        Assertions.assertNotNull(user);
        Assertions.assertEquals("小飞飞", user.getUserName(), "用户名不正确");
        System.out.println("查询结果:" + user);
    }
}
