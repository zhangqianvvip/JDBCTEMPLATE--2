package com.example.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Actor;
@Controller
public class jdbcdemo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

@SuppressWarnings("unused")
@RequestMapping("/qw")
@ResponseBody
public void asd() {
List <Actor> actors = this.jdbcTemplate.query(
	"select t_name,t_id from class",
	new RowMapper<Actor>() {
		public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
			Actor actor = new Actor();
			actor.setT_name(rs.getString("t_name"));
			actor.setT_id(rs.getString("t_id"));
			return actor;
		}
	  });
   }
	

}
