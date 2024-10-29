package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchPage;
import pages.LoginPage;

public class Batch_EditbatchSD {
	WebDriver driver = DriverFactory.getDriver();
	BatchPage bp = new BatchPage(driver);
	LoginPage loginPage = new LoginPage(driver);

	@Given("Admin is on the Batch page")
	public void admin_is_on_the_dashboard_page() {
		loginPage.enterUsername("Sdet@gmail.com");
		loginPage.enterPassword("LmsHackathon@2024");
		loginPage.clickLogin();
		System.out.println("Admin has logged in");
	}
	
	@When("Admin enters the batch name in the search text box")
	public void admin_enters_the_batch_name_in_the_search_text_box() {
	    
	}

	@Then("Admin should see the filtered batches in the data table")
	public void admin_should_see_the_filtered_batches_in_the_data_table() {
	  bp.searchBatch();
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
		bp.editBatch();
	}

	@Then("Admin should see the Batch details pop up window")
	public void admin_should_see_the_batch_details_pop_up_window() {

	}

	@Then("Admin should see Program name value field is disabled for editing")
	public void admin_should_see_program_name_value_field_is_disabled_for_editing() {
		bp.programNameuneditableforEdit();
	}

	@Then("Admin should see batch name value field is disabled for editing")
	public void admin_should_see_batch_name_value_field_is_disabled_for_editing() {
		bp.batchNameuneditableforEdit();
	}

	@When("Admin Updates any fields with invalid data and click save button")
	public void admin_updates_any_fields_with_invalid_data_and_click_save_button() {

	}

	@Then("Admin should get a error message under the respective field")
	public void admin_should_get_a_error_message_under_the_respective_field() {
		bp.enterDetailsforEdit();
	}

	@When("Admin enters the valid data to all the mandatory fields and click save button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_and_click_save_button() {

	}

	@Then("Admin should get a successful message for editing the batch")
	public void admin_should_get_a_successful_message_for_editing_the_batch() {
		bp.editDetailsAndSave();
	}

	@When("Admin enters the valid data to all the mandatory fields and click cancel button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_and_click_cancel_button() {
		bp.editDetailsAndCancel();
	}

	@Then("Admin can see the batch details popup closes without editing the batch")
	public void admin_can_see_the_batch_details_popup_closes_without_editing_the_batch() {
		bp.validateCloseButtonInBatchDetails();
	}

}
