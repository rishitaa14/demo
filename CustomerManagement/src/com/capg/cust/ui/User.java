package com.capg.cust.ui;

import java.util.Scanner;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerServiceImp;
import com.capg.cust.service.ICustomerService;

public class User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ICustomerService service = new CustomerServiceImp();
		while (true) {
			
			System.out.println("Welcome to CMS");
			System.out.println("1.add customer");
			System.out.println("2.update customer");
			System.out.println("3.select customer");
			System.out.println("4.delete customer");
			System.out.println("5.getall customers");
			System.out.println("6.exit");
			System.out.println("enter choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Customer customerbean = new Customer();
				System.out.println("Enter id:");
				int cid = scan.nextInt();
				System.out.println("Enter name:");
				String cname = scan.next();
				System.out.println("Enter amount:");
				double amount = scan.nextDouble();
				System.out.println("enter date of purchase:");
				/*
				 * LocalDate dop=LocalDate.of(arg0, arg1, arg2)
				 */ /* new Date(2020,02,07); */
				customerbean.setCid(cid);
				customerbean.setCname(cname);
				customerbean.setAmount(amount);
				boolean isValid=CustomerServiceImp.userValidations(customerbean);
                if(isValid) {
				service.addCustomer(customerbean);
                }
                else {
                	System.err.println("invalid input data");
                }
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid choice:");
				break;

			}

		}
	}
}
