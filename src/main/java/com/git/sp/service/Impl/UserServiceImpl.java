package com.git.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.sp.mapper.UserMapper;
import com.git.sp.service.UserService;
import com.git.sp.vo.User;



/**
*@author: cl
*@version : 2018年12月3日 下午4:45:30
*
*
*/
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

	@Override
	public User getUserByLoginName(String userName) {
		
		User user = userMapper.getUserByloginName(userName);
		return user;
		
	}

}
