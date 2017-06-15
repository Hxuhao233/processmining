package com.processmining.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.processmining.entity.EventLog;
import com.processmining.entity.OriginalLog;
import com.processmining.service.IEventLogService;

/**
 * 事件日志管理业务层
 * @author hxuhao
 * 
 */
@Service
public class EventLogServiceImpl implements IEventLogService{

	@Override
	public List<OriginalLog> listAll() {
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
	public int merge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
