package com.processmining.service;

import java.util.List;

import com.processmining.entity.OriginalLog;


/**
 * 原始日志业务层
 * @author hxuhao
 *
 */
public interface IOriginalLogService {
	
	List<OriginalLog> listAll();
	int create(OriginalLog log);
	int delete(List<Integer> ologId);					// 允许批量删除
	int convertToStandardizedLog();						// 规范化
	
}
