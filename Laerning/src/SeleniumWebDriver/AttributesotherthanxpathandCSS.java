package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesotherthanxpathandCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.facebook.com");
		 * driver.findElement(By.id("email")).sendKeys("efhhh");// to enter anything on
		 * browser driver.findElement(By.name("pass")).sendKeys("srrf");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();// to click
		 * any thing on browser //System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\'globalContainer\']/div[3]/div/div/div/text()")).getText());//to
		 * get any text on browser driver.findElement(By.xpath(
		 * "//*[@id=\'globalContainer\']/div[3]/div/div/div/a")).click();
		 * //driver.findElement(By.linkText("Forgotten account?")).click();
		 * //System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\'globalContainer\']/div[3]/div/div/div/text()")).getText());//to
		 * get any text on browser
		 * 
		 * driver.get("https://www.unibet.com"); driver.findElement(By.xpath(
		 * "//*[@id=\'CybotCookiebotDialogBodyButtonAccept\']")).click();
		 * driver.findElement(By.xpath("//*[@id=\'ufe_unique_id_1\']")).sendKeys(
		 * "cavvaru@csc.com");
		 * driver.findElement(By.xpath("//*[@id=\'ufe_unique_id_2\']")).sendKeys(
		 * "benten10");
		 * driver.findElement(By.xpath("//button[@data-test-name='btn-login']")).click()
		 * ;
		 */

		// To Derive all xpath and css expressions
		// xpath expressions
		driver.get("https://www.casinohuone.com");
		driver.findElement(By.xpath("//a[@data-test-name='login-button']")).click();

	}

}
