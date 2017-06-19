package com.processmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.processmining.util.fs.HDFSOperator;

@Controller
public class HelloController {
	
	
	@Autowired
	private HDFSOperator hdfsUtil;
	
	
	@RequestMapping("index")
	public String index(){
		System.out.println("index");
		return "index";
	}
	
	
	@ResponseBody
	@RequestMapping("hdfs")
	public String hdfs(){
		String ret="";
		try {
			ret = hdfsUtil.getDirectoryFromHdfs("/pm");
			hdfsUtil.getDirectoryFromHdfs("/user");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
		
	}
}
