package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {

	void login(User user);

	void loginByGoogle(String email, String password);

	void register(User user);

	void logout();

}
