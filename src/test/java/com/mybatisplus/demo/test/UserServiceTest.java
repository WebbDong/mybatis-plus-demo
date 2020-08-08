package com.mybatisplus.demo.test;

import com.mybatisplus.demo.enums.GenderType;
import com.mybatisplus.demo.model.domain.User;
import com.mybatisplus.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSave() {
        User entity = new User();
        entity.setPwd("456789");
        entity.setUserName("name2");
        entity.setGender(GenderType.MALE);
        userService.save(entity);
        log.info("id = {}", entity.getId());
    }

    @Test

    public void testGetById() {
        User user = userService.getById(1291739036980985858L);
        log.info("user = {}", user);
    }

    @Test
    public void testGetByIdIgnoreLogicDeleted() {
        User user = userService.getByIdIgnoreLogicDeleted(1291646746115461121L);
        log.info(user.toString());
    }

}
