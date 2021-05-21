package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstratcs.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	public InMemoryUserDao() {
		User user1 = new User(1, "Diren", "Akkoc", "drnakkoc94@gmail.com", "123456789");
		User user2 = new User(2, "Baran", "Demir", "brndemir93@gmail.com", "123459876");
		User user3 = new User(3, "Didem", "Akkoc", "ddmakkoc92@gmail.com", "6789");
		User user4 = new User(4, "Yagmur", "Emir", "ygmrakkoc95@gmail.com", "123");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println(user.getName() + " is added succesfully.");

	}

	@Override
	public void delete(User user) {
		System.out.println("User was deleted.");

	}

	@Override
	public void update(User user) {
		System.out.println("User was updated.");

	}

	@Override
	public User getById(int id) {
		for (User user : this.users) {
			if (user.getId() == id) {
				return user;
			}

		}
		System.out.println("User is not defined!");
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : this.users) {
			if (user.getEmail().equals(email)) {
				return user;
			}

		}
		System.out.println("Email is not defined!");

		return null;
	}

	@Override
	public List<User> getAll() {

		return this.users;
	}

}
