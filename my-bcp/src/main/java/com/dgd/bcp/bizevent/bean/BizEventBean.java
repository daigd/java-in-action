package com.dgd.bcp.bizevent.bean;

import com.dgd.bcp.core.BizEvent;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author : DaiGD
 * @createtime :  2020年08月10日 17:06
 * @description : 业务事件Bean
 */
@Data
public class BizEventBean implements Serializable, BizEvent
{
    private static final long serialVersionUID = -7752578854106717851L;

    private String bizKey;

    private Integer bizStatus;

    private String bizType;

    private Long eventTime;

    /**
     * 存放业务元数据
     */
    private Map<String, String> bizMetaData;
}
