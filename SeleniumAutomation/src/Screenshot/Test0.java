package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Typcasting
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Access the method photo is taken and stored in RAM
     
		File ramloc=ts.getScreenshotAs(OutputType.FILE);
		
		//Required location
		
		File destloc=new File("./photo/amazon.png");
		//copy paste from ramloc to destloc
		
		FileUtils.copyFile(ramloc, destloc);
		
		driver.close();
		
		
		
			

	}

}
