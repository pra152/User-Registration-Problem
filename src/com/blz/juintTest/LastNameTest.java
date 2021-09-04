package com.blz.juintTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.blz.userdetails.UserRegistration;

public class LastNameTest {
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void testLastNameValid_success() {
		assertTrue(userRegistration.lastName("kumar"));
	}
	
	@Test()
	public void testLastNameValid_fail() {
		assertFalse(userRegistration.lastName("kumar"));
	}

}
