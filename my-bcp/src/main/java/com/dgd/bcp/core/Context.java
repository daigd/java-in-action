package com.dgd.bcp.core;

/**
 * @author : DaiGD
 * @createtime :  2020年08月07日 16:54
 * @description : 执行规则需要的上下文环境
 */
public interface Context
{
    /**
     * 执行规则的业务事件对象 
     * @return
     */
    BizEvent getBizEvent();
}
