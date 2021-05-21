package eCommerce.core;

import eCommerce.entities.concretes.User;

public interface GoogleService {

	User registerWithGoogleAccount(String email, String password);

}
