package com.processmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.processmining.service.IRawLogService;

/**
 * 日志管理--原始日志功能控制器
 * @author hxuhao
 *
 */

@Controller
public class OriginalLogController {
	
	@Autowired
	private IRawLogService originalLogService; 
	
	
	
}
