package bank;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bank {
	public static void main(String[]args)throws Exception {
		System.setProperty("Webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://WWW.demo.guru99.com/V4/";
		driver.get(baseUrl);
driver.findElement(By.name("uid")).sendKeys("mngr1336");

	driver.findElement(By.name("password")).sendKeys("dAnavUq");
	driver.findElement(By.name("btnLogin")).click();

}
}