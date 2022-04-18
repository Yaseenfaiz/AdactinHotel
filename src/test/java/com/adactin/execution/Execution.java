package com.adactin.execution;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.adactin.baseclass.BaseClass;
import com.adactin.pageexecution.BookHotelExecution;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Execution extends BookHotelExecution {
	
	@Test
	public void method5() {
		ExtentTest createTest = ee.createTest("Adaction Hotel");
		createTest.log(Status.FAIL, "Home Page");
		System.out.println("1");
	}
	@Test
	public void method2() {
		ExtentTest createTest = ee.createTest("Adaction Hotel");
		createTest.log(Status.PASS, "Login File");
		System.out.println("2");
	}
	@Test @Ignore
	public void method1() {
		System.out.println("3");
	}
	@Test
	public void method4() {
		ExtentTest createTest = ee.createTest("Adaction Hotel");
		createTest.log(Status.PASS, "Login File");
		System.out.println("4");
	}
	@Test
	public void method3() {
		System.out.println("5");
	}
	
//	@Test
//	public void test() {
//		BaseClass.getUrl("https://adactinhotelapp.com/");
//		// login
//		username();
//		password();
//		login();
//	}
//
//	@Test
//	public void test1() {
//		// search hotel
//		location();
//		hotel();
//		roomType();
//		noOfRooms();
//		checkIn();
//		checkOut();
//		adultRoom();
//		childRoom();
//		clickButton();
//		radioButton();
//		continueButton();
//	}
//
//	@Test @Ignore
//	public void test2() {
//		// book hotel
//		firsName();
//		lastName();
//		address();
//		creditCardNum();
//		creditCardType();
//		expiryMonth();
//		expiryYear();
//		cvvNum();
//		buttonClick();
//		bookingOrder();
//
//		// logout
////		logoutButton();
//	}
}
