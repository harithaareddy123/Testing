package testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void takepicture(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".\\screenshots\\" + filename + ".png"));
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		// TakesScreenshot Screenshot=((TakesScreenshot)driver);
		takepicture(driver, "img1");
		Actions action = new Actions(driver);
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		action.moveToElement(electronics).build().perform();
		takepicture(driver, "img2");
		Thread.sleep(3000);
		WebElement samsung = driver.findElement(By.linkText("Samsung"));
		action.moveToElement(samsung).build().perform();
		takepicture(driver, "img3");
		Thread.sleep(3000);
		samsung.click();
		driver.close();
		
	}
}