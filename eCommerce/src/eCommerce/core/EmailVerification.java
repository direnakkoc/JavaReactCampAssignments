package eCommerce.core;

import java.util.regex.Pattern;

public class EmailVerification {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";// Regex
																																	// design

	public static boolean isEmailValid(String email) {

		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

		return pattern.matcher(email).find();
	}

}
