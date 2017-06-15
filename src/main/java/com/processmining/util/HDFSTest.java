package com.processmining.util;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HDFSTest {
	public static void main(String[] args) throws IllegalArgumentException, IOException{
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-hdfs.xml");
		HDFSUtil hdfs = (HDFSUtil) ac.getBean("hdfsUtil");
		System.out.println(hdfs.exits("/user"));
		hdfs.createDirectory("/pm2");
	}
}
