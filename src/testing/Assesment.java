package testing;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment {
	public static void takeSc(WebDriver driver, String filename) throws Exception {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\screentest\\" + filename + ".png"));
	}
	 public static void main(String[] args) throws Exception {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
			 Assesment demo=new Assesment();
			demo.run();
		 }
			public void run() throws Exception {
				WebDriver driver=new ChromeDriver(); //type of browser
			
			 driver.get("https://www.amazon.in/");
			
			  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watches");
			 Thread.sleep(5000);
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		
	
	   WebElement fossil= driver.findElement(By.cssSelector("img[data-image-index=\"3\"]"));
	   fossil.click();
	   Thread.sleep(6000);
	   
	   
	  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   driver.switchTo().window(tabs2.get(1));
		
			takeSc(driver, "img1");
		 
		 driver.close();
	 driver.switchTo().window(tabs2.get(0));
		driver.close();
			}
	}


