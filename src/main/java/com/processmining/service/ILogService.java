package com.processmining.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.processmining.entity.Log;

/**
 * 日志管理功能 顶层接口
 * @author hxh12
 *
 */
public interface ILogService {
	public boolean uploadLog(InputStream inputStream,Log log) throws Exception;
	
	public InputStream downloadLog(Integer logId) throws Exception;
	
	public Log selectByPK(Integer logId);
	
	public boolean delete(Integer logId) throws IOException;
}
