package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClassPageValidationPage;
import pages.LoginPage;

public class ClassPageValidationStep {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	ClassPageValidationPage classPageValidationPage = new ClassPageValidationPage(driver);
	
	@Given("Admin Is on the Dashboard page after login")
	public void admin_is_on_the_dashboard_page_after_login() {
		   loginPage.enterUsername("Sdet@gmail.com");
		   loginPage.enterPassword("LmsHackathon@2024");
		   loginPage.clickLogin();
	}

	@When("Admin clicks the Class button on Navigation bar")
	public void admin_clicks_the_class_button_on_navigation_bar() {
		classPageValidationPage.clickOnClassButton();
	}

	@Then("Admin should see text Manage Class on class page")
	public void admin_should_see_text_manage_class_on_class_page() {
		classPageValidationPage.verifyManageClassText();
	}

	@Then("Admin should see the LMS Title")
	public void admin_should_see_the_lms_title() {
		
		Assert.assertTrue(classPageValidationPage.getPageTitle().contains("LMS"));
	}

	@Then("Admin should see the Searchbar in class page")
	public void admin_should_see_the_searchbar_in_class_page() {
		classPageValidationPage.validateSearchBox();
	}

	@Then("Admin should see the all datatable headings in the class page")
	public void admin_should_see_the_all_datatable_headings_in_the_class_page() throws InterruptedException {
		classPageValidationPage.verifyHeadingsOfClassTable();
	}

	@Then("Admin should see the showing x to y of z entries and enabled pagination controls under the data table")
	public void admin_should_see_the_showing_x_to_y_of_z_entries_and_enabled_pagination_controls_under_the_data_table() {
	   classPageValidationPage.verifyNumberOfClassesOnPage();
	   classPageValidationPage.verifyPagination();
	   classPageValidationPage.VerifyTotalClasses();
	}

	@Then("Admin should see the Sort icon of all the field in the datatable")
	public void admin_should_see_the_sort_icon_of_all_the_field_in_the_datatable() {
	
	}

	@Then("Admin should see the Delete button under the Manage class page header")
	public void admin_should_see_the_delete_button_under_the_manage_class_page_header() {
		classPageValidationPage.verifyDeleteIcon();
	}

	@Then("Admin should see Total no of classes in below of the data table")
	public void admin_should_see_total_no_of_classes_in_below_of_the_data_table() {
		classPageValidationPage.VerifyTotalClasses();
	}
}
