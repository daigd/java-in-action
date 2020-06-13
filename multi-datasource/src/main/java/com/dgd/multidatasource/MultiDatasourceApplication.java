package com.dgd.multidatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 13:17
 * @description : 启动类
 */
@SpringBootApplication(scanBasePackages = {"com.dgd.multidatasource"})
@MapperScan("com.dgd.multidatasource.model.mybatis.mapper")
public class MultiDatasourceApplication
{

    private static final Logger LOGGER = LoggerFactory.getLogger(MultiDatasourceApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(MultiDatasourceApplication.class, args);
        LOGGER.info("=================多数据源项目 启动完成=================");
    }
}
