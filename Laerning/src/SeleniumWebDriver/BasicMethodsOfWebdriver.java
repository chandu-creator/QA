package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsOfWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");// To hit the url

		System.out.println(driver.getTitle());// To the title of page

		System.out.println(driver.getCurrentUrl());// To get the current url of page

		//System.out.println(driver.getPageSource());// To get the page source

		driver.navigate().back();// To Navigate to the back

		driver.navigate().forward();// To navigate to the forward0

		// driver.close();// To close the current window

		driver.quit();// To close all windows opened by selenium webdriver

		// gettext();// you can grab any text from browser using get text method

	}

}
