package com.example.entity;

public class Actor {
	private String t_name;
	private String t_id;
	private String t_dean;

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_dean() {
		return t_dean;
	}

	public void setT_dean(String t_dean) {
		this.t_dean = t_dean;
	}

	@Override
	public String toString() {
		return "Actor [t_name=" + t_name + ", t_id=" + t_id + ", t_dean=" + t_dean + "]";
	}

}
