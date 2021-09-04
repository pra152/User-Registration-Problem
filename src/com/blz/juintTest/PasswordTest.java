package com.blz.juintTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.blz.userdetails.UserRegistration;

public class PasswordTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testUserPasswordValid_success() {
		assertTrue(userRegistration.Password("Pravat@123"));
	}

	@Test
	public void testUserPasswordValid_fail() {
		assertFalse(userRegistration.Password("pk123"));
	}
}
