package com.blz.test;

import com.blz.userdetails.UserRegistration;

public class TestPassword {
	public static void validTest(UserRegistration userRegistration, String userPassword) {
		if (userRegistration.Password(userPassword)) {
			System.out.println( userPassword + " is Valid");
		} else {
			System.out.println( userPassword + " is Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		
		validTest(userRegistration, "Pravat@1234");
		validTest(userRegistration, "Bridge#1");
		validTest(userRegistration, "Pkdas@12");
	}

}
