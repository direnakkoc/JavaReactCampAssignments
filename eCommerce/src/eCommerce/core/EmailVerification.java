package eCommerce.core;

import java.util.regex.Pattern;

public class EmailVerification {
	private static final String EMAIL_PATTERN = "^[a-z0-9._%+-]+@[a-z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[a-z]{2})?$";// Regex design

	public static boolean isEmailValid(String email) {

		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

		return pattern.matcher(email).find();
	}

}
