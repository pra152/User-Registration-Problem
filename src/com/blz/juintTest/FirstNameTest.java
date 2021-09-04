package com.blz.juintTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.blz.userdetails.UserRegistration;

public class FirstNameTest {
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void testFirstNameValid_success() {
		assertTrue(userRegistration.firstName("Pravat"));
	}
	
	@Test
	public void testFirstNameValid_fail() {
		assertFalse(userRegistration.firstName("pravat"));
	}
}
