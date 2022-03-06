package Second_Selenium.MavenSept;
 
import org.junit.Test; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	
	@Test
	public void test() throws InterruptedException {
	 
		
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://techfios.com/billing/?ng=admin/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	 
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();


	Thread.sleep(2000);
	driver.close();
	driver.quit();

	}
	
}
