package Test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Class.login_Page;
import POM_Manager.pom_Manager;
import base_Class.base_Class;
import data_driven.data_Provider;

public class runner_Class extends base_Class{

	public static WebDriver driver=browser("chrome");;
	public static pom_Manager pom_mn=new pom_Manager(driver);
	
	
	@Test(dataProviderClass = data_Provider.class,dataProvider = "dataProviders")
	public void login(String username,String password) {
//		
//		URL(url);
//		sendKeys(pom_mn.getloginpage().getUsername(), "admin");
//		sendKeys(pom_mn.getloginpage().getPassword(), "admin123");
//		click(pom_mn.getloginpage().getSubmit());
		
		pom_mn.loginpage();
		URL("https://opensource-demo.orangehrmlive.com/");
		sendKeys(login_Page.username, username);
		sendKeys(login_Page.password, password);
		System.out.println(username);
		System.out.println(password);
		click(login_Page.submit);
	}
	
	
	
	
}
