package Com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().forward();
		driver.navigate().back();
		String title= driver.getTitle();
		System.out.println(title);
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().refresh();
		driver.close();
		
		
		

}
}
