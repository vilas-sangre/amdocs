package com.amdocs.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amdocs.model.Customer;


@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/loginPost",method = RequestMethod.POST)
	public ModelAndView loginPost(@RequestParam String userName,@RequestParam String password,
			HttpServletResponse response) throws IOException{
		ModelAndView model=new ModelAndView("admin");
		
		System.out.println("UserName="+userName+" Password="+password);
		if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
			 return new ModelAndView("admin");
		else if(userName.equalsIgnoreCase("user") && password.equalsIgnoreCase("user"))
			 return new ModelAndView("user");
		else 
			return new ModelAndView("login");
		
	}
	
	
	@RequestMapping(value="/registration")
	public ModelAndView registration(HttpServletResponse response) throws IOException{
		return new ModelAndView("registration");
	}
	
	@RequestMapping(value="/registration",method = RequestMethod.POST)
	public ModelAndView registrationPost(Customer theCustomer,
			HttpServletResponse response) throws IOException{		
				System.out.println(theCustomer);		
			return new ModelAndView("registration");
		
	}
	

}
