package com.dgd.bcp.constant;

import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年08月17日 13:56
 * @description : 数据库名常量
 */
@Getter
public enum DatabaseSchema
{
    PAY("pay", "支付相关业务"),
    ORDER("order", "商城相关业务"),
    ;

    private String code;

    private String desc;

    DatabaseSchema(String code, String desc)
    {
        this.code = code;
        this.desc =desc;
    }
}
