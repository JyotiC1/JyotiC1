package Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	private static WebElement ele;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("username"));
		ele.clear();
		WebElement ele1=driver.findElement(By.id("password"));
		ele.clear();
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		
	
    }

}