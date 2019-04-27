package com.example.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.entity.Actor;

public final class util implements jdbcdemo<Actor> {
		public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
			Actor actor = new Actor();
			actor.setT_name(rs.getString("t_name"));
			actor.setT_id(rs.getString("t_id"));
			return actor;
		}
	}
	
