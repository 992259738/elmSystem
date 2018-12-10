package com.git.sp.service;

import java.util.List;

import com.git.sp.vo.User;

/**
*@author: cl
*@version : 2018年12月3日 下午4:45:01
*
*
*/

public interface UserService {
	List<User> findAllUser();
	
	User getUserByLoginName(String userName);
}
