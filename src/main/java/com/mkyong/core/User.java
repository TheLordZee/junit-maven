package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

public class User {

	public List<String> messages = new ArrayList<>();
	
	private int id;

	public User(int i) {
		// TODO Auto-generated constructor stub
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
