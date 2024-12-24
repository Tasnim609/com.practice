package baseUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
public WebDriver driver;
public HomePage homePage;
@BeforeMethod
public void setUp() {
	driver =new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver", "/Users/muhammadquarashy/eclipse-workspace/com.practice/driver/chromedriver");
	driver.manage().window().maximize();
	driver.get("https://portal.cms.gov/portal/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	 homePage=new HomePage(driver);
	
}
@AfterMethod
public void tearUp() {
	driver.quit();
}
}
