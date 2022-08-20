package Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAndTabsEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String Parentwin=driver.getWindowHandle();
		System.out.println(Parentwin);
		

		WebElement button1 = driver.findElement(By.id("tabButton"));
		button1.click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		for(String win: allwin)
		{
			System.out.println(win);
			if(!win.equals(Parentwin))  //if win not equals to parent then switch the driver.
			{
				driver.switchTo().window(win);
			}
			
		}
		
		
		
		WebElement childheader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childheader.getText());
		
	//	driver.close(); // this will close child window
		
		driver.switchTo().window(Parentwin);  //switch back to parent win
		
		WebElement winbutton = driver.findElement(By.id("windowButton"));
		winbutton.click();
		
		driver.quit();
		
		
	
		
	}

}
