package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		button1.click();
		
		Alert alret = driver.switchTo().alert();
		System.out.println(alret .getText());
		alret.accept();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		button3.click();
		
		alret = driver.switchTo().alert();
		System.out.println(alret .getText());
		alret.dismiss();
		
		WebElement button4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		button4.click();
		
		alret=driver.switchTo().alert();	
		alret.sendKeys("Please Accept");
		alret.accept();
	}

}
