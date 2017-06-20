package com.processmining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.processmining.service.IManagerService;
import com.processmining.util.request.IdList;
import com.processmining.util.response.Code;
import com.processmining.util.response.ResponseData;

/**
 * 管理员功能控制器
 * @author hxuhao
 *
 */

@Controller
@RequestMapping(value="manager")
public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
	@ResponseBody
	@RequestMapping(value="/banUser")
	public ResponseData banUser(@RequestBody IdList idList){
		List<Integer> src = idList.getIdList();
		for(Integer id : idList.getIdList()){
			System.out.println(id);
		}
		System.out.println(idList);
		ResponseData responseData = new ResponseData();
		responseData.setCode(Code.SUCCEED);
		return responseData;
		
	}
	
	
	
	
}
