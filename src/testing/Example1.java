package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
private WebDriver driver;

public Example1(WebDriver driver2)
{
	
	driver=driver2;
 
}
//Targets
private By username=By.id("username");

private By password=By.id("password");
private By signinbtn=By.button("btn__primary--large from__button--floating");
//Actions
private void setusername()
{
	driver.findElement(username).sendKeys("mercury");
}
private void setpassword() throws Exception	
{
	driver.findElement(password).sendKeys("mercury");
	 Thread.sleep(3000);
}
private void clickonSignin() {
	driver.findElement(signinbtn).click();
}
//login action
public void login() throws Exception
{
	this.setusername();
	this.setpassword();
	this.clickonSignin();
}

public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	 Example1 demo=new Example1(driver);
	 demo.login();
	 
}
}

