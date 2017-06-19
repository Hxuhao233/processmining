package com.processmining.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processmining.dao.MergeAlgoMapper;
import com.processmining.dao.MergeAlgoParamMapper;
import com.processmining.dao.MiningAlgoMapper;
import com.processmining.dao.MiningAlgoParamMapper;
import com.processmining.dao.UserMapper;
import com.processmining.entity.User;
import com.processmining.service.IManagerService;


/**
 * 管理员功能业务实现
 * @author hxuhao
 *
 */
@Service
public class ManagerServiceImpl implements IManagerService {

	
	
	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private MergeAlgoParamMapper mergeAlgoParamDao;
	
	@Autowired
	private MergeAlgoMapper mergeAlgoDao;
	
	@Autowired
	private MiningAlgoMapper miningAlgoDao;
	
	@Autowired
	private MiningAlgoParamMapper miningAlgoParamDao;
	
	
	
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
