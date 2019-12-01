package com.zhjie.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhjie.dao.UserDao;
import com.zhjie.pojo.User;
import com.zhjie.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao ;
	@Override
	public User getUser(String userName) throws Exception {
		return userDao.select("userName", userName);
	}

}
