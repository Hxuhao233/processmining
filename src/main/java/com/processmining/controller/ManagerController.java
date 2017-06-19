package com.processmining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.processmining.service.IManagerService;
import com.processmining.util.ResponseData;

/**
 * 管理员功能控制器
 * @author hxuhao
 *
 */

@Controller
@RequestMapping(value="manager")
public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
	@RequestMapping(value="/banUser")
	public ResponseData banUser(@RequestBody List<Integer> idList){
		return null;
		
	}
	
	
	
	
}
