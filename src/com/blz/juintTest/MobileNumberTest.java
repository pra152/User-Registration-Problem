package com.blz.juintTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.blz.userdetails.UserRegistration;

public class MobileNumberTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testMobileValid_success() {
		assertTrue(userRegistration.MobileNumber("91 8917435897"));
	}

	@Test
	public void testMobileValid_fail() {
		assertFalse(userRegistration.MobileNumber("279997"));
	}
}