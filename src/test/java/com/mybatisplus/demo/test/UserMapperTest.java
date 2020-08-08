package com.mybatisplus.demo.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.demo.enums.GenderType;
import com.mybatisplus.demo.enums.UserType;
import com.mybatisplus.demo.mapper.UserMapper;
import com.mybatisplus.demo.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testNotLogicDeleteById() {
        int count = userMapper.notLogicDeleteById(1291649831684640770L);
        log.info("删除的记录数量是{}", count);
    }

    @Test
    public void testBatchSave() {
        User entity = new User();
        for (int i = 1; i <= 50; i++) {
            entity.setId(null);
            entity.setUserName("name" + i);
            entity.setPwd("123456" + i);
            entity.setGender(i % 2 == 0 ? GenderType.MALE : GenderType.FEMALE);
            entity.setUserType(i % 2 == 0 ? UserType.MERCHANT : UserType.CUSTOMER);
            userMapper.insert(entity);
        }
    }

    @Test
    public void testSelectAll() {
        List<User> users = userMapper.selectAll();
        log.info("{}", users.size());
    }

    @Test
    public void testSelectPage() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        IPage<User> page = new Page<>();
        page.setCurrent(2);
        page.setSize(20);
        page = userMapper.selectPage(page, queryWrapper);
        log.info("userPage.getRecords().size() = {}", page.getRecords().size());
    }

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1291721057111175170L);
        log.info("user.getUserType().getCode() = {}", user.getUserType().getCode());
        log.info("user.getUserType().getName() = {}", user.getUserType().getName());
    }

}
