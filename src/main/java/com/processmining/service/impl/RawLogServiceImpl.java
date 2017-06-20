package com.processmining.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.processmining.dao.NormLogMapper;
import com.processmining.dao.NormLogToEventLogMapper;
import com.processmining.dao.RawLogMapper;
import com.processmining.dao.RawLogToNormLogMapper;
import com.processmining.dao.RawlogToEventLogMapper;
import com.processmining.dao.UserMapper;
import com.processmining.entity.Log;
import com.processmining.entity.NormLogToEventLog;
import com.processmining.entity.RawLog;
import com.processmining.entity.RawLogToNormLog;
import com.processmining.entity.RawlogToEventLog;
import com.processmining.service.IRawLogService;
import com.processmining.util.fs.HDFSOperator;
/**
 * 原始日志业务层实现
 * @author hxuhao
 *
 */
@Service
public class RawLogServiceImpl implements IRawLogService{
	

	private static final String PATH_PREFIX = "/processmining/rawlog/";
	
	@Autowired
	private RawLogToNormLogMapper rawLogToNormLogDao;
	
	@Autowired
	private RawlogToEventLogMapper rawLogToEventLogDao; 
	
	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private RawLogMapper rawlogDao;
	
	@Autowired
	private NormLogMapper normLogDao;
	
	@Autowired
	private HDFSOperator hdfs;


	@Override
	public boolean uploadLog(InputStream input,Log log) throws Exception {
		
		String hdfsId = hdfs.uploadFile(input, PATH_PREFIX);
		log.setHdfsid(hdfsId);
		int ret = rawlogDao.insertSelective((RawLog)log);
		
		if(ret==1){
			return true;
		}
		return false;
	}

	@Override
	public InputStream downloadLog(Integer logId) throws Exception {
		RawLog record = rawlogDao.selectByPrimaryKey(logId);
		InputStream input = hdfs.downloadFile(PATH_PREFIX+record.getHdfsid());
		return input;
	}

	@Override
	public boolean delete(Integer logId) throws IOException {
		RawLog rawlog = rawlogDao.selectByPrimaryKey(logId);
		if(rawlog!=null){
			
			// 从HDFS中删除
			hdfs.deleteFile(PATH_PREFIX+rawlog.getHdfsid(),false);
		
			Integer rawlogId = rawlog.getId();
			// 删除与规范化日志的联系
			rawLogToNormLogDao.deleteByPrimaryKey(rawlogId);
			
			// 删除与事件日志的联系
			rawLogToEventLogDao.deleteByPrimaryKey(rawlogId);
			
			// 删除本条记录
			rawlogDao.deleteByPrimaryKey(rawlogId);
			return true;
		}
		
		
		return false;
	}

	@Override
	public File convertToNormLog(String path, String id, String formats, String timeNames, String dataNames,
			String oriitemSeparator, String orinameValSeparator, String orinulVal, String targetitemSeparator,
			String targetnameValSeparator, String targetnulVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Log selectByPK(Integer logId) {
		
		RawLog rawlog = rawlogDao.selectByPrimaryKey(logId);
		// 查询上传者
		rawlog.setCreator(userDao.selectByPrimaryKey(rawlog.getCreatorid()).getNickname());
		
		// 时间对象转换字符串
		DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
		rawlog.setCreateTime(format);
		
		Integer rawLogId = rawlog.getId();
		// 查询其对应的规范化日志
		RawLogToNormLog toNormLog = rawLogToNormLogDao.selectByNormLogId(rawLogId);
		if(toNormLog!=null){
			rawlog.setToNormLogId(toNormLog.getNormalizedlogid());
			rawlog.setToNormLogName(toNormLog.getNormalizedlogname());
		}
		
		// 查询其对应的事件日志
		RawlogToEventLog toEventLog = rawLogToEventLogDao.selectByRawLogId(rawLogId);
		if(toEventLog!=null){
			rawlog.setToEventLogId(toEventLog.getEventlogid());
			rawlog.setToEventLogName(toEventLog.getEventlogname());
		}
		
		return rawlog;
	}

	
	
	@Override
	public PageInfo<RawLog> searchByName(int pageNum, int pageSize,String info) {
		
		PageHelper.startPage(pageNum,pageSize);
		List<RawLog> logList ;
		if(info==null){
			logList = rawlogDao.selectAll();
		}else{
			logList = rawlogDao.selectByName(info);
		}
		DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
		for(RawLog rawlog : logList){
			// 查询上传者昵称
			String creator = userDao.selectByPrimaryKey(rawlog.getCreatorid()).getNickname();
			rawlog.setCreator(creator);
			
			// 时间对象转换字符串
			rawlog.setCreateTime(format);
			
			Integer rawLogId = rawlog.getId();
			// 查询其对应的规范化日志
			RawLogToNormLog toNormLog = rawLogToNormLogDao.selectByNormLogId(rawLogId);
			if(toNormLog!=null){
				rawlog.setToNormLogId(toNormLog.getNormalizedlogid());
				rawlog.setToNormLogName(toNormLog.getNormalizedlogname());
			}
			
			// 查询其对应的事件日志
			RawlogToEventLog toEventLog = rawLogToEventLogDao.selectByRawLogId(rawLogId);
			if(toEventLog!=null){
				rawlog.setToEventLogId(toEventLog.getEventlogid());
				rawlog.setToEventLogName(toEventLog.getEventlogname());
			}
		}
		PageInfo<RawLog> logListWithPage = new PageInfo<RawLog>(logList);
		return logListWithPage;

	}



}
