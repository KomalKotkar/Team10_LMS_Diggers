package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddNewClassPage;
import pages.ClassPageValidationPage;
import pages.LoginPage;
import utilities.ExcelReader;

public class AddNewClassStep {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	ClassPageValidationPage classPageValidationPage = new ClassPageValidationPage(driver);
	AddNewClassPage addNewClassPage = new AddNewClassPage(driver);
	
	@Given("Admin is on the Manage class page")
	public void admin_is_on_the_manage_class_page() {
		loginPage.enterUsername("Sdet@gmail.com");
		loginPage.enterPassword("LmsHackathon@2024");
		loginPage.clickLogin();
		classPageValidationPage.clickOnClassButton();
		
	}

	@When("Admin click on add new class under the class menu bar")
	public void admin_click_on_add_new_class_under_the_class_menu_bar() {
		classPageValidationPage.clickOnAddNewClassButton();
	}

	@Then("Admin should see a popup for class details with empty form along with SAVE and CANCEL button and Close Icon button on the top right corner")
	public void admin_should_see_a_popup_for_class_details_with_empty_form_along_with_save_and_cancel_button_and_close_icon_button_on_the_top_right_corner() {
		addNewClassPage.verifyPopupDispayedWithFeatures();
	}

	@Then("Admin should see all input fields and their respective text boxes in the class details window")
	public void admin_should_see_all_input_fields_and_their_respective_text_boxes_in_the_class_details_window() {
		addNewClassPage.verifyPopupWithInputCheckboxes();
	}

	@Given("Admin is on the Class Details Popup window")
	public void admin_is_on_the_class_details_popup_window() {
		classPageValidationPage.clickOnAddNewClassButton();
	}

	@When("Admin enters mandatory fields in the form and clicks on save button")
	public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_save_button() {
//		System.out.println("admin_enters_mandatory_fields_in_the_form_with_and_and_clicks_on_save_button");
//		ExcelReader reader = new ExcelReader();
//		List<Map<String,String>> testData = 
//				reader.getData("src/test/resources/TestData/testData.xlsx", sheetName);
//		System.out.println("testData  "+testData);
//		String classTopic = testData.get(rowNumber).get("classTopic");
//		System.out.println("classTopic  "+classTopic);
		addNewClassPage.fillClassTopic();
	}

	@Then("Admin gets message Class added Successfully")
	public void admin_gets_message_class_added_successfully() {
	   
	}

	@When("Admin selects class date in date picker")
	public void admin_selects_class_date_in_date_picker() {
	   
	}

	@Then("Admin should see no of class value is added automatically")
	public void admin_should_see_no_of_class_value_is_added_automatically() {
	   
	}

	@When("Admin clicks date picker")
	public void admin_clicks_date_picker() {
	   
	}

	@Then("Admin should see weekends dates are disabled to select")
	public void admin_should_see_weekends_dates_are_disabled_to_select() {
	   
	}

	@When("Admin skips to add value in mandatory field and enter only the optional field")
	public void admin_skips_to_add_value_in_mandatory_field_and_enter_only_the_optional_field() {
	   
	}

	@Then("Admin should see error message below the test field and the field will be highlighed in red color")
	public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color() {
	   
	}

	@When("Admin enters invalid data in all of the  fields in the form and clicks on save button")
	public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_save_button() {
	   
	}

	@Then("Admin gets error message and class is not created")
	public void admin_gets_error_message_and_class_is_not_created() {
	   
	}

	@Given("Admin is on the Class Popup window")
	public void admin_is_on_the_class_popup_window() {
	   
	}

	@When("Admin clicks on save button without entering data")
	public void admin_clicks_on_save_button_without_entering_data() {
	   
	}

	@Then("Admin gets error message below mandatory fields required")
	public void admin_gets_error_message_below_mandatory_fields_required() {
	   
	}

	@When("Admin clicks Close X Icon on Admin Details form")
	public void admin_clicks_close_x_icon_on_admin_details_form() {
	   
	}

	@Then("Class Details popup window should be closed without saving")
	public void class_details_popup_window_should_be_closed_without_saving() {
	   
	}

	@When("Admin enters all values in the form and clicks on save button")
	public void admin_enters_all_values_in_the_form_and_clicks_on_save_button() {
	   
	}
}
