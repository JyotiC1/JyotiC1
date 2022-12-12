import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[]args)throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr1336");
		driver.findElement(By.name("password")).sendKeys("dAnavUq");
		driver.findElement(By.name("btnLogin")).click();
	}

}
