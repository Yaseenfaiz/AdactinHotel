package com.adactin.pageexecution;

import com.adactin.baseclass.BaseClass;
import com.adactin.pagelocator.BookHotelLocator;
import com.adactin.pagelocator.LoginPageLocator;

public class LoginPageExecution extends BookHotelLocator {
	
	public static void username() {
		BaseClass.inputData(BaseClass.findElementBy(LoginPageLocator.username), BaseClass.propertyFile("username"));
	}

	public static void password() {
		BaseClass.inputData(BaseClass.byId(LoginPageLocator.password), BaseClass.propertyFile("password"));
	}
	
	public static void login() {
		BaseClass.clickElement(BaseClass.findElementBy(LoginPageLocator.loginButon));
	}
}
