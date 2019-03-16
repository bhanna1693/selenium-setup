import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		// Create Driver object for Firefox Browser
		System.setProperty("webdriver.gecko.driver",  "/Users/BrianHanna/Desktop/selenium-jar-files/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
