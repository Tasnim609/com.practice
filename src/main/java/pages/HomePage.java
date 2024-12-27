package pages;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constants.Attribute;

//new, you have to manually write it to get access of common actions
//this is possible when they are static in nature, * means all
//This is called static import
import static common.CommonActions.*;
import static common.CommonWaits.*;


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

	@FindBy(xpath = "//a[text()='User ID']")
	WebElement forgetUserId;
	@FindBy(xpath = "//a[contains(text(),'Pass')]")
	WebElement forgetPassWord;
	@FindBy(id = "cms-newuser-reg")
	WebElement newUserRegestrationElement;
	@FindBy(id = "cms-unlock-account")
	WebElement unlock;
@FindBy(xpath = "//a[@id='cms-terms-cond']")
WebElement termsAndConditionElement;
@FindBy(id = "cms-login-submit")
WebElement loginButton;
@FindBy(xpath = "//label[@id='cms-label-tc']")
WebElement iAgreeToTheTermsAndCondition;
@FindBy(tagName = "header")
WebElement headerTag;
@FindBy(id = "cms-login-submit")
WebElement logInButton;

	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(3000);
	}

	public void clickUserId() throws InterruptedException {
		userId.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("abc");
		Thread.sleep(4000);
	}

	public void clickPassWord() {
		passWord.click();
	}
public void logIn() {
	boolean enabled = loginButton.isEnabled();
	System.out.println(enabled);
	loginButton.click();
}
	public void clickforgetUserID() {
		forgetUserId.click();
	}

	public void clickforgetPassWord() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		forgetPassWord.click();

	}

	public void clickNewUserRegestration() {
		newUserRegestrationElement.click();
	}

	public void clickUnlock() {
	
		unlock.click();
	}
	public void logoDisplay() {
		boolean displayed = driver.findElement(By.id("cms-homepage-login-logo")).isDisplayed();
		System.out.println(displayed);
	}
	public void logInProsses() {
		pause(3000);
	
		userId.sendKeys("enthrall_12");
		pause(3000);
		passWord.sendKeys("OnthrallTest@1234");
		pause(3000);
		
		iAgreeToTheTermsAndCondition.click();
		boolean selected = iAgreeToTheTermsAndCondition.isSelected();
		System.out.println("iAgreeToTheTermsAndCondition.isSelected ?"+selected);
	//	termsAndConditionElement.click();
		pause(3000);
		loginButton.click();
		pause(3000);
		
	}
	public void clickHeader() {
		headerTag.click();
	}
	
	public void amazonTabl() {
		pause(3000);
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.tagName("table")).click();
		
	}
}
