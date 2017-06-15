package com.processmining.service;

import com.processmining.entity.User;

/**
 * 用户管理业务层
 * @author hxuhao
 *
 */
public interface IUserSerivce {
	public int register(User user);
	public int login(User user);
	public int updatePassword(User user);
	public int updateNickName(User user);
	public int activate(User user);
}
