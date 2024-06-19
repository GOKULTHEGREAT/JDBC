package com.ilp04.service;

import java.util.ArrayList;

import ilp04DBconnectivity.entity.Customer;

public interface CustomerService {
	public ArrayList<Customer> getAllCustomers();
	public int insertIntoCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	
	
}
