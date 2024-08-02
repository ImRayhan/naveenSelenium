package seleniumsessions;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class CalendarHandling {

	    static WebDriver driver;

	    public static void main(String[] args) {
	        driver = new ChromeDriver();
	        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	        driver.findElement(By.id("datepicker")).click();

	        String actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	        System.out.println(actMonYear);  // Example output: "June 2023"

	        selectFutureDate("February 2024", 30);
	    }

	    public static void selectFutureDate(String expMonthYear, int day) {
	        // Handle invalid dates for February
	        if (expMonthYear.contains("February") && day > 29) {
	            System.out.println("Wrong day is passed...please pass the right day/date for Feb: " + day);
	            return;
	        }

	        // Handle invalid dates for months with 31 days
	        if (day > 31) {
	            System.out.println("Wrong day is passed...please pass the right date: " + day);
	            return;
	        }

	        // Handle invalid dates where day is less than or equal to 0
	        if (day <= 0) {
	            System.out.println("Wrong day is passed...please pass the right date: " + day);
	            return;
	        }

	        String actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	        System.out.println(actMonYear);  // Example output: "June 2023"

	        while (!actMonYear.equalsIgnoreCase(expMonthYear)) {
	            // Click on next icon:
	            driver.findElement(By.xpath("//span[text()='Next']")).click();
	            actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	        }

	        selectDate(String.valueOf(day));
	    }

	    public static void selectDate(String day) {
	        driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	    }
	}


