package com.mybatisplus.demo.service.impl;

import com.mybatisplus.demo.model.domain.User;
import com.mybatisplus.demo.mapper.UserMapper;
import com.mybatisplus.demo.service.UserService;
import com.mybatisplus.demo.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-07
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
