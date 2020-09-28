package com.dgd.bcp.constant;

import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年08月13日 11:03
 * @description : 业务类型常量
 */
@Getter
public enum BizType
{
    PAYMENT("payment", "支付业务"),
    ORDER("order", "订单业务"),
    USER("user", "用户业务"),
    ;

    private String code;

    private String desc;

    BizType(String code, String desc)
    {
        this.code = code;
        this.desc = desc;
    }
}
