package POM_Manager;

import org.openqa.selenium.WebDriver;

import POM_Class.login_Page;

public class pom_Manager {

	
	public WebDriver driver;
	
	public static login_Page logpage;
	
	public pom_Manager(WebDriver driver) {
		this.driver=driver;
	}
	
	public login_Page loginpage() {
		if(logpage==null) {
			logpage = new login_Page(driver);
		}
		return logpage;
	}
}
