package com.adactin.pageexecution;

import com.adactin.baseclass.BaseClass;
import com.adactin.pagelocator.SearchHotelLocator;

public class SearchHotelExecution extends LoginPageExecution {

	public static void location() {
		BaseClass.dropdownByVisibleText(BaseClass.findElementBy(SearchHotelLocator.location), excelRead(1, 0));
	}

	public static void hotel() {
		BaseClass.dropdownByVisibleText((BaseClass.byId(SearchHotelLocator.hotel)), excelRead(1, 1));
	}

	public static void roomType() {
		BaseClass.dropdownByVisibleText(BaseClass.findElementBy(SearchHotelLocator.roomType), excelRead(1, 2));
	}

	public static void noOfRooms() {
		BaseClass.dropdownByVisibleText(BaseClass.findElementBy(SearchHotelLocator.roomNos), excelRead(1, 3));
	}

	public static void checkIn() {
		BaseClass.inputData(BaseClass.byId(SearchHotelLocator.checkIn), excelRead(4, 0));
	}

	public static void checkOut() {
		BaseClass.inputData(BaseClass.byId(SearchHotelLocator.checkOut), excelRead(4, 1));
	}

	public static void adultRoom() {
		BaseClass.dropdownByVisibleText(BaseClass.byId(SearchHotelLocator.adultRoom), excelRead(4, 2));
	}

	public static void childRoom() {
		BaseClass.dropdownByVisibleText(BaseClass.byId(SearchHotelLocator.childRoom), excelRead(4, 3));
	}

	public static void clickButton() {
		BaseClass.clickElement(BaseClass.findElementBy(SearchHotelLocator.submitButton));
	}
	
	public static void radioButton() {
		BaseClass.clickElement(BaseClass.byId(SearchHotelLocator.radioButton));
	}
	
	public static void continueButton() {
		BaseClass.clickElement(BaseClass.byId(SearchHotelLocator.continueButton));
	}

}
