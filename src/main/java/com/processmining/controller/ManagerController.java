package com.processmining.controller;

<<<<<<< HEAD
import com.fasterxml.jackson.databind.JavaType;

import java.util.ArrayList;
=======
>>>>>>> 0f9d0d729dd590001da30d8de7cf2e04d5337cab
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD
import com.processmining.entity.User;
import com.processmining.service.IManagerService;
import com.processmining.util.Code;
import com.processmining.util.IdList;

import com.processmining.util.ResponseData;
import com.processmining.util.UserUtil;
=======
import com.processmining.service.IManagerService;
import com.processmining.util.request.IdList;
import com.processmining.util.response.Code;
import com.processmining.util.response.ResponseData;
>>>>>>> 0f9d0d729dd590001da30d8de7cf2e04d5337cab

/**
 * 管理员功能控制器
 * @author hxuhao
 *
 */

@Controller

@RequestMapping("/manager")

@RequestMapping(value="manager")

public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
	@ResponseBody

	@RequestMapping("/banUser")
	public ResponseData banUser(@RequestBody IdList idlist){
		List<Integer> list=idlist.getIdList();
		for(Integer in:list){
			int status=managerService.banUser(in);
			if(status==Code.SYSTEM_ERROR){
				return new ResponseData(Code.SYSTEM_ERROR);
			}
		}
		return new ResponseData(Code.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping("/unbanUser")
	public ResponseData unbanUser(@RequestBody IdList idlist){
		List<Integer> list=idlist.getIdList();
		for(Integer in:list){
			int status=managerService.unbanUser(in);
			if(status==Code.SYSTEM_ERROR){
				return new ResponseData(Code.SYSTEM_ERROR);
			}
		}
		return new ResponseData(Code.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping("/deleteUser")
	public ResponseData deleteUser(@RequestBody IdList idlist){
		List<Integer> list=idlist.getIdList();
		for(Integer in:list){
			int status=managerService.deleteUser(in);
			if(status==Code.SYSTEM_ERROR){
				return new ResponseData(Code.SYSTEM_ERROR);
			}
		}
		return new ResponseData(Code.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping("/listAllUsers")
	public UserUtil listAllUsers(){
		List<User> user=managerService.listAllNormalUser();
		List<Integer> bannedUserId=new ArrayList<Integer>();
		for(User u:user){
			if(u.getBanned()){
				bannedUserId.add(u.getId());
			}
		}
		return new UserUtil(user,bannedUserId);
	}
}
