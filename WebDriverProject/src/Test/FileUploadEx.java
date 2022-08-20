package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement fileupload = driver.findElement(By.name("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\vsowmyasri\\Documents\\DXC TECH\\MODULES PDF's\\JAVA");
		
		WebElement term = driver.findElement(By.className("field_check"));
		term.click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();		

	}

}
