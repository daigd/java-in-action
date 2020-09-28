package com.dgd.bcp.core;

/**
 * @author : DaiGD
 * @createtime :  2020年08月07日 17:07
 * @description : 结果处理器
 */
public interface ResultHandler
{
    /**
     * 执行结果处理逻辑
     * @param context
     */
    void handle(Context context);
}
