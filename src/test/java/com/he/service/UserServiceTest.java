package com.he.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.he.baseTest.SpringTestCase;
import com.he.domain.User;

/*
 * function: UserService 单元测试
 *@author hyf9457 
 * 
 * 
 * @since 2018.05.11
 * 
 * 
 */
public class UserServiceTest extends SpringTestCase{
	@Autowired
	private UserService userService;
	Logger logger =Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(4);
		logger.debug("查找结果"+user);
	}
}
