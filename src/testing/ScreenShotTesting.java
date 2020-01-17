package testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotTesting {
	public static void takepicture(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".\\screen\\" + filename + ".png"));
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		WebElement a= driver.findElement(By.linkText("Today's Deals"));
		action.moveToElement(a).build().perform();
		takepicture(driver, "img1");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Almonds");
		//takepicture(driver, "img1");
		Thread.sleep(3000);
		a.click();
		/*for (int i = 0; i <= 3; i++) {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			takepicture(driver, "img2");
			Thread.sleep(3000);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		takepicture(driver, "img3");
		*/
		takepicture(driver, "img2");
		driver.close();
	}
}
