package Test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Manager.pom_Manager;
import base_Class.base_Class;

public class runner_Class extends base_Class{

	public static WebDriver driver;
	public pom_Manager pom_mn=new pom_Manager(driver);
	
	@BeforeTest
	public void launch() {
		driver=driver("chrome");
		URL("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() {
		sendKeys(pom_mn.getloginpage().getUsername(), "admin");
	}
	
	
}
