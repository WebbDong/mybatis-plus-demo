package com.mybatisplus.demo.mapper;

import com.mybatisplus.demo.base.MyBaseMapper;
import com.mybatisplus.demo.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-06
 */
@Mapper
public interface UserMapper extends MyBaseMapper<User> {

    int notLogicDeleteById(@Param("id") Serializable id);

    List<User> selectAll();

}
