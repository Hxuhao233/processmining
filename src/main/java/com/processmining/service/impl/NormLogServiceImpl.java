package com.processmining.service.impl;

import java.io.FileInputStream;
import java.util.List;

import org.deckfour.xes.model.XLog;
import org.springframework.beans.factory.annotation.Autowired;

import com.processmining.dao.EventLogMapper;
import com.processmining.dao.NormLogMapper;
import com.processmining.dao.NormLogToEventLogMapper;
import com.processmining.dao.RawLogToNormLogMapper;
import com.processmining.entity.NormLog;
import com.processmining.service.INormLogSerivce;

public class NormLogServiceImpl implements INormLogSerivce{
	
	@Autowired
	private NormLogMapper normLogDao;
	
	@Autowired
	private RawLogToNormLogMapper rawLogToNormLogDao;
	
	@Autowired
	private NormLogToEventLogMapper normLogToEventLogDao;
	
	@Autowired
	private EventLogMapper eventLogDao;

	@Override
	public List<NormLog> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(NormLog log) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<Integer> sLogId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public XLog convertToEventLog(NormLog slog) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public FileInputStream downloadNormLog(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String uploadNormLog(FileInputStream normLog) {
		// TODO Auto-generated method stub
		return null;
	}

}
