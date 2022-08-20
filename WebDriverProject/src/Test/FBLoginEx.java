package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  //wedriver is interface
		WebDriver driver = new ChromeDriver();  // create a object with instance of webdriver.
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	//	WebElement UserName = driver.findElement(By.css("input#email"));
		UserName.sendKeys("Sowmi3v@gmail.com");
		System.out.println(UserName.getText());
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Sowmya@123");
		System.out.println(password.getText());
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		System.out.println(login.getText());
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
