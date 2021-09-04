package com.blz.juintTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.blz.juintTest.Exception.InvalidInputException;
import com.blz.userdetails.UserRegistration;

@RunWith(Parameterized.class)
public class EmailTest {
	enum Type {
		VALID, INVALID
	};

	private Type type;
	private String userEmail;
	private boolean expectedResult;
	UserRegistration userRegistration;

	public EmailTest(Type type, String userEmail, boolean expectedResult) {
		this.type = type;
		this.userEmail = userEmail;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {

		return Arrays.asList(new Object[][] { { Type.VALID, "abc@yahoo.com", true },
				{ Type.VALID, "abc-100@yahoo.com", true }, { Type.VALID, "abc-100@yahoo.com", true },
				{ Type.VALID, "abc111@abc.com", true }, { Type.VALID, "abc-100@abc.net", true },
				{ Type.VALID, "abc.100@abc.com.au", true }, { Type.VALID, "abc@1.com", true },
				{ Type.VALID, "abc@gmail.com.com", true }, { Type.VALID, "abc+100@gmail.com", true },

				{ Type.INVALID, "abc", false }, { Type.INVALID, "abc@.com.my", false },
				{ Type.INVALID, "abc123@gmail.a", false }, { Type.INVALID, "abc123@.com", false },
				{ Type.INVALID, "abc123@.com.com", false }, { Type.INVALID, ".abc@abc.com", false },
				{ Type.INVALID, "abc()*@gmail.com", false }, { Type.INVALID, "abc@%*.com", false },
				{ Type.INVALID, "abc..2002@gmail.com", false }, { Type.INVALID, "abc.@gmail.com", false },
				{ Type.INVALID, "abc@abc@gmail.com", false }, { Type.INVALID, "abc@gmail.com.1a", false },
				{ Type.INVALID, "abc@gmail.com.aa.au", false } });
	}

	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void testEmailValid_success() throws InvalidInputException {
		Assume.assumeTrue(type == Type.VALID);
		boolean actual = userRegistration.EmailID(userEmail);
		boolean expected = expectedResult;
		assertEquals(expected, actual);
	}

	@Test(expected = InvalidInputException.class)
	public void testEmailValid_fail() throws InvalidInputException {
		Assume.assumeTrue(type == Type.INVALID);
		userRegistration.EmailID(userEmail);
	}
}
