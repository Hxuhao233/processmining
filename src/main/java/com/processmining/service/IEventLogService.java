package com.processmining.service;

import java.util.List;

import com.processmining.entity.EventLog;
import com.processmining.entity.OriginalLog;

public interface IEventLogService {
	
	List<OriginalLog> listAll();
	int create(EventLog log);
	int delete(List<Integer> elogId);					// 允许批量删除
	int merge();						// 融合
	
}
