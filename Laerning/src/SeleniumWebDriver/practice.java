package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select s=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s.selectByValue("USD");
		s.selectByIndex(2);
		s.selectByVisibleText("INR");
		driver.close();
				
		

	}

}
