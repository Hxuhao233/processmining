package com.processmining.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processmining.dao.NormLogMapper;
import com.processmining.dao.RawLogMapper;
import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;
import com.processmining.util.fs.HDFSOperator;
/**
 * 原始日志业务层实现
 * @author hxuhao
 *
 */
@Service
public class RawLogServiceImpl implements IRawLogService{
	
	@Autowired
	private RawLogMapper  rawlogDao;
	
	@Autowired
	private NormLogMapper normLogDao;
	
	@Autowired
	private HDFSOperator hdfs;
	
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
	public File convertToNormLog(String path, String id, String formats, String timeNames, String dataNames,
			String oriitemSeparator, String orinameValSeparator, String orinulVal, String targetitemSeparator,
			String targetnameValSeparator, String targetnulVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uploadRawLog(FileInputStream rawLog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileInputStream downloadRawLog(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
