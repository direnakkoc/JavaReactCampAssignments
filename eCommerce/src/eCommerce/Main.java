package eCommerce;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		AuthService authService = new AuthManager(new UserManager(new InMemoryUserDao()));

		User user2 = new User(5, "Diren", "Akkoc", "drnakkoc@gamil.com", "147852369");
		User user1 = new User(6, "Baran", "Demir", "brndemir@gamil.com", "123456789");

		authService.login(user1);
		authService.register(user2);
		
		authService.loginByGoogle("drnakkoc94@gmail.com", "123456789");

	}

}
