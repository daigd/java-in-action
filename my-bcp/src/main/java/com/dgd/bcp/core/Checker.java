package com.dgd.bcp.core;

/**
 * @author : DaiGD
 * @createtime :  2020年08月07日 17:06
 * @description : 校验器
 */
public interface Checker
{
    /**
     * 执行业务校验逻辑
     * @param context
     */
    void check(Context context);
}
