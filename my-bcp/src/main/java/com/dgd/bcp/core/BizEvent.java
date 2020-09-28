package com.dgd.bcp.core;

import java.util.Map;

/**
 * @author : DaiGD
 * @createtime :  2020年08月07日 16:57
 * @description : 业务事件对象，包含执行规则业务主体的关键信息
 */
public interface BizEvent
{
    /**
     * 业务主键，唯一标识业务对象身份，如订单号，优惠券券码
     * @return
     */
    String getBizKey();

    /**
     * 当前业务状态
     * @return
     */
    Integer getBizStatus();

    /**
     * 业务类型，对应业务域，如订单
     * @return
     */
    String getBizType();

    /**
     * 业务事件触发的时间
     * @return
     */
    Long getEventTime();

    /**
     * 业务元数据
     */
    Map<String, String> getBizMetaData();
}
