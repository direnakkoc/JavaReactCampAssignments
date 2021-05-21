package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.GoogleManagerAdapter;
import eCommerce.core.GoogleService;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		if (checkUser(user)) {
			System.out.println("Login successful!");

		} else {
			System.out.println("An error has happened. Try again!");
		}

	}

	@Override
	public void loginByGoogle(String email, String password) {
		GoogleService googleService = new GoogleManagerAdapter();
		User user = googleService.registerWithGoogleAccount(email, password);
		if (this.userService.getByEmail(email) != null && this.userService.getByEmail(email).getPassword() != null) {
			System.out.println("Register successful.");

		} else {
			System.out.println("Something went wrong. Try again!");
		}

	}

	@Override
	public void register(User user) {
		if (user.getName() != null && user.getLastName() != null && user.getEmail() != null
				&& user.getPassword() != null) {
			userService.add(user);
			System.out.println("Register successful");
		} else {
			System.out.println("Something missing. Try again!");
		}
	}

	@Override
	public void logout() {
		System.out.println("You have been logged out.");

	}

	private boolean checkUser(User user) {
		if (user.getEmail() != null && user.getPassword() != null) {
			return true;
		}
		return false;
	}

}
