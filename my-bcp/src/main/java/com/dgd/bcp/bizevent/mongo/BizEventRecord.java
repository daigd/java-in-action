package com.dgd.bcp.bizevent.mongo;

import com.dgd.bcp.bizevent.bean.BizEventBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2020年08月10日 16:35
 * @description : 业务事件记录
 */
@Document(collection = "biz_event_record")
@CompoundIndexes({ @CompoundIndex(name = "biz_event_index", def = "{'bizType' : 1, 'bizKey': 1,'bizStatus':1}") })
@EqualsAndHashCode(callSuper = true) 
@Data
// 在数据库上创建索引
// db.getCollection('biz_event_record').ensureIndex({bizKey:1, bizStatus:1,bizType:1},{backgroud:true})
public class BizEventRecord extends BizEventBean
{
    private static final long serialVersionUID = -2706851445846130902L;

    @Id
    private String id;
    /**
     * 默认七天后删除
     */
    @Field
    @Indexed(name = "createdTimeExpireIndex", expireAfterSeconds = 3600 * 24 * 7)
    private Date createdTime;

}
