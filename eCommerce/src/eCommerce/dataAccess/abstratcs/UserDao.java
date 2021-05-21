package eCommerce.dataAccess.abstratcs;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void delete(User user);

	void update(User user);

	User getById(int id);

	User getByEmail(String email);

	List<User> getAll();

}
