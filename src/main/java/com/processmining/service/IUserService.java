package com.processmining.service;

import com.processmining.entity.User;

/**
 * 用户管理业务层
 * @author hxuhao
 *
 */
public interface IUserService {
	public int register(User user);
	public boolean login(User user);
	public int updatePassword(User user,String newPassword);
	public int updateNickName(User user,String newNickname);
	public boolean activate(User user);
	public User getUserById(Integer id);
	public User getUserByEmailAndPassword(User user);

}
