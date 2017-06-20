package com.processmining.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.processmining.service.IEventLogService;

/**
 * 日志管理--事件日志功能控制器
 * @author hxuhao
 *
 */
public class EventLogController {
	
	@Autowired
	private IEventLogService eventLogService;
	
}
