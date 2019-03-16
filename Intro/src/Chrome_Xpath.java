import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/BrianHanna/Desktop/selenium-jar-files/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		// Xpath syntax:  "//tagName[@attribute='value']"
		// validate in Browser Console: $x(" ")
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhanna1693@yahoo.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jrp612");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='error_box']")).getText());
		
		// Xpath Regular Expression syntax:  "//tagName[contains(@attribute, 'value')]"
		// good for finding attributes with long value names or values that change
		// ex) "//input[contains(@name, 'pass')]"
	}

}
