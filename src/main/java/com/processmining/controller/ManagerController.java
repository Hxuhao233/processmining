package com.processmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.processmining.service.IManagerService;

/**
 * 管理员功能控制器
 * @author hxuhao
 *
 */

@Controller
public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
}
