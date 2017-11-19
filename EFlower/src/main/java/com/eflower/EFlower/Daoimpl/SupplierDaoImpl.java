package com.eflower.EFlower.Daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eflower.EFlower.Dao.SupplierDao;
import com.eflower.EFlower.Model.Supplier;
@Repository
@Transactional
public class SupplierDaoImpl implements SupplierDao{
	
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean insertSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}

	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e){
		return false;
		}
	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}
		catch(Exception e){
		return false;
		}
	}

}
