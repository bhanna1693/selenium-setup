import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		// Create Driver object for Chrome Browser
		System.setProperty("webdriver.chrome.driver",  "/Users/BrianHanna/Desktop/selenium-jar-files/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());  // validates page title
		
		System.out.println(driver.getCurrentUrl());  // validates URL
		
		driver.get("http://www.yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); // closes current browser
		driver.quit();  // closes all browsers opened by Selenium script
	}

}
