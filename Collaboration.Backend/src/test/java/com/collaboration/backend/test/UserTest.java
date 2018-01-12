/*package com.collaboration.backend.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaboration.backend.Collaboration.Backend.Dao.UserDao;
import com.collaboration.backend.Collaboration.Backend.Model.User;

import junit.framework.Assert;

public class UserTest {
	 
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static UserDao userdao;
	@Autowired
	static User user;
	
	@BeforeClass
	public static void init(){
		System.out.println("1");
		context = new AnnotationConfigApplicationContext();
		System.out.println("1");
		context.scan("com.collaboration.backend");
		System.out.println("1");
		context.refresh();
		System.out.println("2");
		userdao = (UserDao) context.getBean("userdao");
		//user=(User)context.getBean("user");
		
	}
	@Test
	public void usertest(){
		User user = new User();
		System.out.println("4");
		user.setUser_name("prana");
		user.setEmail("abc@mail.com");
		user.setContact_number("123456");
		System.out.println("3");
		Assert.assertEquals(true, userdao.registerUser(user));
		 
		
	}

}
*/