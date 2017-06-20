package com.processmining.util.response;

/**
 * 服务端返回值状态码
 * @author hxuhao
 *
 */
public interface Code {
	
	// 成功
	int SUCCEED = 200;
	
	// 错误的邮箱或者密码
	int WRONG_EMAIL_OR_PASSWORD = 300;
	
	// 被禁用
	int IS_BANED = 301;
	
	// 未激活
	int IS_ACTIVATED = 302;
	
	// 邮箱被占用
	int OCCUPIED_EMAIL = 303;
	
	// 昵称被占用
	int OCCUPIED_NICKNAME = 304;
	
	// 未登录
	int NOT_LOGGED = 400;
	
	// 无权访问
	int NOT_PERMISSION = 401;
	
	// 未知错误
	int UNKNOWN_FAULT = 500;
}