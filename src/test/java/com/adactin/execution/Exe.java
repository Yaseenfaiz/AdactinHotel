package com.adactin.execution;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.adactin.baseclass.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Exe extends BaseClass{
	
	@Test
	public void test1() {
		System.out.println("rocky");
	}
	@Test
	public void test2() {
		String a = "radha";
		Assert.assertFalse(a.contains("e"));
		System.out.println("gnanam");
	}
	@Test
	public void test3() {
		System.out.println("radha");
	}
	@Test
	public void test4() {
		ExtentTest createTest = ee.createTest("Adaction Hotel");
		createTest.log(Status.FAIL, "Home Page");
		System.out.println("guna");
	}
	@Test
	public void test5() {
		System.out.println("ashok");
	}

}
