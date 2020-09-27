package com.parking.service;

import java.util.List;

import com.parking.pojo.User;

public interface UserService {

	List<User> SelAllUser();
	List<User> selUserByOption(User user);
	int updUserByOption (User user);
	int insUser(String username,String password);
	int delUser(int id,String username);

}
