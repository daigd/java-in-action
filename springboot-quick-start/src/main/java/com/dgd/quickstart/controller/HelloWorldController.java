package com.dgd.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 14:17
 * @description : HelloWorld 控制器
 */
@RestController
public class HelloWorldController
{
    @GetMapping("/hello/{userName}")
    public String helloWorld(@PathVariable String userName)
    {
        return "Hello:" + userName;
    }
}
