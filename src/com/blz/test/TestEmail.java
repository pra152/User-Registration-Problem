package com.blz.test;

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
		int choice = 0;
		while (choice != 2) {
			{
				System.out.println("1.Enter Email ID\n2.exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Your Email");
					String userEmail = sc.next();
					validTest(userRegistration, userEmail);
					break;
				default:
					System.out.println("You came default");
					break;
				}
			}
		}
	}
}
