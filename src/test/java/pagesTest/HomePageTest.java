package pagesTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseUtils.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true )
	
 	public void logoTest() throws InterruptedException {
		homePage.clickLogo();
	} 
	@Test(enabled = false , priority = 1)
	public void userTest() throws InterruptedException {
		homePage.clickUserId();
	}
	@Test(enabled = false , priority = 4)
	public void passWodTest() {
		homePage.clickPassWord();
	}
	@Test
	public void logInTest() {
		homePage.logIn();
	}
	@Test(enabled=false ,priority = 3)
	public void clickforgetUserIDTest() {
		homePage.clickforgetUserID();
	}
	@Test(enabled=false ,priority = 5)
	public void clickforgetPassWordTest() {
		homePage.clickforgetPassWord();
	}
	@Test(enabled=false ,priority = 7)
	public void clickNewUserRegestrationTest() {
		homePage.clickNewUserRegestration();
	}
	@Test(enabled=false ,priority = 6)
	public void clickUnlockTest() {
		homePage.clickUnlock();
	}
	@Test
	public void logInProssesTest() {
		homePage.logInProsses();
	}
	@Test
	public void amazonTablTest() {
		homePage.amazonTabl();
	}
	@Test
	
	public void clickHeaderTest() {
		homePage.clickHeader();
	}
	@Test
	public void logoDisplayTest() {
	homePage.logoDisplay();
	}
}
