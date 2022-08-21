package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerEx {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		WebElement button = driver.findElement(By.xpath("//input[@id='dob']"));
		button.click();
		

		WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));		
		
		Select dmon = new Select(mon);
		dmon.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select dyear = new Select(year);
		dyear.selectByVisibleText("2000");
		
		WebElement date = driver.findElement(By.xpath("//a[@data-date='25']"));
		date.click();
		
		
		
		
		
		
	}

}
