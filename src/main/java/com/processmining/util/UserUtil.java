package com.processmining.util;

import java.util.List;

import com.processmining.entity.User;

public class UserUtil {
	private List<User> allUser;
	private List<Integer> bannedUserId;

	public UserUtil() {

	}

	public UserUtil(List<User> allUser, List<Integer> bannedUserId) {
		this.allUser = allUser;
		this.bannedUserId = bannedUserId;
	}

	public List<User> getAllUser() {
		return allUser;
	}

	public void setAllUser(List<User> allUser) {
		this.allUser = allUser;
	}

	public List<Integer> getBannedUserId() {
		return bannedUserId;
	}

	public void setBannedUserId(List<Integer> bannedUserId) {
		this.bannedUserId = bannedUserId;
	}

}
