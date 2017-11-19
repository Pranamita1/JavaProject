package com.eflower.EFlower.Daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.eflower.EFlower.Dao.UserDao;
import com.eflower.EFlower.Model.User;

 

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	/* public UserDaoImpl(SessionFactory sessionFactory){
		 this.sessionFactory=sessionFactory;
	 }
*/
	public boolean updateUser(User user) {
		try{
		sessionFactory.getCurrentSession().update(user);
		return true;
	}
		catch(Exception e){
			return false;
			
		}
	
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		
		catch(Exception e){
		return false;
	}
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		try{ 
			System.out.println("Entering");
			sessionFactory.getCurrentSession().save(user);
			System.out.println("Exiting");
			return true;
		}catch(Exception e){
			e.printStackTrace();
		return false;
		}
	}

}
