package synchronization; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOrangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //launch browser
		WebDriver driver=new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	       
        //launch Url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		//to Maximize window 
		driver.manage().window().maximize();
		
		//login process
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
		
		//logout process
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}

