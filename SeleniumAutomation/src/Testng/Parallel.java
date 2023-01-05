package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parallel {
	public WebDriver driver;
	@parameters({"Jyoti"})
	@Test
	public void demo(String browser) {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		Reporter.log(title,true);
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}
	}
	


