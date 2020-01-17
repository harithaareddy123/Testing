package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
	// WebDriver driver=new ChromeDriver(); //type of browser
	// driver.get("https://www.makemytrip.com/");
	 Demo demo=new Demo();
	 demo.callmakemytrip();
	 //demo.callgoogle();
	
 }
 public void callmakemytrip() {
	 WebDriver driver=new ChromeDriver(); //type of browser
	 driver.get("https://www.makemytrip.com/");
 }
 public void callgoogle() {
	 WebDriver driver=new ChromeDriver(); //type of browser
	 driver.get("https://www.google.com/");
 }
}
