package Com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\dell\\eclipse-workspace\\Selenium_Project\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("test123@gmail.com");
	WebElement passw= driver.findElement(By.id("pass"));
	passw.sendKeys("1234567890");
	WebElement login = driver.findElement(By.name("login"));
    login.click();
	
	
	
	}

}
