package com.dgd.multidatasource.controller;

import com.dgd.multidatasource.model.mybatis.entity.Order;
import com.dgd.multidatasource.model.mybatis.entity.User;
import com.dgd.multidatasource.service.OrderService;
import com.dgd.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 19:17
 * @description : 业务功能控制器
 */
@RestController
public class BusinessController
{
    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/user/{id}")
    public User queryByUserId(@PathVariable Long id)
    {
        return userService.queryById(id);
    }

    @GetMapping("/order/{id}")
    public Order queryByOrderId(@PathVariable Long id)
    {
        return orderService.queryById(id);
    }
}
