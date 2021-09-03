package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails.UserRegistration;

public class TestFirstName {
	public static void validTest(UserRegistration userRegistration, String userName) {
		if(userRegistration.firstName(userName)) {
			System.out.println(userName + "is valid");
		}
		else {
			System.out.println(userName + "is not valid");
		}
	}
	
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		int choice = 0 ;
		while(choice != 2) {
			System.out.println("1.FisrtName\n2.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter First Name:");
				String userName = sc.next();
				validTest(userRegistration, userName);
				break;
			default:
				System.out.println("You came defAULT");
				break;
			}
		}
	}
}

