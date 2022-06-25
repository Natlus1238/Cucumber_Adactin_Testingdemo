package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features" , 
glue = "com.adactin.stepdefinition", monochrome = true, 
dryRun = false, strict = true, tags =("@Smoketest"),
plugin = {"html:Report/HTMLReport",
		"pretty",
		"json:Report/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})
public class Addactin_Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_selection() {
		driver = Base_Class.gettingBrowser("chrome");
	
	}
	
	@AfterClass
	public static void brower_close() {
		driver = Base_Class.closebrowser();

	}
	
	
	
	
	

}
