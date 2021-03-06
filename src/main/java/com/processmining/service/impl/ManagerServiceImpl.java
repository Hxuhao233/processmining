package com.processmining.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processmining.dao.AlgoMapper;
import com.processmining.dao.AlgoParamMapper;
import com.processmining.dao.UserMapper;
import com.processmining.entity.User;
import com.processmining.service.IManagerService;
import com.processmining.util.response.Code;


/**
 * 绠＄悊鍛樺姛鑳戒笟鍔″疄鐜�
 * @author hxuhao
 *
 */
@Service
public class ManagerServiceImpl implements IManagerService {

	
	
	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private AlgoMapper AlgoDao;
	
	@Autowired
	private AlgoParamMapper AlgoParamDao;
	
	
	
	@Override
	public int banUser(int userId) {
		// TODO Auto-generated method stub
		User u=userDao.selectByPrimaryKey(userId);
		if(u==null){
			return Code.SYSTEM_ERROR;
		}else{
			u.setBanned(true);
			return userDao.updateByPrimaryKey(u)==1?Code.SUCCEED:Code.SYSTEM_ERROR;
		}

	}

	@Override
	public int unbanUser(int userId) {
		User u=userDao.selectByPrimaryKey(userId);
		if(u==null){
			return Code.SYSTEM_ERROR;
		}else{
			u.setBanned(false);
			return userDao.updateByPrimaryKey(u)==1?Code.SUCCEED:Code.SYSTEM_ERROR;
		}

	}

	@Override
	public int deleteUser(int userId) {
		return userDao.deleteByPrimaryKey(userId)==1?Code.SUCCEED:Code.SYSTEM_ERROR;
	}

	@Override
	public List<User> listAllUsers() {

		return userDao.selectAll();
	}

	@Override
	public List<User> listAllNormalUser() {
		return userDao.selectAllNormalUser();

	}
	
}
