package com.dgd.bcp.core;

/**
 * @author : DaiGD
 * @createtime :  2020年08月07日 17:57
 * @description : 解析原始业务数据
 */
public interface Parser<T>
{
    BizEvent parse(T message);
}
