package com.ToDoList.spring.web.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Service;


@Service
public class Sql {
	private Connection con = null;

	private String url = "jdbc:mysql://localhost:3306/ToDoList";
	private String user = "root";
	private String password = "Dew121400";
	public Sql()
	{
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, user, password);
			System.out.println("succeed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
