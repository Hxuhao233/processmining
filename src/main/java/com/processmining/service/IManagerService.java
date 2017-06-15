package com.processmining.service;

import java.util.List;

import com.processmining.entity.User;
/**
 * 管理员功能业务层
 * @author hxuhao
 *
 */
public interface IManagerService {
	int banUser(int userId);
	int unbanUser(int userId);
	int deleteUser(int userId);
	List<User> listAllUsers();
}
