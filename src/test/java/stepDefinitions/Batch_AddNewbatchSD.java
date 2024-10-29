package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchPage;
import pages.LoginPage;

public class Batch_AddNewbatchSD {
	WebDriver driver = DriverFactory.getDriver();
	BatchPage bp = new BatchPage(driver);
	LoginPage loginPage = new LoginPage(driver);

	@Given("Admin is on the Dashboard Page")
	public void admin_is_on_the_dashboard_page() {
		loginPage.enterUsername("Sdet@gmail.com");
		loginPage.enterPassword("LmsHackathon@2024");
		loginPage.clickLogin();
		System.out.println("Admin is on dashboard page");
	}

	@When("Admin clicks on {string} under the {string} menu bar")
	public void admin_clicks_on_under_the_menu_bar(String string, String string2) {
		bp.addNewBatch();
		System.out.println("Clicked Add new batch Option");
	}

	@Then("Admin should see the Batch Details pop up window")
	public void admin_should_see_the_batch_details_pop_up_window() {
		// covered in above function
	}

	@Given("Admin is on the Batch Details Pop Up Window")
	public void admin_is_on_the_batch_details_pop_up_window1() {
		loginPage.enterUsername("Sdet@gmail.com");
		loginPage.enterPassword("LmsHackathon@2024");
		loginPage.clickLogin();
		System.out.println("Admin is on dashboard page");
		
	}

	@When("Admin checks all the fields are enabled")
	public void admin_checks_all_the_fields_are_enabled() {
		bp.addNewBatch();
		
	}

	@Then("The pop up should include the fields Batch Name,Number of classes and Description as text box,Program Name as drop down. Status as radio button")
	public void the_pop_up_should_include_the_fields_batch_name_number_of_classes_and_description_as_text_box_s_program_name_as_drop_down_status_as_radio_button() {
		bp.checkbatchDetailsPopUpWindow();
	}

	@When("Admin selects program name present in the dropdown")
	public void admin_selects_program_name_present_in_the_dropdown() {
		bp.addNewBatch();
	}

	@Then("Admin should see selected program name in the batch name prefix box")
	public void admin_should_see_selected_program_name_in_the_batch_name_prefix_box() {
		bp.checkProgramName();
	}

	@When("Admin enters alphabets in batch name suffix box")
	public void admin_enters_alphabets_in_batch_name_suffix_box() {
		bp.addNewBatch();
		
	}

	@Then("Admin should get error message below the text box of respective field")
	public void admin_should_get_error_message_below_the_text_box_of_respective_field() {
		bp.checkBatchNumberShouldAcceptNumbersOnly();
	}

	@When("Admin enters alphabets in batch name prefix box")
	public void admin_enters_alphabets_in_batch_name_prefix_box() {
		bp.addNewBatch();
	}

	@Then("Batch Name should not be editable")
	public void batch_name_should_not_be_editable() {
		bp.checkBatchNumberPrefixfield();
	}

	@When("Admin enters the data only in the mandatory fields and clicks save button")
	public void admin_enters_the_data_only_to_the_mandatory_fields_and_clicks_save_button() {
		bp.addNewBatch();
	}

	@Then("Admin should get a successful message")
	public void admin_should_get_a_successful_message() throws InterruptedException {
		bp.validateSaveButtonInBatchDetails();
	}

	@When("Admin leaves blank one of the mandatory fields")
	public void admin_leaves_blank_one_of_the_mandatory_fields() {
		bp.addNewBatch();
	}

	@Then("Admin should get a error message on the respective mandatory field")
	public void admin_should_get_a_error_message_on_the_respective_mandatory_field() {
		bp.checkInputDataMissingforMandatoryDetails();
	}

	@When("Admin enters the valid data in all the mandatory fields and click cancel button")
	public void admin_enters_the_valid_data_in_all_the_mandatory_fields_and_click_cancel_button() {
		bp.addNewBatch();
	}

	@Then("Admin can see the batch details popup closes without creating any batch")
	public void admin_can_see_the_batch_details_popup_closes_without_creating_any_batch() {
		bp.validateCancelButtonInBatchDetails();
	}

	@When("Admin clicks on the close icon")
	public void admin_clicks_on_the_close_icon() {
		bp.addNewBatch();
	}

	@Then("batch details pop up closes")
	public void batch_details_pop_up_closes() {
		bp.validateCloseButtonInBatchDetails();

	}

}
