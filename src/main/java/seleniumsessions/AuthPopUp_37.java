package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp_37 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//Browser
		
		String userName = "admin";
		String password = "admin";
		
		//Basic Auth
		driver.get("https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
		
	}

}
