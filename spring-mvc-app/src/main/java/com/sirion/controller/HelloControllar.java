package com.sirion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sirion.entity.UserBean;
import com.sirion.service.UserService;


@Controller
public class HelloControllar {
	@Autowired
	private UserService uservice;
	@RequestMapping("index")
	public String sayHello() {
		return "index";
	}
	@RequestMapping("add")
	public String addUser(UserBean userBean, Model m) {
		List<UserBean> li=uservice.addUser(userBean);
		if(li==null)
			m.addAttribute("msg", "User Already there.");
		else
			m.addAttribute("user",li);
		return "index";
	}
	@RequestMapping("login")
	public String sayHello1() {
		return "Login";
	}
}
