package com.dgd.bcp.bizevent.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2020年08月11日 10:57
 * @description :
 */
@Document(collection = "biz_rule_result_log")
@Data
@CompoundIndexes({ @CompoundIndex(name = "biz_event_index", def = "{'bizType' : 1, 'bizKey': 1,'checkStatus':1}") })
public class BizRuleResultLog implements Serializable
{
    private static final long serialVersionUID = -1450486025002879659L;

    @Id
    private String id;

    /**
     * 默认七天后删除
     */
    @Field
    @Indexed(name = "createdTimeExpireIndex", expireAfterSeconds = 3600 * 24 * 7)
    private Date createdTime;

    /**
     * 业务类型
     */
    private String bizType;

    /**
     * 业务主键
     */
    private String bizKey;

    /**
     * 描述
     */
    private String desc;

    /**
     * 业务检查状态：1 表示正常结果，-1 表示不符合预期
     */
    private String checkStatus;
}
