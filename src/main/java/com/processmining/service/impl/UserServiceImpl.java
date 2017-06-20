package com.processmining.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.processmining.config.PMConfig;
import com.processmining.dao.UserMapper;
import com.processmining.entity.User;
import com.processmining.service.IUserService;
import com.processmining.util.Code;
import com.processmining.util.EncodeUtil;

/**
 * 用户管理业务层实现
 * @author hxuhao
 *
 */

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userDao;
	
	@Override
	public int register(User user) {
		boolean isExistEmail=userDao.isExistEmail(user.getEmail());
		boolean isExistNickname=userDao.isExistNickname(user.getNickname());
		if(isExistEmail){
			return Code.OCCUPIED_EMAIL;
		}else if(isExistNickname){
			return Code.OCCUPIED_NICKNAME;
		}
		else{
			//user.setActivated(false);
			String pwd=user.getPassword();
			user.setPassword(EncodeUtil.string2MD5(pwd+PMConfig.SALT));
			return userDao.insertSelective(user)==1?Code.SUCCESS:Code.SYSTEM_ERROR;
		}
	}

	@Override
	public boolean login(User user) {
		String pwd=user.getPassword();
		user.setPassword(EncodeUtil.string2MD5(pwd+PMConfig.SALT));
		User u=userDao.selectByEmailAndPassword(user);
		//如果返回的u不为null，u没有被封，u被激活
		if(u==null){
			return false;
		}
		return !u.getBanned()||u.getActivated()?true:false;
	}

	@Override
	public int updatePassword(User user,String newPassword) {
		user.setPassword(EncodeUtil.string2MD5(newPassword+PMConfig.SALT));
		return userDao.updateByPrimaryKey(user)==1?Code.SUCCESS:Code.SYSTEM_ERROR;
	}

	@Override
	public int updateNickName(User user,String newNickname) {
		user.setNickname(newNickname);
		return userDao.updateByPrimaryKey(user)==1?Code.SUCCESS:Code.SYSTEM_ERROR;
	}

	@Override
	public boolean activate(User user) {
		user.setActivated(true);
		return userDao.updateByPrimaryKey(user)==1?true:false;
	}
	
	public User getUserById(Integer id){
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public User getUserByEmailAndPassword(User user) {
		return userDao.selectByEmailAndPassword(user);
	}
}
