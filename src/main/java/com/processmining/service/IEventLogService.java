package com.processmining.service;

import java.util.List;

import com.processmining.entity.EventLog;

public interface IEventLogService {
	
	List<EventLog> listAll();
	int create(EventLog log);
	int delete(List<Integer> elogId);					// 允许批量删除
	int merge();										// 融合
	
}
