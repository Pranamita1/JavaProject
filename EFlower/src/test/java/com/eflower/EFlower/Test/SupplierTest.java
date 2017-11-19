package com.eflower.EFlower.Test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eflower.EFlower.Dao.SupplierDao;
import com.eflower.EFlower.Model.Supplier;

public class SupplierTest {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static Supplier supplier;
	@Autowired
	static SupplierDao supplierDao;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		supplier=(Supplier)context.getBean("supplier");
		supplierDao=(SupplierDao)context.getBean("supplierDao");
				
	}
	
	@Test
	public void supplierTest(){
		supplier.setSupplierId("v1478");
		supplier.setSupplierName("bangalore_rose");
		supplier.setSupplierContact("12346");
		supplier.setSupplierMail("abc@xyz");
		supplier.setSupplirAddress("bangalore");
		
		Assert.assertEquals(true,supplierDao.insertSupplier(supplier));
	}

}
