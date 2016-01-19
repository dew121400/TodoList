package com.ToDoList.spring.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDoList.spring.web.DOA.User;

@Service("TodoListServie")
public class TodoListServices {
	private User user;
	public TodoListServices()
	{
		
	}
	public synchronized User getUser() {
		return user;
	}

	public synchronized void setUser(User user) {
		this.user = user;
	}
}
