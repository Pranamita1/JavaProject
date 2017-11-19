package com.eflower.EFlower.Test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eflower.EFlower.Dao.UserDao;
import com.eflower.EFlower.Model.User;

public class Usertest {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static UserDao userdao;
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		userdao = (UserDao)context.getBean("userdao");
	}
	@Test
	public void create(){
		User user = new User();
		user.setUserId("ghf9");
		user.setContact("asd");
		user.setMail("asf");
		System.out.println("Entering test");
		Assert.assertEquals(true,userdao.insertUser(user));
	 
		System.out.println("Exiting test");
	}

}

