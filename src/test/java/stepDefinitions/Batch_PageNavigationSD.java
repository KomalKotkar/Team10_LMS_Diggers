package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.BatchPage;
import pages.LoginPage;

public class Batch_PageNavigationSD {
	WebDriver driver = DriverFactory.getDriver();
	BatchPage bp = new BatchPage(driver);
	LoginPage loginPage = new LoginPage(driver);

	@Given("Admin is Logged in")
	public void admin_is_on_the_dashboard_page() {
		loginPage.enterUsername("Sdet@gmail.com");
		loginPage.enterPassword("LmsHackathon@2024");
		loginPage.clickLogin();
		System.out.println("Admin is now on logged in");
	}

	@When("Admin Clicks on the Batch menu from the header")
	public void admin_clicks_on_the_batch_menu_from_the_header() {
		bp.checkaddNewBatch();
	}

	@Then("Admin should be in the Manage Batch Page")
	public void admin_should_be_in_the_manage_batch_page() {
		//covered above
	}

	@Then("Admin should see the LMS-Learning Management System Title")
	public void admin_should_see_the_title() {
		bp.checkLogoOnBatchPage();
	}

	@Then("Admin should see the Manage Batch Heading")
	public void admin_should_see_the_heading() {
		bp.checkLogoOnBatchPage();
	
	}

	@Then("Admin should see the disabled Delete Icon under the header")
	public void admin_should_see_the_disabled_under_the_header() {
		bp.checkDisabledDeleteIcon();
		
	}

	@Then("Admin should see the edit icon in each row")
	public void admin_should_see_the_edit_icon_in_each_row() {
	bp.checkEditButtonsonPage();
	}

	@Then("Admin should see the delete icon in each row")
	public void admin_should_see_the_delete_icon_in_each_row() {
		bp.checkDeleteButtonsonPage();
	}

	@Then("Admin should see the checkbox in each row")
	public void admin_should_the_checkbox_in_each_row() {
		bp.checkboxesonPage();
	}

	@Then("Admin should see the checkbox  in the datatable header row")
	public void admin_should_see_the_checkbox_in_the_datatable_header_row() {
		bp.checkboxDatatable();
	}

}
