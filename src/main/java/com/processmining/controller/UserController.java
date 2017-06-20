package com.processmining.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.processmining.config.PMConfig;
import com.processmining.entity.User;
import com.processmining.service.IUserService;
import com.processmining.util.Code;
import com.processmining.util.EncodeUtil;
import com.processmining.util.LoginData;
import com.processmining.util.NicknameUtil;
import com.processmining.util.PasswordUtil;
import com.processmining.util.ResponseData;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@ResponseBody
	@RequestMapping(value="/login")
	public LoginData login(@RequestBody User user,HttpSession session){
		boolean isLogin=userService.login(user);
		LoginData loginData=new LoginData();
		System.out.print(user.getCheckcode()==null);
		System.out.print(session.getAttribute("code"));
		if(!user.getCheckcode().equals((String)session.getAttribute("code"))){//如果验证码错误
			loginData.setCode(Code.WRONG_CHECKCODE);
		}else{
			if(isLogin){//如果用户名和密码正确
				User u =userService.getUserByEmailAndPassword(user);
				Integer type=u.getType();
				loginData.setType(type);
				if(u.getBanned()){
					loginData.setCode(Code.IS_BANED);
				}else{//如果被封
				    loginData.setCode(Code.SUCCESS);
				    session.setAttribute("user",u);
				}
			}
			else{//如果用户名或密码错误
				loginData.setCode(Code.WRONG_EMAIL_OR_PASSWORD);
			}
		}
		return loginData; 
	}
	
	@ResponseBody
	@RequestMapping("/register")
	public ResponseData register(@RequestBody User user){
		int status=userService.register(user);
		return new ResponseData(status);
	}
	
	@ResponseBody
	@RequestMapping("/changePassword")
	public ResponseData changePassword(@RequestBody PasswordUtil pwdUtil,HttpSession session){
		User u=(User) session.getAttribute("user");
		if(u==null){
			return new ResponseData(Code.NOT_LOGGED);
		}else{
			if(EncodeUtil.string2MD5(pwdUtil.getOldPassword()+PMConfig.SALT).equals(u.getPassword())){
				int status=userService.updatePassword(u, pwdUtil.getNewPassword());
				return new ResponseData(status);
			}else{
				return new ResponseData(Code.NOT_PERMISSION);
			}
		}
	}
	
	@ResponseBody
	@RequestMapping("/changeNickName")
	public ResponseData changeNickname(@RequestBody NicknameUtil nickName,HttpSession session){
		User u=(User) session.getAttribute("user");
		if(u==null){
			return new ResponseData(Code.NOT_LOGGED);
		}else{
			int status=userService.updateNickName(u, nickName.getNickName());
			return new ResponseData(status);
		}
	}
	
	@RequestMapping("/logoff")
	public void logoff(HttpSession session){
		session.invalidate();
	}
}
