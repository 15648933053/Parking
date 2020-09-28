package com.parking.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parking.pojo.User;
import com.parking.service.UserService;
import com.parking.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Resource
	public UserService UserServiceImpl;
	
//	登录
	@RequestMapping("login")
	public void login(HttpServletRequest req,HttpServletResponse resp) {
		
	}
	
//	注册
	@RequestMapping("register")
	public void register(HttpServletRequest req,HttpServletResponse resp) {
		
	}
	
//	修改信息
	@RequestMapping("upduser")
	public void upduser(HttpServletRequest req,HttpServletResponse resp) {
		User user = (User) req.getSession().getAttribute("user");
		int money = Integer.parseInt(req.getParameter("money"));
		String username = req.getParameter("username");
		
		if(user != null) {
			List<User> selUserByOption = UserServiceImpl.selUserByOption(user);
			if(!selUserByOption.isEmpty()) {
				User change = new User();
				change.setUsername(username);
				change.setMoney(money);
				if(UserServiceImpl.updUserByOption(change)>0) {
					System.out.println("信息更新成功！");
				}else {
					System.out.println("信息更新失败！");
				}
			}
			
		}
	}
	
//	查看信息
	@RequestMapping("seluser")
	public void seluser(HttpServletRequest req,HttpServletResponse resp) {
		
	}
	
//	找回密码
	@RequestMapping("finduser")
	public void finduser(HttpServletRequest req,HttpServletResponse resp) {
		
	}
	
	
}
