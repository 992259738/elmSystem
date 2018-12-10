package com.git.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.git.sp.service.UserService;
import com.git.sp.vo.User;



/**
*@author: cl
*@version : 2018年12月3日 下午4:40:29
*
*
*/
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	} 
	
	@RequestMapping("/login.action")
	public String userLogin(
			@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "password", required = true) String password,
			HttpServletRequest request) {
		User user = userServiceImpl.getUserByLoginName(userName);
		if(user!=null) {
			if(password.equals(user.getPassword())) {
				
				return "success";
			}else				
			return "login";
		}else {
			return "login";
		}	
	}
	
	@RequestMapping("/userList")
	public List<User> getAllUser(){
		System.out.println("21");
		List<User> list = userServiceImpl.findAllUser();	
		System.out.println(list);
		return list;
	}
}
