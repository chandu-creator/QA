import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		// to define methods from class : sumoftwonumbers and headervalidation

		sumoftwonumbers S = new sumoftwonumbers();
		headervalidation H = new headervalidation();
		S.main(args);
		H.ValidateHeader();

	}

}
