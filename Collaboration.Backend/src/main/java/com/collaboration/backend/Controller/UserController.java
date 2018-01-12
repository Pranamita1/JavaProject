package com.collaboration.backend.Controller;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.collaboration.backend.Collaboration.Backend.Dao.UserDao;
import com.collaboration.backend.Collaboration.Backend.Model.User;

@RestController
public class UserController {
	@Autowired
	UserDao userDao;
	@Autowired
	User user;
	@Autowired
	HttpSession session;
	
	 
	@RequestMapping("/")
	public ModelAndView view(){
		ModelAndView view=new ModelAndView("HelloWorld");
		return view;
		
	}
	
	@PostMapping(value="/register" ,consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> userRegistration(@RequestBody User user){
		
		userDao.saveUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PostMapping(value="/login")
	public ResponseEntity<User> userLogin(@RequestBody User user){
 		
		 System.out.println("Entering Rest Controller");
		 System.out.println(user.getEmailId()+" "+user.getPassword());
		 
		User u = userDao.validate(user.getEmailId(), user.getPassword());
		if(u == null)
		{
			
			return new ResponseEntity("Invalid Username and Password", HttpStatus.NOT_FOUND);
		}
		else
		{
			System.out.println("Validate userName and password");
			session.setAttribute("username",user.getEmailId());
			
			return new ResponseEntity<User>(u,HttpStatus.OK);
		}
	}
	
	

}
