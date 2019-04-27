package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class jdbcTemplate {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping("/hel")
	@ResponseBody
	public String asd() {
		int countOfActorsNamedJoe = this.jdbcTemplate.queryForObject("select count(*) from class where t_name= ?", Integer.class,"joe");
		return countOfActorsNamedJoe+"";
	}
	public int up() {
		int ss = this.jdbcTemplate.update("insert into class(t_name,t_id) values(?,?)","Leonor","232");
		return ss;
	}
	public int upda() {
		int upda = this.jdbcTemplate.update("update class set t_name=?,t_id=? where t_id=?","banjo",234532L);
		return upda;
	}
	public int dele() {
		int dele = this.jdbcTemplate.update("delete from class where t_id=?",Long.valueOf(3454));
		return dele ;
	}
}
