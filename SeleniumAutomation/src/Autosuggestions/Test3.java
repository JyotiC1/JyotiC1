package Autosuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		

	}

}
