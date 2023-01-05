package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("jyoti264763@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jyoti1996");
		driver.findElement(By.name("login")).click();

	}

}
