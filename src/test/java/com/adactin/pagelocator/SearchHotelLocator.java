package com.adactin.pagelocator;

import org.openqa.selenium.By;

public class SearchHotelLocator extends LoginPageLocator {
	// abstract method
	public static By location = By.id("location");
	public static By roomType = By.id("room_type");
	public static By roomNos = By.id("room_nos");
	public static By submitButton = By.id("Submit");

	// non abstract method
	public static String hotel = "hotels";
	public static String checkIn = "datepick_in";
	public static String checkOut = "datepick_out";
	public static String adultRoom = "adult_room";
	public static String childRoom = "child_room";
	public static String radioButton = "radiobutton_0";
	public static String continueButton = "continue";

}
