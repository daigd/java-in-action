package com.dgd.multidatasource.model.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dgd.multidatasource.model.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:42
 * @description : 用户表映射接口
 */
@Mapper
public interface UserMapper extends BaseMapper<User>
{
}
