package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
	   System.out.println("Launching browser");
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		System.out.println("Launched portal :"+driver.getTitle());
	}

	@Given("Admin is in login Page")
	public void admin_is_in_login_page() {
	  
	}

	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
	   loginPage.enterUsername("Sdet@gmail.com");
	   loginPage.enterPassword("LmsHackathon@2024");
	   loginPage.clickLogin();
	}

	@Then("Admin should land on dashboard page \\( centre of the page will be empty , menu bar is present)")
	public void admin_should_land_on_dashboard_page_centre_of_the_page_will_be_empty_menu_bar_is_present() {
	   if(loginPage.validateDashboardHeading()) {
		   System.out.println("Landed on dashboard page");
	   } else {
		   System.out.println("Not Landed on dashboard page");
	   }
	}

}
