package stepDefinitions;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProgramPage;

public class ProgramSteps {
	
	//WebDriver driver = DriverFactory.getDriver();
	ProgramPage ProgramPage = new ProgramPage();
	
	//ProgramSteps program = new ProgramSteps();
	
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
	   
	}



}
