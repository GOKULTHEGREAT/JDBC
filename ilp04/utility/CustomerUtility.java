package com.ilp04.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp04.service.CustomerService;
import com.ilp04.service.CustomerServiceImpl;

import ilp04DBconnectivity.entity.Customer;

public class CustomerUtility {
	private static CustomerService customerService = new CustomerServiceImpl();

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainMenu();
		getAllCustomers();
 
	}
 
	private static void mainMenu() {
		// TODO Auto-generated method stub
		char toContinue = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1. Display all customer interface\t 2. Insert\t 3. Update");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					getAllCustomers();
					break;
				case 2:
					insertCustomer();
					break;
				case 3:
					updateCustomer();
				default:
					System.out.print("Enter a valid option!");
			}
			System.out.println();
			System.out.print("Do you want to continue? (y/n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue == 'y');

	}
 
	private static void getAllCustomers() {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerServiceImpl();
		ArrayList<Customer> customerList = customerService.getAllCustomers();
		System.out.print("Customer code \t Customer First Name \t Customer Last Name \t Customer Address \t Customer Number \t Customer Aadhar ");
		for(Customer customer: customerList) {
			System.out.println();
			System.out.print(customer.getCustomerCode() + "\t\t\t");
			System.out.print(customer.getCustomerFirstname() + "\t\t\t");
			System.out.print(customer.getCustomerLastname() + "\t\t\t");
			System.out.print(customer.getAddress() + "\t\t\t");
			System.out.print(customer.getPhNumber() + "\t\t\t");
			System.out.print(customer.getAddharNo() + "\t\t\t");
		}
	}
//	print detail of customerList	
	private static void insertCustomer() {
		Scanner sc = new Scanner(System.in);
         
		System.out.print("Customer Code: ");
        int customerCode = sc.nextInt();
		
		System.out.print("First Name: ");
        String firstName = sc.nextLine();
 
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
 
        System.out.print("Address: ");
        String address = sc.nextLine();
 
        System.out.print("Phone Number: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
 
        System.out.print("Aadhar Number: ");
        long aadhar = sc.nextLong();
        sc.nextLine();
 
        Customer newCustomer = new Customer(customerCode, firstName, lastName, address, phoneNumber, aadhar);
        int rowsAffected = customerService.insertIntoCustomer(newCustomer);
 
        if (rowsAffected > 0) {
            System.out.println("Customer inserted successfully!");
        } else {
            System.out.println("Failed to insert customer.");
        }
    }
	private static void updateCustomer() {
 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Customer Details to Update:");
 
	    System.out.print("Customer Code: ");
	    int customerCode = sc.nextInt();
	    sc.nextLine(); // Consume newline character
 
	    System.out.print("First Name: ");
	    String firstName = sc.nextLine();
 
	    System.out.print("Last Name: ");
	    String lastName = sc.nextLine();
 
	    System.out.print("Address: ");
	    String address = sc.nextLine();
 
	    System.out.print("Phone Number: ");
	    long phoneNumber = sc.nextLong();
	    sc.nextLine(); // Consume newline character
 
	    System.out.print("Aadhar Number: ");
	    long aadhar = sc.nextLong();
	    sc.nextLine(); // Consume newline character
 
	    Customer updatedCustomer = new Customer(customerCode, firstName, lastName, address, phoneNumber, aadhar);
	    int rowsAffected = customerService.updateCustomer(updatedCustomer);
 
	    if (rowsAffected > 0) {
	        System.out.println("Customer updated successfully!");
	    } else {
	        System.out.println("Failed to update customer.");
	    }
    }
 
 
}