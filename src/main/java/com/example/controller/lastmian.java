package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class lastmian {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/abc")
	@ResponseBody
	public String asq() {
		String lastName = this.jdbcTemplate.queryForObject("select t_name from class where t_id=? and t_dean=?", new Object[] {12,122}, String.class);
		return lastName+"";
	}
}
