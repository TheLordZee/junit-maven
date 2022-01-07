package com.mkyong.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class MessageServiceTest {

	private static User u1;
	private static User u2;
	
	@BeforeAll
	static void setUp() {
		MessageService.users.clear();
		u1 = new User(1);
		u2 = new User(2);
		MessageService.users.add(u1);
		MessageService.users.add(u2);
	}
    @DisplayName("Test MessageService.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", MessageService.get());
    }
    
    @DisplayName("Test MessageService.send()")
    @Test
    void testSend() {
    	MessageService.send("Hello", 1);
    	assertThat(u1.messages, contains("Hello"));
    }
}
;