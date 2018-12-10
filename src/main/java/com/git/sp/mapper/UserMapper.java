package com.git.sp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.MappedJdbcTypes;

import com.git.sp.vo.User;



/**
*@author: cl
*@version : 2018年12月3日 下午4:46:52
*
*
*/
@Mapper
public interface UserMapper {
	List<User> findAllUser();
	User getUserByloginName(String userName);
}
