package Test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Manager.pom_Manager;
import base_Class.base_Class;

public class runner_Class extends base_Class{

	public static WebDriver driver;
	public static pom_Manager pom_mn=new pom_Manager(driver);
	
	
	@Test
	@Parameters({"browser","url"})
	public void login(String browser,String url) {
		driver=driver(browser);
		URL(url);
		sendKeys(pom_mn.getloginpage().getUsername(), "admin");
	}
	
	
}
