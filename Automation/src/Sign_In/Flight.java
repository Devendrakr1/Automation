package Sign_In;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flight {

	public static void main(String[] args) throws Exception {
	

		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspace\\Automation\\Browser\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.goibibo.com");
        
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[1]/a/i")).click();
        
        Thread.sleep(2000);
        
        WebElement listbox = driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]"));
        
        listbox.sendKeys("D");
        
        Thread.sleep(3000);
        
      
        driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]")).sendKeys("Mum");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
     
//        To click on date picker
        
        driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click();                
        
        Thread.sleep(1000);
        
//        To select date
        
        driver.findElement(By.xpath("//*[@id=\"fare_20190629\"]")).click();
        
//        To click on search button
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();
      
//        To check airlines filters.
        
//        driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/ul/li[4]/ul/li[5]/span[1]/label")).click();
        
     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[4]/div/div[4]/div[2]/div[2]/div/div/span[1]/span/input")).click();
     
     Thread.sleep(5000);
     
   driver.findElement(By.linkText("Baggage and Fare Rules")).click();
   
   Thread.sleep(2000);
   
   driver.findElement(By.linkText("Fare Rules")).click();
   
   Thread.sleep(1000);
   
   driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/a")).click();
     
     WebElement option = driver.findElement(By.xpath("//*[@id=\"Adulttitle1\"]"));
     
     option.sendKeys(Keys.DOWN);
     
     option.sendKeys(Keys.ENTER);
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//*[@id=\"AdultfirstName1\"]")).sendKeys("Devendra");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//*[@id=\"AdultlastName1\"]")).sendKeys("Gupta");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
     
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[2]/button")).click();
     
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//*[@id=\"tabnav_opts\"]/li[5]/a")).click();
     
     Thread.sleep(1000);
     
     driver.findElement(By.id("netbank_opts")).click();
     
     driver.findElement(By.xpath("//*[@id=\"netbank_opts\"]/option[2]")).click();
     
     Thread.sleep(5000);
     
     driver.close();
     
            
	}

	
	}

