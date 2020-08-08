package com.mybatisplus.demo.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

public interface MyBaseMapper<D> extends BaseMapper<D> {

    /**
     * 根据id查询，忽略逻辑删除
     * @param id
     * @return
     */
    D getByIdIgnoreLogicDeleted(@Param("id") Serializable id);

}
