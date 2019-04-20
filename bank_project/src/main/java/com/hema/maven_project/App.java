package com.hema.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class App {

    WebDriver wd;


@Test
public void open_browser() throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	wd=new ChromeDriver();
	wd.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	wd.manage().window().maximize();
	System.out.println(wd.getCurrentUrl());
	System.out.println(wd.getTitle());
	
	
	
}

@AfterTest
public void closing_browser(){
	wd.quit();
}

    
        
    
} 

