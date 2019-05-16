package Sign_In;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train_Vertical {

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspace\\Automation\\Browser\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.goibibo.com");
        
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//	----------------------------  Click on Train Vertical Icon--------------------------
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[5]/a/i")).click();
		
//		----------------------- Train Homepage ---------------------------
		
		driver.findElement(By.id("gosuggest_inputL")).sendKeys("Delhi");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		
		Thread.sleep(1000);
		
		WebElement webElement = driver.findElement(By.id("gosuggest_inputL"));
		
		webElement.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		webElement.sendKeys("Mumbai");
		
		webElement.sendKeys(Keys.DOWN);
		
		webElement.sendKeys(Keys.ENTER);
		
		
		
	
				
//		driver.findElement(By.xpath("//*[@id=\"gi_search\"]/div/div[2]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Mumbai");
//		
//		Thread.sleep(1000);
		
//		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
//		
	}

}
