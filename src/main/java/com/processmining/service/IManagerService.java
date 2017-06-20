package com.processmining.service;

import java.util.List;

import com.processmining.entity.User;
/**
 * 管理员功能业务层
 * @author hxuhao
 *
 */
public interface IManagerService {
	public int banUser(int userId);
	public int unbanUser(int userId);
	public int deleteUser(int userId);
	public List<User> listAllUsers();
	public List<User> listAllNormalUser();

}
