package com.processmining.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.fabric.Response;
import com.processmining.service.IRawLogService;
import com.processmining.util.Code;
import com.processmining.util.ResponseData;
import com.processmining.util.fs.HDFSOperator;

/**
 * 日志管理--原始日志控制器层
 * @author hxuhao
 *
 */

@Controller
@RequestMapping(value="rawlog")
public class RawLogController {
	
	@Autowired
	private IRawLogService rawLogService; 
	
	@Autowired
	private HDFSOperator hdfsUtil;
	
	/**
	 * 上传原始日志文件
	 * @param rawLogFile
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST)
	public ResponseData uploadRawLog(@RequestParam(value="file",required=true) MultipartFile rawLogFile,HttpServletRequest request){
		
		String path="";
		try {
			path = hdfsUtil.uploadFile(rawLogFile.getInputStream(), "/processmining/rawlog/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(path);
		ResponseData responseData = new ResponseData();
		responseData.setCode(Code.SUCCESS);
		return responseData;
		
	}
	
	
	
	
}
