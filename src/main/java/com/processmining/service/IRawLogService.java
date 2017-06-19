package com.processmining.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.processmining.entity.RawLog;



/**
 * 原始日志业务层
 * @author hxuhao
 *
 */
public interface IRawLogService {
	
	public List<RawLog> listAll();
	public int create(RawLog log);
	public int delete(List<Integer> ologId);		// 允许批量删除
	
	/**
	 * 规范化
	 * @param path	文件名
	 * @param id	hdfsId
	 * @param formats	数据项格式配置
	 * @param timeNames 	时间项整合
	 * @param dataNames		数据项整合
	 * @param oriitemSeparator		原数据项分割符
	 * @param orinameValSeparator	原名称值分隔符
	 * @param orinulVal				原空值
	 * @param targetitemSeparator		目标数据项分隔符
	 * @param targetnameValSeparator	目标数据项分隔符
	 * @param targetnulVal				目标空值
	 * @return 规范化日志
	 */
	public File convertToNormLog(String path,String id, String formats, String timeNames, String dataNames,
			String oriitemSeparator, String orinameValSeparator, String orinulVal, String targetitemSeparator,
			String targetnameValSeparator, String targetnulVal);							
	/**
	 * 上传
	 * @param rawLog 日志文件流
	 * @return	hdfsId
	 */
	public String uploadRawLog(FileInputStream rawLog);
	
	/**
	 * 下载
	 * @param name 日志文件名
	 * @return	日志文件输出流
	 */
	public FileInputStream downloadRawLog(String name);
	
}
