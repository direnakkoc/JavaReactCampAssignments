package eCommerce.core;

import java.util.ArrayList;

import eCommerce.entities.concretes.User;
import eCommerce.externalService.Google;
import eCommerce.externalService.GoogleUser;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public User registerWithGoogleAccount(String email, String password) {

		Google google = new Google();

		ArrayList<GoogleUser> googleUsers = google.emailAndPassword();
		for (GoogleUser googleUser : googleUsers) {
			if (googleUser.getEmail().equals(email) && googleUser.getPassword().equals(password)) {
				User user = new User();
				user.setEmail(email);
				user.setPassword(password);
				return user;
			}

		}

		return null;
	}

}
