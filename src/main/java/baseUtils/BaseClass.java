package baseUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
public WebDriver driver;
public HomePage homePage;
@BeforeMethod
public void setUp() {
	
	driver =new ChromeDriver();
	//driver =new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "/Users/muhammadquarashy/eclipse-workspace/com.practice/driver/chromedriver");
	System.setProperty("webdriver.chrome.drive", "./driver/chromedriver");
	//System.setProperty("webdriver.gecko.drive", "./driver/geckodriver");
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.edgedriver().setup();
	//WebDriverManager.safaridriver().setup();
//	driver =new SafariDriver();
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
