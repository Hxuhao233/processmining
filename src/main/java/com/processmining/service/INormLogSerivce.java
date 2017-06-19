package com.processmining.service;

import java.io.FileInputStream;
import java.util.List;

import org.deckfour.xes.model.XLog;

import com.processmining.entity.NormLog;

public interface INormLogSerivce {
	
	public List<NormLog> listAll();
	public int create(NormLog log);
	public int delete(List<Integer> sLogId);										// 批量删除
	public XLog convertToEventLog(NormLog normlog);									// 事件化
	
	/**
	 * 上传
	 * @param rawLog 日志文件流
	 * @return	hdfsId
	 */
	public String uploadNormLog(FileInputStream normLog);
	
	/**
	 * 下载
	 * @param name 日志文件名
	 * @return	日志文件输出流
	 */
	public FileInputStream downloadNormLog(String name);

}
