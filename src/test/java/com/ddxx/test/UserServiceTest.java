package com.ddxx.test;

import java.util.List;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ddxx.model.Score;
import com.ddxx.model.Student;
import com.ddxx.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml", "classpath*:spring-mybatis.xml" })
public class UserServiceTest {
	private static final Logger logger = Logger.getLogger(UserServiceTest.class);

	@Autowired
	private UserServiceI userService;

	@Test
	public void test01() {
		Student student = userService.getStudentByNo(1);
		logger.info(JSON.toJSONStringWithDateFormat(student, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test02() {
		List<Score> list = userService.getScoreList();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
		Executors.newFixedThreadPool(3);
	}
}
