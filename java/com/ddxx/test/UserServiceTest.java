package com.ddxx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ddxx.model.User;
import com.ddxx.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml", "classpath*:spring-mybatis.xml" })
public class UserServiceTest {

	private UserServiceI userService;

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test01() {
		User user = userService.getUserById(1);
		System.out.println(user.getUsername());
	}
}
