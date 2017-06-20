package com.processmining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.processmining.entity.User;
import com.processmining.service.IUserService;
import com.processmining.util.response.Code;
import com.processmining.util.response.ResponseData;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private IUserService userSerivce;
	
	
	@ResponseBody
	@RequestMapping(value="/register")
	public ResponseData register(@RequestBody User user){
		
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getNickname());
		System.out.println(user.getCheckcode());
		userSerivce.register(user);
		System.out.println(user.getId());
		
		ResponseData responseData = new ResponseData();
		responseData.setCode(Code.SUCCEED);
		
		return responseData; 
		
	}
	
	
	
}
