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

	/*
	 * Description Browser Initialization
	 */
	public static WebDriver browser(String string) {
		switch (string) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		return driver;
	}

	/*
	 * Description Navigate to URL
	 */
	
	public static String URL(String url) {
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Successfully " + url + " is Launched.");
		return url;
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
			element.click();
			element.sendKeys(Value);
	}
	
	public static void click(WebElement element) {
		element.click();
	}


	/*
	 * Description Get Title
	 */
	public static String title() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
}
