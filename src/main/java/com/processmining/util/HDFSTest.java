package com.processmining.util;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;

import org.apache.hadoop.hdfs.client.HdfsUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;
import com.processmining.util.fs.HDFSOperator;


public class HDFSTest {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		//IRawLogService logService = (IRawLogService) ac.getBean("rawLogServiceImpl");
		
		HDFSOperator hdfs = (HDFSOperator) ac.getBean("hdfsUtil");
		FileInputStream input = new FileInputStream(new File("F:\\log examples\\eventlog.xes"));
		RawLog record = new RawLog();
		record.setCreatorid(1);
		record.setFormat("xes");
		record.setIsshared(true);
		record.setName("rawlog_event.xes");
		//logService.uploadLog(input, record);
		String hdfsPath = "/processmining/eventlog/"+UUID.randomUUID();
		hdfs.uploadFile(input, hdfsPath);
		input.close();

		System.out.println("fin");

		ac.close();
	}
}
