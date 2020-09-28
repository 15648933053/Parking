package com.parking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import com.parking.pojo.User;

public interface UserMapper {
	
//	无条件全部查询
	@Select("select * from user")
	List<User> SelAllUser();
	
//	按照某值固定查询（单值，多值均可）
	List<User> selUserByOption(User user);
	
//	按照某值更新用户信息
	int updUserByOption (User user);
	
//	新建用户
	@Insert("insert into user values(username = #{username},password = #{password})")
	int insUser(String username,String password);
	
//	删除用户
	@Delete("delete from user where id = #{id} and username = #{username}")
	int delUser(int id,String username);
}
