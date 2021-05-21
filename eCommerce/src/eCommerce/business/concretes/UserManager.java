package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstratcs.UserDao;
import eCommerce.entities.concretes.User;
import eCommerce.validationRules.Utils;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if (Utils.businessRules(checkIfFullNameIsValid(user.getName(), user.getLastName()),
				checkIfEmailExist(user.getEmail()), checkIfPasswordValid(user.getPassword()))) {
			this.userDao.add(user);
			System.out.println("User added successfully.");
			return;

		}
		System.out.println("Something went wrong!");

	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);

	}

	@Override
	public void update(User user) {
		if (Utils.businessRules(checkIfFullNameIsValid(user.getName(), user.getLastName()),
				checkIfEmailExist(user.getEmail()), checkIfPasswordValid(user.getPassword()))) {
			System.out.println("Something went wrong!");
			return;

		}
		this.userDao.update(user);

	}

	@Override
	public User getById(int id) {

		return this.userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {

		return this.userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {

		return this.userDao.getAll();
	}

	// Validation

	private boolean checkIfPasswordValid(String password) {

		if (password.length() >= 6) {
			return true;
		}
		return false;
	}

	private boolean checkIfEmailExist(String email) {
		List<User> users = userDao.getAll();

		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return false;

			}

		}
		return true;
	}

	private boolean checkIfFullNameIsValid(String name, String lastName) {
		if (name.length() >= 2 && lastName.length() >= 2) {
			return true;

		}
		return false;
	}

}
