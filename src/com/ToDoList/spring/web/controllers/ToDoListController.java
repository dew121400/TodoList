package com.ToDoList.spring.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoListController {

	@RequestMapping("/")
	public String showHome(HttpSession season)
	{
		return "home";
	}
}
