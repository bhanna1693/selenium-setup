import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_CssPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/BrianHanna/Desktop/selenium-jar-files/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		// CSS selector syntax:  "tagName[attribute='value']"   or   "tagName#id" or "#id"   or   "tagName.className"
		// validate in Browser Console: $(" ")
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("bhanna1693@yahoo.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Score612");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error_box"))); // unable to find? nesting div?
	
		// CSS Regular Expression syntax:  "tagName[attribute*='value']"
		// good for finding attributes with long value names or values that change
		// ex) "input[value*='email']"
	}

}
