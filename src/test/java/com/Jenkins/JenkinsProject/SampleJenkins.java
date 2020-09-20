package com.Jenkins.JenkinsProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SampleJenkins {
	@BeforeClass 
	public static void beforeTest(){
		System.out.println("Before Test ");
	}
	@Test
	public static void  Calendar(){
		System.out.println("Selected Calendar");
	}
	
	@AfterClass 
	public static void afterTest (){
		System.out.println("Display Calendar");
	}

}
