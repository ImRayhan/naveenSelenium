package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest_10 {

	public static void main(String[] args) {

		BrowserUtil_5 brUtil = new BrowserUtil_5();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		
		By eId = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil_12 eleUtil = new ElementUtil_12(driver);
		eleUtil.doSendKeys(eId, "naveen@gmail.com");
		eleUtil.doSendKeys(pwd, "test@123");
		
		brUtil.closeBrowser();
		
		
	}

}
