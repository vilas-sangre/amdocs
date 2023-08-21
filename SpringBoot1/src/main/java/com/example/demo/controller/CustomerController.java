package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping("/customer")
	public Customer getCustomer()
	{
		
		Customer customer=new Customer("Sameer", "Sharma", 2, "400708", "sameer@gmail.com");
		return customer;
	}
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers()
	{
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer("Sameer1", "Sharma1", 2, "400708", "sameer@gmail.com"));
		customerList.add(new Customer("Sameer2", "Sharma2", 2, "400708", "sameer@gmail.com"));
		customerList.add(new Customer("Sameer3", "Sharma3", 2, "400708", "sameer@gmail.com"));
		customerList.add(new Customer("Sameer4", "Sharma4", 2, "400708", "sameer@gmail.com"));
		return customerList;
	}

}
