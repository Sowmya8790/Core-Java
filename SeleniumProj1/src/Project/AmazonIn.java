package Project;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		//Launch Amazon.in
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//Search for Samsung
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("Samsung");
		
		//Click Search Button
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		
		//List of Product Details 
		List<WebElement> name = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2/a"));
		System.out.println("Total no of results :" +name.size());
		
		//List of price for that product
		List<WebElement> price = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-price']"));
		
		//Print Product and price Details 
	     for(int i=0;i<name.size();i++)
	     {
	    	 System.out.println("Name of mobile and price " +name.get(i).getText() + "     " + price.get(i).getText());
	    	 
	     }
		
	     //Parent window Handler
	     String parentwindowid = driver.getWindowHandle();
	     
	     //Fetch string to validate on Parent Window
	     String Expectedvalue = name.get(0).getText();
	     
	    //Click on First Product Link
	     name.get(0).click();
	     
	    //Getting Parent and child Window Handler
	     
	     Set<String> windowid = driver.getWindowHandles();
	     
	    //Switching Window Handlers
	     for(String win:windowid)
	     {
	    	 System.out.println(win);
	    	 
	    	 if(!win.equals(parentwindowid))
	    	 {
	    		 driver.switchTo().window(win);
	    	 }
	     }
	     
	     
	     //Fetch Header String on child window
	     
	     WebElement title = driver.findElement(By.xpath("//span[@id='productTitle']"));
	     
	     String str = title.getText();
	     
	     //Validating weather the product in parent window equals with child widow text
	     if(str.equals(Expectedvalue))
	     {
	    	 System.out.println("The title is matching");
	     }
	     else
	     {
	    	 System.out.println("The title is not matching");
	     }
	     
	     driver.quit();
		

	}

}
