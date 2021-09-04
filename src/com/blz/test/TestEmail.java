package com.blz.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.blz.userdetails.UserRegistration;

public class TestEmail {
	public static void validTest(UserRegistration userRegistrationValid, String userEmail) {
		if (userRegistrationValid.EmailID(userEmail)) {
			System.out.println(userEmail + " is Valid");
		} else {
			System.out.println(userEmail + " is Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		List<String> emailIds = Arrays.asList(
			"abc@yahoo.com",
			"abc-100@yahoo.com",
			"abc-100@yahoo.com",
			"abc111@abc.com",
			"abc-100@abc.net",
			"abc.100@abc.com.au",
			"abc@1.com",
			"abc@gmail.com.com",
			"abc+100@gmail.com",
			"abc",
			"abc@.com.my",
			"abc123@gmail.a",
			"abc123@.com",
			"abc123@.com.com",
			".abc@abc.com",
			"abc()*@gmail.com",
			"abc@%*.com",
			"abc..2002@gmail.com",
			"abc.@gmail.com",
			"abc@abc@gmail.com",
			"abc@gmail.com.1a",
			"abc@gmail.com.aa.au");
		
		for (String userEmail : emailIds) {
			validTest(userRegistration,userEmail);	
		}
	}
}
