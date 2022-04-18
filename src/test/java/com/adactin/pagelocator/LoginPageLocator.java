package com.adactin.pagelocator;

import org.openqa.selenium.By;

import com.adactin.baseclass.BaseClass;

public class LoginPageLocator extends BaseClass{
	//abstract method
	public static By username = By.id("username");
	public static By loginButon = By.id("login");
	
	//non abstract method
	public static String password = "password";
}
