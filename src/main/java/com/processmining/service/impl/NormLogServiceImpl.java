package com.processmining.service.impl;

import java.util.List;

import com.processmining.dao.NormLogMapper;
import com.processmining.dao.NormLogToEventLogMapper;
import com.processmining.dao.RawLogToNormLogMapper;
import com.processmining.entity.NormLog;
import com.processmining.service.INormLogSerivce;

public class NormLogServiceImpl implements INormLogSerivce{
	
	
	private NormLogMapper normLogDao;
	
	private RawLogToNormLogMapper rawLogToNormLogDao;
	
	private NormLogToEventLogMapper normLogToEventLogDao;

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
	public int convertToEventLog(NormLog slog) {
		// TODO Auto-generated method stub
		return 0;
	}

}
