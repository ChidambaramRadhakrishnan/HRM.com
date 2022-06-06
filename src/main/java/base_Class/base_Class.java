package base_Class;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_Class {

	public static WebDriver driver;

	static WebElement element;

	/*
	 * Description Browser Initialization
	 */
	public static WebDriver driver(String drivername) {

		switch (drivername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		System.out.println("Successfully " + drivername.toLowerCase() + " driver is Launched.");
		return driver;
	}

	/*
	 * Description Navigate to URL
	 */
	
	public static void URL(String url) {
		driver.get(url);
		driver.navigate().to(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Successfully " + url + " is Launched.");
	}

	/*
	 * Description select Random dropdown without contain any select/option Tags
	 * select followed by list and div tags and buying foreach
	 */
	public static void selectoptionList(List<WebElement> element, String value) {
		for (WebElement options : element) {
			String txt = options.getText();
			if (txt.equalsIgnoreCase(value)) {
				options.click();
				break;
			}
		}
	}

	/*
	 * Description SwitchTo tabs
	 */
	public static void tabs() {
		String parenttab = driver.getWindowHandle();

		Set<String> alltabs = driver.getWindowHandles();

		for (String tab : alltabs) {
			if (!tab.equals(parenttab)) {
				driver.switchTo().window(tab);
			}
		}
	}

	/*
	 * Description SendKeys
	 * 
	 */
	public static void sendKeys(WebElement element, String Value) {
		if (element.isEnabled()) {
			element.sendKeys(Value);
			String keyvalue = element.getAttribute("value");
			System.out.println("Your Entered Value is - " + keyvalue);
		} else {
			String txt = "Not accessible";
			System.out.println(txt);
		}

	}



	/*
	 * Description Get Title
	 */
	public static String title() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
}
