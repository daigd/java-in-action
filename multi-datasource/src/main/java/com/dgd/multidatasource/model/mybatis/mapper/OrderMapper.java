package com.dgd.multidatasource.model.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dgd.multidatasource.model.mybatis.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:43
 * @description : 订单表映射接口
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order>
{
}
