package com.hema.maven_project;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest extends App{

	public static WebDriver wd;
	
    @Test
    public void shouldAnswerWithTrue()
    {
      
       wd.findElement(By.name("txtUsername")).sendKeys("Admin");
       wd.findElement(By.name("txtPassword")).sendKeys("admin123");
       wd.findElement(By.id("btnLogin")).click();
    }
}
