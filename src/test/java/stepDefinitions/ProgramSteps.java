package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProgramPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ProgramSteps {
	
	
	ProgramPage ProgramPage = new ProgramPage();
	
	/* #Navigation and Menu bar */
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		ProgramPage.getdashboardpage();
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		ProgramPage.getProgram();
	}

	@Then("Admin should be navigated to Program module")
	public void admin_should_be_navigated_to_program_module() {
	   
		ProgramPage.getprogrampage();
		
	}

	@Then("Admin should not have any broken links for Program module")
	public void admin_should_not_have_any_broken_links_for_program_module() {
		ProgramPage.getprogrampage();
	}
	
	/* --------- # Manage Program Page Validation ---------- */

	@Then("Admin should see the heading {string}")
	public void admin_should_see_the_heading(String headerstring) {
		ProgramPage.verifyHeaderText(headerstring);
	}

	@Then("Admin should see the module names as in order {string}")
	public void admin_should_see_the_module_names_as_in_order(String string) {
	    
	}

	@Then("Admin should see Logout in menu bar")
	public void admin_should_see_logout_in_menu_bar() {
	   
	}

	@Given("Admin is on program page")
	public void admin_is_on_program_page() {
	   
	}

	@Then("Admin should see sub menu in menu bar as {string}")
	public void admin_should_see_sub_menu_in_menu_bar_as(String string) {
	   
	}

	@Then("Admin should able to see Program name, description, and status for each program")
	public void admin_should_able_to_see_program_name_description_and_status_for_each_program() {
	   
	}

	@Then("Admin should see a Delete button in left top is disabled")
	public void admin_should_see_a_delete_button_in_left_top_is_disabled() {
	   
	}

	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String search) {
		ProgramPage.verifySearchText(search);
	}

	@Then("Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit\\/Delete")
	public void admin_should_see_data_table_with_column_header_on_the_manage_program_page_as_program_name_program_description_program_status_edit_delete() {
	   
	}

	@Then("Admin should see checkbox default state as unchecked beside Program Name column header as")
	public void admin_should_see_checkbox_default_state_as_unchecked_beside_program_name_column_header_as() {
	    
	}

	@Then("Admin should see check box default state as unchecked on the left side in all rows against program name")
	public void admin_should_see_check_box_default_state_as_unchecked_on_the_left_side_in_all_rows_against_program_name() {
	    
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	    
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	   
	}

	@Then("{string}{string}\" along with Pagination icon below the table.")
	public void along_with_pagination_icon_below_the_table(String string, String string2) {
	    
	}

	@Then("{string}{string}\".")
	public void string_string() {
	  
	}
	
	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) {
	   
	}
	
		@Then("Admin should see the footer as {string}.")
	public void admin_should_see_the_footer_as(String expfooterTxt) {
		//ProgramPage.verifyFooterText(expfooterTxt);
	}

/*------------------------------------------------------------------------------------------*/
	/*-------  # Menu bar Program - Add New Program ----------------------   */
	
	@Given("Admin is on Program module")
	public void admin_is_on_program_module() {
	   
	}

	@When("Admin clicks on {string} under the {string} menu bar")
	public void admin_clicks_on_under_the_menu_bar(String string, String string2) {
	   
	}

	@Then("Admin should see pop up window for program details")
	public void admin_should_see_pop_up_window_for_program_details() {
	    
	}

	@Then("Admin should see window title as {string}")
	public void admin_should_see_window_title_as(String string) {
	    
	}

	@Then("Admin should see red {string} mark beside mandatory field {string}")
	public void admin_should_see_red_mark_beside_mandatory_field(String string, String string2) {
	    
	}

	@Given("Admin is on Prog details form")
	public void admin_is_on_prog_details_form() {
	    
	}

	@When("Admin clicks save button without entering mandatory")
	public void admin_clicks_save_button_without_entering_mandatory() {
	    
	}

	@Then("Admin gets message {string}")
	public void admin_gets_message(String string) {
	    
	}

	@When("Admin clicks Cancel button")
	public void admin_clicks_cancel_button() {
	    
	}

	@Then("Admin can see Program Details form disappears")
	public void admin_can_see_program_details_form_disappears() {
	    
	}

 	/*@Given("Admin is on program details form")
	public void admin_is_on_program_details_form() {
	    
	} */

	@When("Admin enters the Name in the text box")
	public void admin_enters_the_name_in_the_text_box() {
	    
	}

	@Then("Admin can see the text entered")
	public void admin_can_see_the_text_entered() {
	    
	}

	@When("Admin enters the Description in text box")
	public void admin_enters_the_description_in_text_box() {
	   
	}

	@Then("Admin can see the text entered in description box")
	public void admin_can_see_the_text_entered_in_description_box() {
	   
	}

	@When("Admin selects the status of the program by clicking on the radio button {string}")
	public void admin_selects_the_status_of_the_program_by_clicking_on_the_radio_button(String string) {
	    
	}

	@Then("Admin can see {string} status selected")
	public void admin_can_see_status_selected(String string) {
	   
	}

	@When("Admin enter valid details for mandatory fields and Click on save button")
	public void admin_enter_valid_details_for_mandatory_fields_and_click_on_save_button() {
	   
	}

	@When("Admin Click on Prog details cancel button")
	public void admin_click_on_prog_details_cancel_button() {
	   
	}

	@Then("Admin can see program details form disappear")
	public void admin_can_see_program_details_form_disappear() {
	   
	}

	@When("Admin searches with newly created {string}")
	public void admin_searches_with_newly_created(String string) {
	   
	}

	@Then("Records of the newly created  {string} is displayed and match the data entered")
	public void records_of_the_newly_created_is_displayed_and_match_the_data_entered(String string) {
	    
	}

	@When("Admin Click on {string} button")
	public void admin_click_on_button(String string) {
	   
	}
	
/*	@Given("Admin is on program details form")
	public void admin_is_on_program_details_form() {
	   
	}*/

  /* -------------------------- Manage Program - Edit Program ----------------------------- */
	
/*	@Given("Admin is on program details form")
	public void admin_is_on_program_details_form() {
	    
	} */

	@When("Admin clicks on Edit option for particular program")
	public void admin_clicks_on_edit_option_for_particular_program() {
	    
	}

	@Then("Admin lands on Program details form")
	public void admin_lands_on_program_details_form() {
	    
	}

	@When("Admin edits the program name and click on save button")
	public void admin_edits_the_program_name_and_click_on_save_button() {
	    
	}

	@Then("Updated program name is seen by the Admin")
	public void updated_program_name_is_seen_by_the_admin() {
	    
	}

	@When("Admin edits the description text and click on save button")
	public void admin_edits_the_description_text_and_click_on_save_button() {
	   
	}

	@Then("Admin can see the description is updated")
	public void admin_can_see_the_description_is_updated() {
	   
	}

	@When("Admin can change the status of the program and click on save button")
	public void admin_can_change_the_status_of_the_program_and_click_on_save_button() {
	   
	}

	@Then("Status updated can be viewed by the Admin")
	public void status_updated_can_be_viewed_by_the_admin() {
	   
	}

	@When("Admin click on save button")
	public void admin_click_on_save_button() {
	    
	}

	@Then("Admin can see the updated program details")
	public void admin_can_see_the_updated_program_details() {
	   
	}

	@When("Admin click on cancel button")
	public void admin_click_on_cancel_button() {
	    
	}


	@Then("Admin can see the Program details form disappears")
	public void admin_can_see_the_program_details_form_disappears() {
	   
	}

	@When("Admin searches with newly updated {string}")
	public void admin_searches_with_newly_updated(String string) {
	    
	}

	@Then("Admin verifies that the details are correctly updated.")
	public void admin_verifies_that_the_details_are_correctly_updated() {
	    
	}
	
	
	@When("Admin clicks on cancel button")
	public void admin_clicks_on_cancel_button() {
	    
	}

	/* ------------------------------------------------------------------- */
  /*	Manage Program - Delete Program
	Manage Program - Delete Multiple Program  */

	
	
	@When("Admin clicks on delete button for a program")
	public void admin_clicks_on_delete_button_for_a_program() {
	    
	}

	@Then("Admin will get confirm deletion popup")
	public void admin_will_get_confirm_deletion_popup() {
	    
	}

	@Given("Admin is on Confirm deletion form")
	public void admin_is_on_confirm_deletion_form() {
	   
	}

	@When("Admin clicks on {string} button")
	public void admin_clicks_on_button(String string) {
	    
	}

	@Then("Admin can see {string} message")
	public void admin_can_see_message(String string) {
	    
	}

	@When("Admin Searches for {string}")
	public void admin_searches_for(String string) {
	    
	}

	@Then("There should be zero results.")
	public void there_should_be_zero_results() {
	   
	}

	@Then("Admin can see Confirmation form disappears")
	public void admin_can_see_confirmation_form_disappears() {
	    
	}

	@Given("{string}")
	public void string(String string) {
	    
	}

	@Then("Admin can see Confirm Deletion form disappear")
	public void admin_can_see_confirm_deletion_form_disappear() {
	   
	}
	
	/* ------------------------------------------------------------------------------------ */
	
	/*Manage Program - Search bar
	Manage Program - Sorting Program
	Manage Program - Pagination*/

	@When("Admin selects more than one program by clicking on the checkbox")
	public void admin_selects_more_than_one_program_by_clicking_on_the_checkbox() {
	    
	}

	@Then("Programs get selected")
	public void programs_get_selected() {
	    
	}

	@When("Admin clicks on the delete button on the left top of the program page")
	public void admin_clicks_on_the_delete_button_on_the_left_top_of_the_program_page() {
	    
	}

	@Then("Admin lands on Confirmation form")
	public void admin_lands_on_confirmation_form() {
	    
	}

	@Given("Admin is on Confirmation form")
	public void admin_is_on_confirmation_form() {
	    
	}

	@Then("Admin can see Programs are still selected and not deleted")
	public void admin_can_see_programs_are_still_selected_and_not_deleted() {
	    
	}

	@When("Admin enter the program to search By program name")
	public void admin_enter_the_program_to_search_by_program_name() {
	}

	@Then("Admin should able to see Program name, description, and status for searched program name")
	public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_name() {
	   
	}

	@When("Admin enter the program to search By program description")
	public void admin_enter_the_program_to_search_by_program_description() {
	   
	}

	@Then("Admin should able to see Program name, description, and status for searched program description")
	public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_description() {
	   
	}

	@When("Admin enter the program to search By program name that does not exist")
	public void admin_enter_the_program_to_search_by_program_name_that_does_not_exist() {
	   
	}

	@When("Admin enter the program to search By partial name of program")
	public void admin_enter_the_program_to_search_by_partial_name_of_program() {
	    
	}

	@When("Admin clicks Next page link on the program table")
	public void admin_clicks_next_page_link_on_the_program_table() {
	   
	}

	@Then("Admin should see the Pagination has {string} active link")
	public void admin_should_see_the_pagination_has_active_link(String string) {
	    
	}

	@When("Admin clicks Last page link")
	public void admin_clicks_last_page_link() {
	   
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	   
	}

	@Given("Admin is on last page of Program module table")
	public void admin_is_on_last_page_of_program_module_table() {
	    
	}

	@When("Admin clicks Previous page link")
	public void admin_clicks_previous_page_link() {
	   
	}

	@Then("Admin should see the previous page record on the table with pagination has previous page link")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
	    
	}

	@Given("Admin is on Previous Program page")
	public void admin_is_on_previous_program_page() {
	    
	}

	@When("Admin clicks First page link")
	public void admin_clicks_first_page_link() {
	    
	}

	@Then("Admin should see the very first page record on the table with Previous page link are disabled")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
	    
	}



	
	

}
