package dropdownHandling;

import java.sql.Driver;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UNtesting {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	String id =driver.getWindowHandle();
	System.out.println("the window id is"+id); 
	// System.out.println(driver.getCurrentUrl());
	// system.out.println(driver.getTitle());
	 
	        
	
	// driver.findElement(By.id("username")).sendKeys("Rahul");
	// driver.findElement(By.id("password")).sendKeys("haggu");
   // driver.findElement(By.id("submit")).click();
	
	}

}
