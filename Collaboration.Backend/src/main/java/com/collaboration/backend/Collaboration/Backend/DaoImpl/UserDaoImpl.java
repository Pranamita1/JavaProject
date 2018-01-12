package com.collaboration.backend.Collaboration.Backend.DaoImpl;

import java.util.List;

import org.hibernate.criterion.Expression;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.collaboration.backend.Collaboration.Backend.Dao.UserDao;
import com.collaboration.backend.Collaboration.Backend.Model.User;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
 
	@Autowired
	 SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		try {
			System.out.println("heelo");
			sessionFactory.getCurrentSession().save(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		List<User> list = sessionFactory.getCurrentSession().createQuery("from USER_details").getResultList();
		User u = (User) list;
		/*for(Users u : list) {
			if(u.getEmailId() == user.getEmailId() && u.getPassword() == user.getPassword()) {
				return true;
			} 
			else {
				return false;
			}
		}*/
		if(user.getEmailId() == u.getEmailId() && user.getPassword() == u.getPassword()) {
			return true;
		}
		else 
			return false;
	}

	@Override
	public User validate(String emailId, String password) {
		// TODO Auto-generated method stub
		 System.out.println("Entering Rest Controller");
		  Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		  criteria.add(Expression.eq("emailId", emailId));
		  System.out.println(emailId);
		  criteria.add(Expression.eq("password", password));
		  System.out.println(password);
		  return (User) criteria.uniqueResult();
	}

	@Override
	public User getById(int userId) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession().get(User.class, userId) ;
	}

	@Override
	public User getByUsername(String userName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Entering");
		String sql = "from USER_details WHERE emailId = :userName";
		User user = (User)session.createQuery(sql).setParameter("username", userName).getSingleResult();
		return user;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from USER_details").getResultList();
	}

	 
	 
}
