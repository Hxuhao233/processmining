package com.processmining.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processmining.dao.UserMapper;
import com.processmining.entity.User;
import com.processmining.service.IUserSerivce;

/**
 * 用户管理业务层实现
 * @author hxuhao
 *
 */

@Service
public class UserSerivceImpl implements IUserSerivce{
	
	@Autowired
	private UserMapper userDao;
	
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userDao.insertSelective(user);
	}

	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePassword(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateNickName(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int activate(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
