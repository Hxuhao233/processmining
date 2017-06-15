package com.processmining.service;

import java.util.List;

import com.processmining.entity.OriginalLog;
import com.processmining.entity.StandardizedLog;

public interface IStandardizedLogSerivce {
	
	List<StandardizedLog> listAll();
	int create(StandardizedLog log);
	int delete(List<Integer> sLogId);										// 允许批量删除
	int convertToEventLog(StandardizedLog slog);							// 事件化

}
