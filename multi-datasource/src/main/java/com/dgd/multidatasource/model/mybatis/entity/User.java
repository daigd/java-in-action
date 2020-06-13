package com.dgd.multidatasource.model.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:33
 * @description : 用户表
 */
@Data
@TableName("`user`")
public class User implements Serializable
{
    private Long id;
    
    private String userName;
}
