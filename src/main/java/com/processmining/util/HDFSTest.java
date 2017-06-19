package com.processmining.util;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.util.fs.HDFSOperator;


public class HDFSTest {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-hdfs.xml");
		HDFSOperator hdfs = (HDFSOperator) ac.getBean("hdfsUtil");
		hdfs.createDirectory("/processmining");
		hdfs.createDirectory("/processmining/eventlog");
		hdfs.createDirectory("/processmining/rawlog");
		hdfs.createDirectory("/processmining/normlog");
		ac.close();
	}
}
