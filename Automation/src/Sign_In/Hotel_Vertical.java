package Sign_In;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hotel_Vertical {

	private static final String mainWindowHandle = null;

	public static void main(String[] args ) throws InterruptedException {
		// TODO Auto-generated method stub

			
		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspace\\Automation\\Browser\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.goibibo.com");
        
        driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[2]/a/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Delhi");
		
		 driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"Home\"]/div[3]/div[1]/div/div[1]/div[3]/div/div[3]/div/button")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"srpContainer\"]/div[2]/div[2]/div/div[1]/div/ul/li[6]/div/div[3]/label/i[2]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement((By.xpath("//*[@id=\"srpContainer\"]/div[2]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/section[1]/div[2]/div/div[3]/div[2]/div[2]"))).click();
	
	Thread.sleep(5000);
	
//------------------------------ To Switch in other Tab---------------------------

//	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(tabs.get(1));


//	  -------------------------------Click on Book Now Button------------------------
	  
	  Thread.sleep(2000);
	  
	  
	   driver.findElement(By.xpath("\r\n" + 
	  		"/html/body/div[1]/div/div[2]/div[1]/div[1]/div[5]/div/div[2]/div[2]/div[7]/div/a/button")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Booking & Cancellation Policy")).click();
	  
	  Thread.sleep(1500);
	  
	  driver.findElement(By.xpath("//*[@id=\"go_cp_popCont\"]/div/a")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"choose\"]/option[1]")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"firstname1\"]")).sendKeys("Test");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("lastname1")).sendKeys("Bookings");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("email")).sendKeys("testnoc009@gmail.com");
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[14]/div[2]")).click();
	  
	  Thread.sleep(60000);
	  
	  driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[11]")).click();
	  
	  Thread.sleep(6000);
	  
	  driver.close();
	
	}
	
	

}
