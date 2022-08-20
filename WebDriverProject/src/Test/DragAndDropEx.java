package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement from = driver.findElement(By.xpath("//li[@id='credit2']/a"));  //from
		
		//Where to drag the destination account locator --->to
		
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));  //or //ol[@id='bank']/li
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
		//Scrolling on page
		
		
		

	}

}
