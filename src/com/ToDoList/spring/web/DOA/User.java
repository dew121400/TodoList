/**
 * 
 */
package com.ToDoList.spring.web.DOA;

import org.springframework.stereotype.Component;

/**
 * @author david white
 *
 */
@Component("UserDoa")
public class User {
	private String username;
	private String password; 
	public User() {
		System.out.println("hello");
	}
	public synchronized String getUsername() {
		return username;
	}
	public synchronized void setUsername(String username) {
		this.username = username;
	}
	public synchronized String getPassword() {
		return password;
	}
	public synchronized void setPassword(String password) {
		this.password = password;
	}
}
