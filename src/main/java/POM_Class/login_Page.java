package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {

	
	public WebDriver driver;
	
	@FindBy(id = "txtUsername")
	private WebElement username;
	
	@FindBy(id = "txtPassword")
	private WebElement password;
	
	@FindBy(xpath = "//div[@id='divLogo']/child::img")
	private WebElement logo;
	
	@FindBy(id = "btnLogin")
	private WebElement submit;
	
	@FindBy(tagName = "title")
	private String title;
	
	public login_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public String getTitle() {
		return title;
	}
	
	
}
