package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails.UserRegistration;

public class TestMobileNumber {
	public static void validTest(UserRegistration userRegistration, String userMobile) {
		if (userRegistration.MobileNumber(userMobile)) {
			System.out.println(userMobile + " is Valid");
		} else {
			System.out.println(userMobile + " is Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 2) {
			try {
				System.out.println("1.Enter Mobile Number\n2.exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Mobile Number");
					String userMobileNo = sc.next();
					validTest(userRegistration, "91 " + userMobileNo);
					break;
				default:
					System.out.println("You came default");
					break;
				}

			} catch (Exception e) {
				System.out.println(e);
				choice = 2;
			}
		}
	}
}
