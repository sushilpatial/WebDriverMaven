package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
	}
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("trainse@gmail.com");
	    driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
		/* added new comments */	
		
	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
