package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
	
	public static List<User> users = new ArrayList<>();

    public static String get() {
        return "Hello JUnit 5";
    }

	public static void send(String message, int id) {
		// TODO Auto-generated method stub
		users.stream().filter(e -> e.getId() == id).forEach(e -> e.messages.add(message));
	}

}
