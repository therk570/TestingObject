package JavaProject2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRadio {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		//***************count on radio buttons***************
		List<WebElement> dd=driver.findElements(By.xpath("input[@type='radio']"));
		System.out.println("Total no of radio Buttons are:  "+dd.size());
		
		//***************selecting a particular radio Buttons*********
	WebElement	femaleButton=driver.findElement(By.id("radio2"));
	femaleButton.click();
	
	  //****************Names of Each and Every radio button
	  for (int i = 0; i < dd.size(); i++) {
		System.out.println(dd.get(i).getAttribute("value"));
	}
	
	
	  //*********Check whether radio button is selected or not
	  WebElement	maleBtn=driver.findElement(By.id("radio1"));
	  maleBtn.click();
	  if(maleBtn.isSelected()) {
		  System.out.println("Male radio btn is clicked");
	  }else {
		  System.out.println("not clicked");
	  }
	}

}


  

 