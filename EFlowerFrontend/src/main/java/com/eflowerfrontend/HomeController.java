package com.eflowerfrontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eflower.EFlower.Dao.ProductDao;
import com.eflower.EFlower.Dao.UserDao;
import com.eflower.EFlower.Model.Product;
import com.eflower.EFlower.Model.User;

@Controller
public class HomeController {
	@Autowired
	UserDao Dao;
    @Autowired
    ProductDao productDao;
    @Autowired
    User user;
	
	@RequestMapping("/")
	public ModelAndView view(){
		ModelAndView view=new ModelAndView("Home");
		return view;
	}
	
	@RequestMapping("/Home")
	public ModelAndView view1(){
		ModelAndView view= new ModelAndView("Home");
		return view;
	}
	

	@RequestMapping("/About")
	public ModelAndView view2(){
		ModelAndView view= new ModelAndView("About");
		return view;
	}
	

	@RequestMapping("/Contact")
	public ModelAndView view3(){
		ModelAndView view= new ModelAndView("Contact");
		return view;
	}
	
	@RequestMapping("/Sign_in")
	public ModelAndView view4(){
		ModelAndView view= new ModelAndView("Sign_in");
		return view;
	}
	
	@RequestMapping("/Sign_up")
	public ModelAndView view5(){
		ModelAndView view= new ModelAndView("Sign_up");
		view.addObject("RegistrationForm", user);
		return view;
	}
	
	@RequestMapping("/Admin")
	public ModelAndView view6(){
		ModelAndView view= new ModelAndView("Admin");
		view.addObject("product", new Product());
		return view;
	}
	
	 
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("RegistrationForm") User user){
		
		ModelAndView model=new ModelAndView("Sign_in");
		if(Dao.insertUser(user)){
			model.addObject("loginUser","You have sucessfully registerd");
		}
		
		return model;
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String insertNproduct(@ModelAttribute("product") Product product){
		
		productDao.insertProduct(product);
		return "redirect:/Admin";
	}
 	
}
