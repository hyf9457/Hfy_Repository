package com.he.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}

}
