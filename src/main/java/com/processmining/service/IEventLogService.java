package com.processmining.service;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import org.deckfour.xes.model.XLog;

import com.processmining.entity.EventLog;

public interface IEventLogService {
	
	public List<EventLog> listAll();
	public int create(EventLog log);
	public int delete(List<Integer> elogId);						// 批量删除
	
	
	/**
	 * 日志融合
	 * @param file1 		原事件日志1
	 * @param file2 		原事件日志2
	 * @param mergeAlogId 	算法id
	 * @param param 		算法参数
	 * @return 				融合后的事件日志
	 * 
	 */
	XLog merge(XLog file1,XLog file2,int mergeAlgoId,Map<String,Object> param);			
	
	
	/**
	 * 流程挖掘
	 * @param file 				事件日志
	 * @param miningAlogId 		挖掘算法id
	 * @param param		    	算法参数
	 * @return
	 */
	/*
	public HeuristicsNet mining(XLog file,int miningAlogId,Map<String,Object> param);
	*/
	
	/**
	 * 上传
	 * @param rawLog 日志文件流
	 * @return	hdfsId
	 */
	public String uploadEventLog(FileInputStream eventLog);
	
	/**
	 * 下载
	 * @param name 日志文件名
	 * @return	日志文件输出流
	 */
	public FileInputStream downloadEventLog(String name);
	XLog merge(XLog file1, XLog file2);

	
	
}
