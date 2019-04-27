package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JdpcDemoApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping("/qwe")
	@ResponseBody
	public String run(){
		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from class",Integer.class);
		return rowCount+"";
	}
	
}
