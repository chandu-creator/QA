package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class idAndLinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.linkText("TRY FREE")).click();
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		driver.findElement(By.partialLinkText("Why")).click();
		Wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/about-actitime"));
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
