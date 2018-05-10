package com.he.dao;

import com.he.domain.User;

/*
 * 
 *function:User的DAO类 
 * 
 * 
 * 
 * @author hyf9457
 * @since 2018.05.10
 * 
 * 
 */
public interface UserDao {
	public User selectUserById(Integer userId);
}
