package com.ilp04.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.ilp04.DAO.CustomerDAO;

import ilp04DBconnectivity.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
	
		public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		CustomerDAO customerDAO = new CustomerDAO();
		Connection connection = customerDAO.getConnection();
		customerList = customerDAO.getAllCustomers(connection);
		
		return customerList;
	}
	public int insertIntoCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

}
