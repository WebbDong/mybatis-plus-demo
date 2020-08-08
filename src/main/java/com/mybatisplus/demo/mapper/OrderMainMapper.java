package com.mybatisplus.demo.mapper;

import com.mybatisplus.demo.base.MyBaseMapper;
import com.mybatisplus.demo.model.domain.OrderMain;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单主表 Mapper 接口
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-06
 */
@Mapper
public interface OrderMainMapper extends MyBaseMapper<OrderMain> {

}
