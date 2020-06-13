package com.dgd.multidatasource.service;

import com.dgd.multidatasource.model.mybatis.entity.User;
import com.dgd.multidatasource.model.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 19:14
 * @description : 用户服务方法
 */
@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    public User queryById(long id)
    {
        return userMapper.selectById(id);
    }
}
