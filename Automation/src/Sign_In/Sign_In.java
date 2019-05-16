package Sign_In;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class Sign_In {

	public static void main(String[] args) throws InterruptedException  {		
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspace\\Automation\\Browser\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.goibibo.com");
        
        driver.manage().window().maximize();
		
        driver.findElement(By.id("get_sign_in")).click();
        
        Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("8858558819");
       
        
    
     
	}

}
