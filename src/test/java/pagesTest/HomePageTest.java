package pagesTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseUtils.BaseClass;

public class HomePageTest extends BaseClass {
	@Test
	
	public void logoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	@Test
	public void userTest() {
		homePage.clickUserId();
	}
	@Test
	public void passWodTest() {
		homePage.clickPassWord();
	}

}
