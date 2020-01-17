package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking {
	 public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		 Checking demo=new Checking();
		
		 demo.run();
	 }
		public void run() throws Exception {
			WebDriver driver=new ChromeDriver(); //type of browser
		
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Almonds");
		 Thread.sleep(3000);
		 for(int i=0;i<=3;i++) {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(3000);

		 }
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	 Thread.sleep(8000);
	 driver.close();
		}
}

