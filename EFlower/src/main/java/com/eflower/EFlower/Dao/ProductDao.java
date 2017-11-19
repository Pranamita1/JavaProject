package com.eflower.EFlower.Dao;

import java.util.List;

import com.eflower.EFlower.Model.Product;


public interface ProductDao {
	
	boolean insertProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
	List<Product> getAll();
	

}
