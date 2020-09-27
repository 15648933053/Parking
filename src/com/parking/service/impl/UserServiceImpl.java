package com.parking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.parking.mapper.UserMapper;
import com.parking.pojo.User;
import com.parking.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper UserMapper;
	
	@Override
	public List<User> SelAllUser() {
		// TODO 自动生成的方法存根
		return UserMapper.SelAllUser();
	}

	@Override
	public List<User> selUserByOption(User user) {
		// TODO 自动生成的方法存根
		return UserMapper.selUserByOption(user);
	}

	@Override
	public int updUserByOption(User user) {
		// TODO 自动生成的方法存根
		return UserMapper.updUserByOption(user);
	}

	@Override
	public int insUser(String username, String password) {
		// TODO 自动生成的方法存根
		return UserMapper.insUser(username, password);
	}

	@Override
	public int delUser(int id, String username) {
		// TODO 自动生成的方法存根
		return UserMapper.delUser(id, username);
	}

}
