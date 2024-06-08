package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountDropDown {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement>elements=driver.findElements(By.tagName("Select"));
		System.out.println("Total No of DropDown are :"+elements.size());
	}

}
 
