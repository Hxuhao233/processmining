package com.processmining.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.github.pagehelper.PageInfo;
import com.mysql.fabric.Response;
import com.processmining.entity.Log;
import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;
import com.processmining.util.fs.HDFSOperator;
import com.processmining.util.response.Code;
import com.processmining.util.response.ResponseData;
import com.processmining.util.response.ResponseWithList;


/**
 * 日志管理--原始日志控制器层
 * @author hxuhao
 *
 */

@Controller

@RequestMapping(value="/rawlog")

public class RawLogController {
	
	@Autowired
	private IRawLogService rawLogService; 
	
	@Autowired
	private HDFSOperator hdfsUtil;
	
	
	
	/**
	 * 上传原始日志文件
	 * @param rawLogFile	原始日志
	 * @param format		日志格式
	 * @param shared		是否共享
	 * @param request		

	 * @return
	 */
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST)
	public ResponseData uploadRawLog(
			@RequestParam(value="file",required=true) MultipartFile rawLogFile,
			@RequestParam(value="format",required=true)String format,
			@RequestParam(value="shared",required=true)int shared,
			HttpServletRequest request																
										){
		
		ResponseData responseData = new ResponseData();

		Log log = new RawLog();
		log.setCreatorid(1);
		log.setFormat(format);
		log.setIsshared(shared==1?true:false);
		log.setName(rawLogFile.getOriginalFilename());
		
		InputStream input = null;

		try {
			input = rawLogFile.getInputStream();
			if(rawLogService.uploadLog(input, log)){
				responseData.setCode(Code.SUCCEED);
			}else{
				responseData.setCode(Code.UNKNOWN_FAULT);
			}
		} catch (Exception e) {
			e.printStackTrace();
			responseData.setCode(Code.UNKNOWN_FAULT);
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return responseData;
		
	}
	
	

	/**
	 * 下载原始日志，浏览器弹窗
	 * @param logId		原始日志id
	 * @param response
	 */
	@RequestMapping(value="/{rawlogId}",
			produces="application/octet-stream;charset=UTF-8",
			method=RequestMethod.GET)
	public void downloadRawLog(
			@PathVariable(value="rawlogId")Integer logId,
			HttpServletResponse response){
		
		RawLog log = (RawLog) rawLogService.selectByPK(logId);
		byte[] data;
		InputStream input = null;
		try {
			input = rawLogService.downloadLog(logId);
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, "utf-8"));
			String line ;
			while((line = reader.readLine())!=null){
				sb.append(line+"\r\n");
			}
			data = sb.toString().getBytes();
			
			response.reset();
			response.setContentType("charset=UTF-8");   
	        response.setHeader("Content-Disposition", "attachment; filename=" + log.getName());   
	        response.setHeader("Content-Length", String.valueOf(data.length));
	                     
	        OutputStream outputStream = response.getOutputStream();  
		    outputStream.write(data);  
		    outputStream.flush();  
		    outputStream.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * 查看一个原始日志
	 * @param id 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public RawLog selectOne(@PathVariable(value="id") Integer id){
		
		RawLog log = (RawLog) rawLogService.selectByPK(id);
		return log;
		
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public ResponseWithList<RawLog> selectAll(
			@RequestParam(value="pageNum")int pageNum,
			@RequestParam(value="pageSize")int pageSize){
				
		ResponseWithList<RawLog> response = new ResponseWithList<>();
		PageInfo<RawLog> logListWithPage = rawLogService.listAll(pageNum,pageSize);
		response.setCode(Code.SUCCEED);
		response.setData(logListWithPage);
		return response;
		
	}
	
	/**
	 * 删除日志文件
	 * @param logId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseData deleteRawLog(@PathVariable(value="id")Integer logId){
		ResponseData response = new ResponseData();
		
		try {
			if(rawLogService.delete(logId)){
				response.setCode(Code.SUCCEED);
			}else{
				response.setCode(Code.UNKNOWN_FAULT);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode(Code.UNKNOWN_FAULT);
		} 
		
		return response;
	}

	
	
}
