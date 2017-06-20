package com.processmining.util.response;

import com.github.pagehelper.PageInfo;
import com.mysql.fabric.Response;

/**
 * 服务器端返回带有列表的数据，带分页
 * @author hxh12
 *
 */
public class ResponseWithList<T> extends ResponseData{
	
	private PageInfo<T> data;
	private int code;
	
	public ResponseWithList(){
		
	}
	
	public ResponseWithList(PageInfo<T> pageInfo){
		this.data = pageInfo;
	}


	public PageInfo<T> getData() {
		return data;
	}


	public void setData(PageInfo<T> data) {
		this.data = data;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}
	
	
	
	
	
}
