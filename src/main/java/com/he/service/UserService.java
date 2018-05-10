package com.he.service;

import com.he.domain.User;

/*
 * 
 * function:UserService接口类
 * 
 * @author hfy9457
 * @since 2018.05.10
 * 
 * 
 * 
 */
public interface UserService {
	User selectUserById(Integer userId);
}
