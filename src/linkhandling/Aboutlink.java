package linkhandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Aboutlink {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://practicetestautomation.com/practice-test-login");
   
   List<WebElement> elements =driver.findElements(By.tagName("a"));
   System.out.println("total no. of links"+elements.size());
   
    for (int i = 0; i < elements.size(); i++) {
    	
    	System.out.println(elements.get(i).getText());
    	
	   
	
}
	   
	   
		   
	
}
   
   
   
   
   
	}


