import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		// Create Driver object for Chrome Browser
		System.setProperty("webdriver.chrome.driver",  "/Users/BrianHanna/Desktop/selenium-jar-files/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());  // validates page title
		
		System.out.println(driver.getCurrentUrl());  // validates URL
		

		// ways to access element: Id, ClassName, Name, linkText, Xpath, Css
		// every object may not have Id, ClassName, Name: Xcode, Css preferred
		driver.findElement(By.id("email")).sendKeys("my first selenium code");
		driver.findElement(By.name("pass")).sendKeys("Score612");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("new code");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		
		// Custom Xpath syntax:  "//tagName[@attribute='value']"
//		driver.quit();  // closes all browsers opened by Selenium script
	}

}
