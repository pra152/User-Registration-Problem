package com.blz.juintTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.blz.userdetails.UserRegistration;

public class EmailTest {
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void testEmailValid_success() {
		assertTrue(userRegistration.EmailID("pravatdas211@gmail.com"));
	}
	
	@Test()
	public void testEmailValid_fail() {
		assertFalse(userRegistration.EmailID("pavatdas@.com"));
	}
}
