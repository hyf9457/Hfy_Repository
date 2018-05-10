package com.he.service;

import com.he.dao.UserDao;
import com.he.domain.User;

/*
 * function:UserService实现类
 * 
 * 
 * 
 * @author hyf9457
 * 
 * @since 2018.05.10 
 */

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	@Override
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}

}
