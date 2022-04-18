package com.adactin.pageexecution;

import com.adactin.baseclass.BaseClass;
import com.adactin.pagelocator.BookHotelLocator;

public class BookHotelExecution extends SearchHotelExecution{

	public static void firsName() {
		BaseClass.inputData(BaseClass.byId(BookHotelLocator.firstName), excelRead(7, 0));
	}
	
	public static void lastName() {
		BaseClass.inputData(BaseClass.byId(BookHotelLocator.lastName), excelRead(7, 1));
	}
	
	public static void address() {
		BaseClass.inputData(BaseClass.byId(BookHotelLocator.address), excelRead(7, 2));
	}
	
	public static void creditCardNum() {
		BaseClass.inputData(BaseClass.byId(BookHotelLocator.creditCardNum), excelRead(10, 0));
	}
	
	public static void creditCardType() {
		BaseClass.dropdownByVisibleText(BaseClass.byId(BookHotelLocator.creditCardType), excelRead(10, 1));
	}
	
	public static void expiryMonth() {
		BaseClass.dropdownByVisibleText(BaseClass.byId(BookHotelLocator.expiryMonth), excelRead(10, 2));
	}
	
	public static void expiryYear() {
		BaseClass.dropdownByVisibleText(BaseClass.byId(BookHotelLocator.expiryYear), excelRead(10, 3));
	}
	
	public static void cvvNum() {
		BaseClass.inputData(BaseClass.byId(BookHotelLocator.cvvNum), excelRead(10, 4));
	}
	
	public static void buttonClick() {
		BaseClass.clickElement(BaseClass.byId(BookHotelLocator.bookNowButton));
	}
	
	public static void bookingOrder() {
		BaseClass.waitForElement(BookHotelLocator.orderWait);
		String attributeByValue = BaseClass.getAttributeByValue(BaseClass.byId(BookHotelLocator.orderNo));
		BaseClass.excelwrite(attributeByValue);
	}
	
	public static void logoutButton() {
		BaseClass.clickElement(BaseClass.byId(BookHotelLocator.logoutButton));
	}
	
}
