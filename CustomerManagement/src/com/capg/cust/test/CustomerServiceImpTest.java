package com.capg.cust.test;

import static org.junit.Assert.assertEquals;


import java.sql.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerServiceImp;
import com.capg.cust.service.ICustomerService;

class CustomerServiceImpTest {

	 static ICustomerService service;

	@BeforeAll
	public static void setUp() {
		service = new CustomerServiceImp();
	}

	@Test
	void testAddCustomer() {
	 Customer cust=new Customer();
	 cust.setCid(505);
	 cust.setCname("Rishita");
	 cust.setAmount(900000);
	cust.setDop(new Date(2020, 02,12));
	int res= service.addCustomer(cust);
	
		
		assertEquals(1,res);
		
	}

	@Test
	void testIsValidCid() {
		
	}

	@Test
	void testIsValidCname() {
		
	}
	@Test
	void testUserValidations() {
		
	}

}
