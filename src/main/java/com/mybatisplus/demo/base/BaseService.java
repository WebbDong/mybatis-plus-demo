package com.mybatisplus.demo.base;

import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * Base Service接口
 * @param <D> 实体类
 */
public interface BaseService<D> extends IService<D> {

    /**
     * 根据id查询，忽略逻辑删除
     * @param id
     * @return
     */
    D getByIdIgnoreLogicDeleted(Serializable id);

}
