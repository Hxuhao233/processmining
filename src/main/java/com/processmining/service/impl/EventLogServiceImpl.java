package com.processmining.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import org.deckfour.xes.model.XLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processmining.dao.EventLogMapper;
import com.processmining.dao.NormLogToEventLogMapper;
import com.processmining.entity.EventLog;
import com.processmining.service.IEventLogService;
import com.processmining.util.fs.HDFSOperator;


/**
 * 事件日志管理业务层
 * @author hxuhao
 * 
 */
@Service
public class EventLogServiceImpl implements IEventLogService{

	
	@Autowired
	private EventLogMapper eventLogDao;
	
	@Autowired
	private HDFSOperator hdfs;
	
	@Autowired
	private NormLogToEventLogMapper normLogToEventLogDao;
	
	@Override
	public List<EventLog> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(EventLog log) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<Integer> elogId) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public XLog merge(XLog file1, XLog file2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uploadEventLog(FileInputStream eventLog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileInputStream downloadEventLog(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XLog merge(XLog file1, XLog file2, int mergeAlgoId, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	@Override
	public HeuristicsNet mining(XLog file, int miningAlogId, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
