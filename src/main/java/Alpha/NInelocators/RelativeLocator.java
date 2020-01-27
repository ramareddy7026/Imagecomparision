package Alpha.NInelocators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]")).click();
		Thread.sleep(1000);
		//driver.findElement(withTagName("input").toLeftOf(By.xpath("//a[contains(text(),'Welcome Admin')]"))).click();
		driver.findElement(withTagName("b").toLeftOf(By.xpath("//b[contains(text(),'Dashboard')]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Welcome Admin')]")).click();
		//driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
	//	driver.findElement(withTagName("input").above(By.xpath("//a[contains(.,'Forgot your password?')]")).below(By.name("txtPassword"))).click();
		//driver.findElement(withTagName("input").above(By.xpath("//a[contains(.,'Forgot your password?')]"))).click();

		//WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
		//newtab.get("http://qa.relyonstaging.com/login");
		
		//driver.findElement(withTagName("button").below(By.name("password"))).click();
		//WebElement forgotpwd = driver.findElement(By.xpath("//a[contains(.,'Forgot password?')]"));
		//driver.findElement(withTagName("button").below(By.name("password"))).click();
		//driver.findElement(withTagName("button").above(By.xpath("//a[contains(@href,'login_password_recover.php')]"))).click();
//		 WebDriver driver=new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//		 driver.get("https://opensource-demo.orangehrmlive.com/");
//		 driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
//		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//		 //driver.findElement(withTagName("input").above(By.xpath("//a[contains(text(),'Forgot your password?')]"))).click();
//		 List<WebElement> list = driver.findElements(withTagName("img").below(By.xpath("//a[contains(.,'OrangeHRM, Inc')]")));
//		 int n = list.size();
//		 System.out.println(n);
//		 for(WebElement e:list)
//		 {
//			 System.out.println(e.getAttribute("alt"));
//		 }
	

	
	}

}
