package com.collaboration.backend.Collaboration.Backend.Dao;

import java.util.List;

import com.collaboration.backend.Collaboration.Backend.Model.User;

public interface UserDao {
	boolean saveUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	boolean validateUser(User user);
	User validate(String emailId, String password);
	User getById(int userId);
	User getByUsername(String username);
	//Users validateAdmin(String emailId);
	List<User> getAll();
}

