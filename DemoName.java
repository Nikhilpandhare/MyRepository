package Locaters;   //(name locater)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to launch browser
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	
		//to Maximize window 
		driver.manage().window().maximize();
		
		//to locate first Name texbox-- by name locater
		driver.findElement(By.name("firstname")).sendKeys("NIKHIL");
		
		//to locate last Name texbox-- by name locater
		driver.findElement(By.name("lastname")).sendKeys("Abcd");
		
		//to locate Email texbox-- by name locater
		driver.findElement(By.name("email")).sendKeys("Nikhil123@email.com");
				
		//to locate Telephone texbox-- by name locater
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		
		//to locate PassWorld texbox -- by name locater
	    driver.findElement(By.name("password")).sendKeys("xyz123");
				
		//to locate ConfirmPassWorld texbox-- by name locater
	    driver.findElement(By.name("confirm")).sendKeys("xyz123");
				
	}

}
