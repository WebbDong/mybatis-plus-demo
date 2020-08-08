package com.mybatisplus.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mybatisplus.demo.consts.DBDataSourceNameConsts;
import com.mybatisplus.demo.model.domain.Product;
import com.mybatisplus.demo.mapper.ProductMapper;
import com.mybatisplus.demo.service.ProductService;
import com.mybatisplus.demo.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-08
 */
@Service
@DS(DBDataSourceNameConsts.SLAVE_1)
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper, Product> implements ProductService {

}
