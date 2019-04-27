package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Controller;

@Controller
public class Demo {
	@Autowired
	DataSource data;
	@Autowired
	private NamedParameterJdbcTemplate named;
	public void run(DataSource data) throws Exception {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(data).withTableName("class");
		Map<String, Object> parameters = new HashMap<String, Object>(3);
		parameters.put("t_name", "weqw");
		parameters.put("t_id", "34");
		insertActor.withTableName("class").execute(parameters);
	}
	public int countOfActorsByFirstName(String firstName) {
		String sql = "select count(*) from class where t_name = : t_name";
		SqlParameterSource namedParameters = new MapSqlParameterSource("t_name","zxc");
		return this.named.queryForObject(sql,namedParameters,Integer.class);
	}

}
