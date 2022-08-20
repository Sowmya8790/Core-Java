package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  //wedriver is interface
		WebDriver driver = new ChromeDriver();  // create a object with instance of webdriver.
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Signup = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		Signup.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@type='text']"));
		FirstName.sendKeys("Sowmya");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Sri");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("Sowmi3v@gmail.com");
		
		WebElement email1 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		email1.sendKeys("Sowmi3v@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Sowmya@123");
		
		WebElement BDAY = driver.findElement(By.xpath("//select[@id='day']"));
		BDAY.click();
		
		Select day = new Select(BDAY);
		day.selectByVisibleText("25");
		
		WebElement Bmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Bmonth.click();
		
		Select month = new Select(Bmonth);
		month.selectByVisibleText("Mar");
		
		//To display all the months
		
		/*List<WebElement> months = month.getOptions();
		for(WebElement ele:months)
		{
			System.out.println(ele.getText());
		}*/
		
		//To display all the months
		
	/*	List<WebElement> months =driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		
		for(WebElement ele:months)
		{
			System.out.println(ele.getText());
		}
		*/
		
		//To find the default or selected option.
		
//		System.out.println("The selected options is: " +month.getFirstSelectedOption().getText());
		
			//To find the default or selected option without using predefined method.
		
		WebElement defaultmonth = driver.findElement(By.xpath("//*[@id=\"month\"]/option[@Selected='1']"));
		System.out.println(defaultmonth.getText());
		
		WebElement Byear = driver.findElement(By.xpath("//select[@id='year']"));
		Byear.click();
		
		Select year = new Select(Byear);
		year.selectByVisibleText("2000");
		
		String Gender = "Male";
		
	/*	WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		if(Gender.equals("female"))
		{
			female.click();
		}
		if(Gender.equals("Male"))
		{
			male.click();
		}
		else
			other.click();*/
		
		//Created dynamic xpath so if the value of gender is male then it click male .
		
		//Approch 1
		
	/*	String Xpath = "//label[text()='" + Gender + "']/following-sibling::input"; 
		//We have create dynamic xpath here gender is dymanic so by using concat we have input gender in path 
		
		WebElement GendgerRadioBtn = driver.findElement(By.xpath(Xpath));
		GendgerRadioBtn.click();*/
		
	//Approch 2
		
		String Xpath = "//label[text()='Placeholder']/following-sibling::input"; 
		//We have create dynamic xpath here we have to give a random string and replace that with other which we want to use
		String newxpath = Xpath.replace("Placeholder", "Female");
		
		WebElement GendgerRadioBtn = driver.findElement(By.xpath(newxpath));
		GendgerRadioBtn.click();
	
		 driver.close();
		
	

	}

}
