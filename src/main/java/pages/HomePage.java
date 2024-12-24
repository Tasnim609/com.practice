package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;
	@FindBy(xpath = "//input[@id='cms-login-userId']")
	WebElement userId;
	@FindBy(xpath = "//input[@id='cms-login-password']")
	WebElement passWord;

	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(3000);
	}
	public void clickUserId() {
		userId.click();
	}
	public void clickPassWord() {
		passWord.click();
	}
}
