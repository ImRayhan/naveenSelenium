package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_25_2 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.get("https://html.com/attributes/select-multiple/");
		By a = By.xpath("//select[@size='6']");
		By aoptioLocator = By.xpath("//select[@size='6']");

		// Select sel = new Select(driver.findElement(a));
		// sel.isMultiple();
		// System.out.println(sel.isMultiple());
		selectDropDownMultiValue(a, aoptioLocator, "Chilean flamingo");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static boolean DropDownMultifleOrNot(By locator) {
		Select sel = new Select(getElement(locator));
		return sel.isMultiple() ? true : false;

	}

	public static void selectDropDownMultiValue(By locator, By optioLocator, String... value) {

		Select sel = new Select(getElement(locator));

		if (DropDownMultifleOrNot(locator)) {

			if (value[0].equalsIgnoreCase("all")) {

				List<WebElement> optionList = driver.findElements(optioLocator);
				for (WebElement string2 : optionList) {
					string2.click();

				}

			} else {
				for (String string2 : value) {
					sel.selectByVisibleText(string2);

				}

			}

		}

	}

}
