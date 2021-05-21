package eCommerce.externalService;

import java.util.ArrayList;

public class Google {

	public ArrayList<GoogleUser> emailAndPassword() {

		ArrayList<GoogleUser> googleUsers = new ArrayList<GoogleUser>();

		googleUsers.add(new GoogleUser("Diren", "Akkoc", "drnakkoc94@gmail.com", "123456789"));
		googleUsers.add(new GoogleUser("Baran", "Demir", "brndemir93@gmail.com", "123459876"));
		googleUsers.add(new GoogleUser("Didem", "Akkoc", "ddmakkoc92@gmail.com", "6789"));
		googleUsers.add(new GoogleUser("Yagmur", "Emir", "ygmrakkoc95@gmail.com", "123"));

		return googleUsers;

	}

}
