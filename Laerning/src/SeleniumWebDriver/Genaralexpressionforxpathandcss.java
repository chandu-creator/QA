package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genaralexpressionforxpathandcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.unibet.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyButtonAccept']")).click();// xpath://*[@attribute='value']
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("cavvaru@csc.com");// xpath://tagname[@attribute='value']
		driver.findElement((By.xpath("//input[contains(@type,'passw')]"))).sendKeys("benten10");// xpath://tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//*[text()='Log In']")).click();// xpath://*[text()='value']
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("hfhgf");// CSS://#id
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("hghg");// CSS//[attribute='value']
		driver.quit();

	}

}
