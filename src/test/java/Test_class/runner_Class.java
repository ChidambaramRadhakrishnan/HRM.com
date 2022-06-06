package Test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Class.login_Page;
import POM_Manager.pom_Manager;
import base_Class.base_Class;

public class runner_Class extends base_Class{

	public static WebDriver driver=browser("chrome");;
	public static pom_Manager pom_mn=new pom_Manager(driver);
	
	
	@Test
	@Parameters({"url"})
	public void login(String url) {
//		
//		URL(url);
//		sendKeys(pom_mn.getloginpage().getUsername(), "admin");
//		sendKeys(pom_mn.getloginpage().getPassword(), "admin123");
//		click(pom_mn.getloginpage().getSubmit());
		pom_mn.loginpage();
		URL(url);
		sendKeys(login_Page.username, "admin");
		sendKeys(login_Page.password, "admin123");
		click(login_Page.submit);

	}
	
	
}
