package com.processmining.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.processmining.entity.User;
import com.processmining.service.IManagerService;


/**
 * 管理员功能业务实现
 * @author hxuhao
 *
 */
@Service
public class ManagerServiceImpl implements IManagerService {

	@Override
	public int banUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int unbanUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
