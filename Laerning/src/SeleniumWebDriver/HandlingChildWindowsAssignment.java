package SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String Parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		driver.switchTo().window(Parentid);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
