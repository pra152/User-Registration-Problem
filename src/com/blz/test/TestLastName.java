package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails.UserRegistration;

public class TestLastName {
	public static void validTest(UserRegistration userRegistration,String userName) {
		if (userRegistration.lastName(userName)) {
			System.out.println(userName + " last Name is valid");
		}
		else {
			System.out.println(userName + "last Name is invalid ");
		}
	}
	
	public static void main(String []args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 2) {
			System.out.println("1.Enter Last Name\n2.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter  last name:");
				String userLastName = sc.next();
				validTest(userRegistration, userLastName);
				break;
			default:
				System.out.println("You came default ");
				break;
			}
		}
	}

}
