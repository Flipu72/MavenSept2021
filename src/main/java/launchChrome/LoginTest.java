package launchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();	
		 loginTest();
		 tearDown();
	  
//		 launchBrowser();	
//		 loginTestNegative();
//		 tearDown();
	}
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	    driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://techfios.com/billing/?ng=admin/");
		
		
	}
	
	public static void loginTest() throws InterruptedException {
		
		    driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		    driver.findElement(By.id("password")).sendKeys("abc123");
		    driver.findElement(By.name("login")).click();


		//    Thread.sleep(2000);
		   
		
	}
	
/*	public static void loginTestNegative() {
		
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc1234");
			driver.findElement(By.name("login")).click();
	}*/
	
	public static void tearDown() {
		
			driver.close();
		    driver.quit();
	}

}
