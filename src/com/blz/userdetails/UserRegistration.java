package com.blz.userdetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blz.constants.Constants;

public class UserRegistration {
	public boolean isValidPattern(String input, String regexPattern) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	public boolean firstName(String userFirstName) {
		return isValidPattern(userFirstName, Constants.FIRST_NAME_REGEX);
	}
	
	public boolean lastName(String userLastName) {
		return isValidPattern(userLastName, Constants.LAST_NAME_REGEX);
	}
	
	public boolean EmailID(String userEmail) {
		return isValidPattern(userEmail, Constants.EMAIL_ID_REGEX);
	}
	
	public boolean MobileNumber(String userMobile) {
		return isValidPattern(userMobile, Constants.MOBILE_NUMBER_REGEX);
	}
	
	public boolean Password(String userPassword) {
		return isValidPattern(userPassword, Constants.PASSWORD_REGEX);
	}

}
