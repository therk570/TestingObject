package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfunction {

	public static void main(String[] args) {
		WebDriver obj= new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://practicetestautomation.com/practice-test-login");
		obj.findElement(By.id("username")).sendKeys("student");
		obj.findElement(By.name("password")).sendKeys("Password123");
		obj.findElement(By.className("btn")).click();
		
		
		int totalnooflink=obj.findElements(By.tagName("a")).size();      
        System.out.println("Total no. of links "+totalnooflink);
	}

}
