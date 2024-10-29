package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClassPageValidationPage;
import pages.DeleteClassPage;
import pages.LoginPage;

public class DeleteClassStep {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	ClassPageValidationPage classPageValidationPage = new ClassPageValidationPage(driver);
	DeleteClassPage deleteClassPage = new DeleteClassPage(driver);
	
	
	@When("Admin clicks the delete icon of particular row")
	public void admin_clicks_the_delete_icon_of_particular_row() {
	   
	}

	@Then("Admin should see a alert open with heading Confirm along with YES and NO button for deletion")
	public void admin_should_see_a_alert_open_with_heading_confirm_along_with_yes_and_no_button_for_deletion() {
	   
	}

	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
	  
	}

	@When("Admin clicks yes option")
	public void admin_clicks_yes_option() {
	  
	}

	@Then("Admin gets a message Successful Class Deleted alert and do not see that Class in the data table")
	public void admin_gets_a_message_successful_class_deleted_alert_and_do_not_see_that_class_in_the_data_table() {
	  
	}

	@When("Admin clicks No option")
	public void admin_clicks_no_option() {
	  
	}

	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
	  
	}

	@When("Admin clicks on close button")
	public void admin_clicks_on_close_button() {
	  
	}

	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
	 
	}

	@Given("Admin is in Manage Class page")
	public void admin_is_in_manage_class_page() {
	
	}

	@When("Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
	  
	}

	@Then("Admin should see common delete option enabled under header Manage class")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_class() {
	   
	}

	@When("Admin clicks YES button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
	   
	}

	@Then("Admin gets a message Successful Class Deleted alert")
	public void admin_gets_a_message_successful_class_deleted_alert() {
	   
	}

	@When("Admin clicks No button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	   
	}

	@Then("Admin should land on Manage class page and can see the selected class is not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_can_see_the_selected_class_is_not_deleted_from_the_data_table() {
	   
	}

	@Then("Admin should land on Manage class page and can see the selected classs is not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_can_see_the_selected_classs_is_not_deleted_from_the_data_table() {
	   
	}
}
