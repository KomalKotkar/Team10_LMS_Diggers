package stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	SoftAssert Assert = new SoftAssert();
	
	@Given("Admin launches the browser")
	public void admin_launch_the_browser() {
	   System.out.println("Launching browser");
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		System.out.println("Launched portal :"+driver.getTitle());
	}
	
	//@Login_s1
	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() throws IOException {
	  loginPage.fieldsSpellCheck();
	}

	//@Login_s2
	@Then("Admin should see logo on the left side")
	public void admin_should_see_logo_on_the_left_side() {
	  
	}
	
	//@Login_s3 for LMS - Learning Management System
	@Then("Admin should see text {string}")
	public void admin_should_text(String appName) {
	  loginPage.verifyLMSText(appName);
	}
	
	//@Login_s4
	@Then("Admin should see company name below the app name")
	public void admin_should_see_company_name_below_the_app_name() {
	   loginPage.verifyCompanyName(loginPage.get("CompanyName"));
	}
	
	//@Login_s5 for "Please login to LMS application"
	@Then("Admin should see {string}")
	public void admin_should_see(String loginMessage) {
	    Assert.assertEquals(loginPage.getLoginMessage(), loginMessage);
	}
	
	//@Login_s6
	@Then("Admin should see two text fields")
	public void admin_should_see_two_text_fields() {
	 Assert.assertEquals(loginPage.getTextFieldCountOnLoginPage(), 2);
	}
	
	//@Login_s7 for User
	@Then("Admin should see {string} in the first text field")
	public void admin_should_see_in_the_first_text_field(String expectedUserPlaceHolder) {
	  Assert.assertEquals(loginPage.getFirstInputFieldText(), expectedUserPlaceHolder);
	}
	//@Login_s8
	@Then("Admin should see field mandatory * symbol next to Admin text")
	public void admin_should_see_field_mandatory_symbol_next_to_admin_text() {
	   Assert.assertTrue(loginPage.visibilityOfUserPlaceholderAsterisk());
	}
	//@Login_s9 for Password
	@Then("Admin should see {string} in the second text field")
	public void admin_should_see_in_the_second_text_field(String expectedPasswordPlaceholder) {
		Assert.assertEquals(loginPage.getSecondInputFieldText(), expectedPasswordPlaceholder);
	}
	//@Login_s10
	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
		 Assert.assertTrue(loginPage.visibilityOfPasswordPlaceholderAsterisk());
	}
	//@Login_s11
	@Then("Admin should see input field in the center of the page")
	public void admin_should_see_input_field_in_the_center_of_the_page() {
	   loginPage.verifyInputFieldAlignment();
	}
	//@Login_s12
	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		 Assert.assertTrue(loginPage.visibilityOfLoginButton());
	}

	//@Login_s13
	@Then("Admin should see login button in the center of the page")
	public void admin_should_see_login_button_in_the_center_of_the_page() {
	   loginPage.verifyLoginButtonAlignment();
	}
	
	//@Login_s14 for Admin  //@Login_s15 for Password
	@Then("Admin should see {string} in gray color")
	public void admin_should_see_in_gray_color(String fieldName) {
	    loginPage.verifyFieldColor(fieldName);
	}
	
	
	//@Login_s16
	@Given("Admin is in login Page")
	public void admin_is_in_login_page() {
	  
	}

	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
	   loginPage.enterUsername("ValidUsername");
	   loginPage.enterPassword("ValidPassword");
	   loginPage.clickLogin();
	}

	@Then("Admin should land on dashboard page \\( centre of the page will be empty , menu bar is present)")
	public void admin_should_land_on_dashboard_page_centre_of_the_page_will_be_empty_menu_bar_is_present() {
	   Assert.assertTrue(loginPage.validateDashboardHeading());
	}

}
