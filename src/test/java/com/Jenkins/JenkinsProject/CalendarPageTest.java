package com.Jenkins.JenkinsProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarPageTest {
	@BeforeClass 
	public static void beforeTest(){
		System.out.println("Before Test Calendar class at before test");
	}
	@Test
	public static void  Calendar(){
		System.out.println("Select calendar page at test class");
	}
	
	@AfterClass 
	public static void afterTest (){
		System.out.println("Display Calendar of after test");
	}


}
