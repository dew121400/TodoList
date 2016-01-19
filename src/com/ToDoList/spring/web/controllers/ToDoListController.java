package com.ToDoList.spring.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ToDoList.spring.web.DOA.User;

@Controller
public class ToDoListController {

	@RequestMapping("/")
	public String showHome(HttpSession season)
	{
		User user = new User();
		User user1 = new User();
		user.setUsername("david");
		user1.setUsername("ally");
		System.out.println(user.getUsername());
		System.out.println(user1.getUsername());
		
		return "home";
	}
	@RequestMapping("/Login")
	public String Login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/LoginPost", method= RequestMethod.POST)
	public String LoginPost(User user)
	{
		System.out.println(user.getUsername());
		return "home";
	}
}
