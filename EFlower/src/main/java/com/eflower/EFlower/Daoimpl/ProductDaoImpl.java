package com.eflower.EFlower.Daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eflower.EFlower.Dao.ProductDao;
import com.eflower.EFlower.Model.Product;
 
 @Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
@Autowired
SessionFactory sessionFactory;

public boolean insertProduct(Product product) {
	// TODO Auto-generated method stub
	try{
		sessionFactory.getCurrentSession().save(product);
		return true;
	}
	
	catch(Exception e){
		e.printStackTrace();
	return false;
}
}

public boolean updateProduct(Product product) {
	// TODO Auto-generated method stub
	try{
		sessionFactory.getCurrentSession().update(product);
		return true;
	}
	
	catch(Exception e){
		return false;
	}
	
}

public boolean deleteProduct(Product product) {
	// TODO Auto-generated method stub
	try{
		sessionFactory.getCurrentSession().delete(product);
		return true;
	}
	
	catch(Exception e){
	return false;
}
}

public List<Product> getAll() {
	// TODO Auto-generated method stub
	return null;
}
	 
}
