package com.eflower.EFlower.Dao;

import com.eflower.EFlower.Model.Supplier;

public interface SupplierDao {

	boolean insertSupplier(Supplier supplier);
	boolean deleteSupplier(Supplier supplier);
	boolean updateSupplier(Supplier supplier);
	
}
