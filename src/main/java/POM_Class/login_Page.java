package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {

	
	public WebDriver driver;
	
	@FindBy(id = "txtUsername") //
	public static WebElement username;
	
	@FindBy(id = "txtPassword")
	public static WebElement password;
	
	@FindBy(xpath = "//div[@id='divLogo']/child::img")
	public static WebElement logo;
	
	@FindBy(id = "btnLogin")
	public static WebElement submit;
	
	@FindBy(tagName = "title")
	public static String title;
	
	public login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


//	public WebElement getUsername() {
//		return username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//	public WebElement getLogo() {
//		return logo;
//	}
//
//	public WebElement getSubmit() {
//		return submit;
//	}
//
//	public String getTitle() {
//		return title;
//	}
	
	
}
