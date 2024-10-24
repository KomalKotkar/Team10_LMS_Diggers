package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators using @FindBy annotations
	@FindBy(id = "username")
	private WebElement usernameField;
	
	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(text(),' LMS - Learning Management System ')]")
	private WebElement dashBoardLmsHeading;
	
	// Methods to interact with the page
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
    
    public boolean validateDashboardHeading() {
    	if(dashBoardLmsHeading.isDisplayed()) {
    	return true;
    	}else return false;
    }
	
}
