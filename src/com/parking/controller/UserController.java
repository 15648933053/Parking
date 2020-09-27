package com.parking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("helloworld")
	public void hello(HttpServletRequest req,HttpServletResponse resp) {
		System.out.println("进入controller");
	}

}
