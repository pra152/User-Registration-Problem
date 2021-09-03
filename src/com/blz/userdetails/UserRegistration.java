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

}
