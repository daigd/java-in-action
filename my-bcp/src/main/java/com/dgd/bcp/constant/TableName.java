package com.dgd.bcp.constant;

import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年08月17日 13:54
 * @description : 数据库表名常量
 */
@Getter
public enum TableName
{
    PAY_INFO("pay_info", "支付单表"),
    ORDER_INFO("order_info", "订单表"),
    USER_TAG("user_tag", "用户标签表"),
    
    ;

    private String code;

    private String desc;

    TableName(String code, String desc)
    {
        this.code = code;
        this.desc = desc;
    }
}
