package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misleniuos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//to  maximize the window
		driver.manage().deleteAllCookies();//to delete all cookies of a browser
		driver.get("https://www.spicejet.com");//toogle break point is used to run the code up to this line 
		

	}

}
