package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewClassPage {

	WebDriver driver;
	
	public AddNewClassPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
