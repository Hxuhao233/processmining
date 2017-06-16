package com.processmining.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;
/**
 * 原始日志业务层实现
 * @author hxuhao
 *
 */
@Service
public class RawLogServiceImpl implements IRawLogService{

	@Override
	public List<RawLog> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(RawLog log) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<Integer> ologId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int convertToStandardizedLog() {
		// TODO Auto-generated method stub
		return 0;
	}

}
