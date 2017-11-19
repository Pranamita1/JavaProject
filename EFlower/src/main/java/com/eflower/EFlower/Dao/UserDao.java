package com.eflower.EFlower.Dao;

import java.util.List;

import com.eflower.EFlower.Model.User;

public interface UserDao {
	
	boolean insertUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	User getById(int id);
	List<User> getAll();

}
