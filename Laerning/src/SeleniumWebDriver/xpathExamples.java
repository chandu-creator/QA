package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("google.com");
		

	}
}
