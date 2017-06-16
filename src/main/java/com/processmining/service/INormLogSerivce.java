package com.processmining.service;

import java.util.List;

import com.processmining.entity.NormLog;

public interface INormLogSerivce {
	
	List<NormLog> listAll();
	int create(NormLog log);
	int delete(List<Integer> sLogId);										// 允许批量删除
	int convertToEventLog(NormLog slog);									// 事件化

}
