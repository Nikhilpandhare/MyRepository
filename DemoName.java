package Locaters;   

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoName {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	 
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("NIKHIL");
		
		driver.findElement(By.name("lastname")).sendKeys("Abcd");
		
		driver.findElement(By.name("email")).sendKeys("Nikhil123@email.com");
				
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		
	    driver.findElement(By.name("password")).sendKeys("xyz123");
				
	    driver.findElement(By.name("confirm")).sendKeys("xyz123");		
	}
}

