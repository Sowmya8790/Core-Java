package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  //wedriver is interface
		WebDriver driver = new ChromeDriver();  // create a object with instance of webdriver.
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//click on login link
		
		WebElement Loginlink = driver.findElement(By.linkText("Log in"));  //by will find the element where login is there
		Loginlink.click();
		
		// select unique attribute using inspect
		
		//step 2 : Enter UserName
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("So@gmail.com");
		
		//step:3 Enter password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Saiuio@123");
		
		//Step 5: Click on remember me
		
		WebElement Checkbox =driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		
	
		WebElement Login = driver.findElement(By.name("btn_login"));
		Login.click();
		
		//Step =6 Validate error msg on screan
		WebElement Error =driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		System.out.println(ActError);
		String ExpError = "The email or password you have entered is valid.";
		
		if(ActError.equals(ExpError))
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Tc failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are " +Links.size());
		
		for(int i =0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getAttribute("href"));  //href is anchor Tag.
		}
		
		
		//Step 7: Close browser
		driver.close();
		
		
	}

}
