package com.finalProject.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalProject.DB.DBUtils;

@Controller
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(String username, String password, String firstName, String lastName, String email)
			throws Exception {
		System.out.println("inside register method.. " + username + " ," + password);

		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");

		pstmt.setString(1, username);
		pstmt.setString(2, password);
		pstmt.setString(3, firstName);
		pstmt.setString(4, lastName);
		pstmt.setString(5, email);

		pstmt.execute();

		return "index";
	}

	@RequestMapping("/login")
	public String login(String username, String password) throws Exception {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalProject", "root", "Milan1793");

		PreparedStatement pstmt = conn.prepareStatement("select * from user where username = ? and password = ?");

		pstmt.setString(1, username);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			return "welcomePage";
		} else {
			return "index";
		}
	}
}
