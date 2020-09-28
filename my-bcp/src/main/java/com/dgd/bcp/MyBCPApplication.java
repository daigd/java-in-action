package com.dgd.bcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 13:17
 * @description : 启动类
 */
@SpringBootApplication(scanBasePackages = { "com.dgd.bcp" })
public class MyBCPApplication
{

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBCPApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(MyBCPApplication.class, args);
        LOGGER.info("=================SpringBoot Demo 项目 启动完成=================");
    }
}
