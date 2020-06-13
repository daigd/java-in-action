package com.dgd.multidatasource.shardingsphere;

import com.dgd.multidatasource.model.mybatis.entity.Order;
import com.dgd.multidatasource.model.mybatis.entity.User;
import com.dgd.multidatasource.model.mybatis.mapper.OrderMapper;
import com.dgd.multidatasource.model.mybatis.mapper.UserMapper;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 17:05
 * @description : 数据源切换功能验证
 */
@SpringBootTest
public class DatasourceRoutingTest
{
    @Autowired
    UserMapper userMapper;
    
    @Autowired
    OrderMapper orderMapper;

    @Test
    void test()
    {
        HintManager hintManager = HintManager.getInstance();
        // 分库不分表情况下，强制路由至某一个分库时，可使用hintManager.setDatabaseShardingValue方式添加分片
        // 通过此方式添加分片键值后，将跳过SQL解析和改写阶段，从而提高整体执行效率。
        // 详情参考：
        // https://shardingsphere.apache.org/document/legacy/4.x/document/cn/manual/sharding-jdbc/usage/hint/
        hintManager.setDatabaseShardingValue(DatasourceType.DATASOURCE_USER.toString());
        // 访问用户数据源
        User user = userMapper.selectById(2L);
        Assertions.assertNotNull(user);
        Assertions.assertEquals("小飞飞", user.getUserName(), "用户名不正确");
        System.out.println("用户查询结果:" + user);
        hintManager.close();

        hintManager.setDatabaseShardingValue(DatasourceType.DATASOURCE_ORDER.toString());
        // 访问订单数据源
        Order order = orderMapper.selectById(1L);
        Assertions.assertNotNull(order);
        Assertions.assertEquals("北京市朝阳区", order.getAddress(), "地址不正确");
        System.out.println("订单查询结果:" + order);
        hintManager.close();
    }
}
