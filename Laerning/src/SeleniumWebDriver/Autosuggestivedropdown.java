package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		Thread.sleep(2000L);
		// driver.findElement(By.id("//input[@id='fromcity']")).click();
		WebElement Fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Fromcity.clear();
		Fromcity.sendKeys("MUM");
		Thread.sleep(2000L);
		Fromcity.sendKeys(Keys.ENTER);

	}

}
