package pages;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BatchPage {
	WebDriver driver;

	public BatchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators using @FindBy annotations
	@FindBy(xpath = "//span[text()='Batch']")
	private WebElement batchButton;

	@FindBy(xpath = "//button[text()='Add New Batch']")
	private WebElement addNewBatch;

	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	private WebElement disabledDeleteButton;

	@FindBy(xpath = "//div[text()=' Manage Batch']")
	private WebElement manageBatch;

	@FindBy(xpath = "//span[text()=' LMS - Learning Management System ']")
	private WebElement LMSlogo;

	@FindBy(id ="filterGlobal")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[text()=' Manage Batch']/following::div[3]")
	private WebElement searchSpan;

	@FindBy(xpath = "//button[@ng-reflect-icon = 'pi pi-pencil']")
	private WebElement editBatch;

	@FindBy(xpath = "//span[text() = 'Batch Details']")
	private WebElement batchDetails;

	@FindBy(id = "programName")
	private WebElement ProgramNamefield;

	@FindBy(xpath = "//label[text()='Program Name ']/following::span[1]")
	private WebElement ProgramNameDropdown;
	
	@FindBy(xpath = "//label[text()='Program Name ']/following::input[1]")
	private WebElement ProgramNameInput;

	@FindBy(id = "batchNoOfClasses")
	private WebElement noOfClassesInput;

	@FindBy(xpath = "//lable[text()='Status : ']")
	private WebElement Status;

	@FindBy(xpath = "//label[text()='Description ']")
	private WebElement descriptionHeader;

	@FindBy(xpath = "//input[@id='batchDescription']")
	private WebElement batchDescription;

	@FindBy(xpath = "//input[@id ='ACTIVE']")
	private WebElement activeStatus_;

	@FindBy(xpath = "//p-radiobutton[@id='batchStatus']")
	private WebElement selectStatus;

	@FindBy(xpath = "//input[@id='batchName'][1]")
	private WebElement batchNameSuffix;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[@ng-reflect-label='Save']")
	private WebElement editsaveButton;

	@FindBy(xpath = "//span[text() ='Batch Details']/following::button[1]")
	private WebElement closeButton;

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//label[text()='Program Name ']/following::li[1]")
	private WebElement firstProgramNameOption;

	@FindBy(xpath = "//label[text()='Program Name ']/following::li[2]")
	private WebElement secondProgramNameOption;

	@FindBy(xpath = "//input[id='batchProg']")
	private WebElement batchNamePrefix;
	
	@FindBy(xpath = "//label[text()='Description ']/following::small[1]")
	private WebElement batchdescerrormsg;

	
	@FindBy(xpath = "//label[text()='Description ']/preceding::input[@id='batchName'][1]")
	private WebElement batchNameInput;
	
	@FindBy(xpath = "//small[text()='This field accept only numbers and max 5 count. ']")
	private WebElement errorMessageforBatchnumber;

	@FindBy(xpath = "//small[text()='Status is required.']")
	private WebElement mandatemessage;
	
	@FindBy(xpath = "//td[text()='batch']")
	private WebElement editedfield;

	@FindBy(xpath = "//span[@class='p-checkbox-icon']")
	private WebElement allcheckBoxes;

	@FindBy(xpath = "//th[text()='Batch Name ']/preceding::div[@class='p-checkbox-box']")
	private WebElement datatableCheckbox;

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-trash']")
	private WebElement deleteButtons;
	
	@FindBy(xpath = "//div[text()='Successful']")
	private WebElement editsuccessfulmsg;

	// ---Methods to interact with the page----

	// Scenario Verify sub menu displayed in batch menu bar
	public void checkaddNewBatch() {
		batchButton.click();
		manageBatch.isDisplayed();
	}

	// Scenario Validate Admin is able to click on the Add new Batch Option
	public void addNewBatch() {
		batchButton.click();
		addNewBatch.click();
		batchDetails.isDisplayed();
	}

	// Scenario Validate all the fields exist in pop up & Scenario Validate input
	// data only for mandatory fields
	public void checkbatchDetailsPopUpWindow() {
		ProgramNameDropdown.click();
		ProgramNameDropdown.isDisplayed();
		firstProgramNameOption.click();
		firstProgramNameOption.isDisplayed();
		batchDescription.click();
		batchNameSuffix.isDisplayed();
		batchDescription.click();
		batchNamePrefix.isDisplayed();
		Status.click();
		selectStatus.isDisplayed();
		noOfClassesInput.click();
		noOfClassesInput.isDisplayed();
	}

	// Scenario Validate input data only for mandatory fields
	public void validateInputDataforMandatoryFields() {
		ProgramNameDropdown.click();
		firstProgramNameOption.click();
		batchDescription.click();
		batchNameSuffix.click();
		batchNameSuffix.sendKeys("55");
		Status.click();
		selectStatus.click();
		noOfClassesInput.click();
		noOfClassesInput.sendKeys("5");
		saveButton.click();
		if (manageBatch.isDisplayed()) {
			System.out.println("Mandatory fields saved successfully");
		}
	}

	// Scenario Validate batchname prefix selected program name
	public void checkProgramName() {
		if (batchDetails.isDisplayed()) {
			ProgramNameDropdown.click();
			firstProgramNameOption.click();
			// Thread.sleep(2000);
			String batch_name = batchNamePrefix.getText();
			System.out.println(batch_name);
		}
	}

	// Scenario Validate batch name suffix box should accept only numbers
	public void checkBatchNumberShouldAcceptNumbersOnly() {
		if (batchDetails.isDisplayed()) {
			ProgramNameDropdown.click();
			firstProgramNameOption.click();
			batchNameSuffix.click();
			batchNameSuffix.sendKeys("Hi");
			errorMessageforBatchnumber.click();
			String error_msg = errorMessageforBatchnumber.getText();
			Assert.assertEquals(error_msg, "This field accept only numbers and max 5 count.");
			System.out.println("batch name suffix box accepts only numbers");
		}
	}

	// Scenario Validate batch name prefix box is not editable
	public void checkBatchNumberPrefixfield() {
		String prefix = batchNamePrefix.getAttribute("readonly");
		System.out.println(prefix);
		if (prefix.equals("true")) {
			System.out.println("batch name prefix box is not editable");
		} else {
			System.out.println("batch name prefix box is editable");
		}
	}

	// Scenario validate input data missing for mandatory fields
	public void checkInputDataMissingforMandatoryDetails() {
		ProgramNameDropdown.click();
		secondProgramNameOption.click();
		batchNameSuffix.click();
		batchNameSuffix.sendKeys("55");
		batchDescription.click();
		batchDescription.sendKeys("test");
		// Status.click();
		noOfClassesInput.click();
		saveButton.click();
		String mandatemsg = mandatemessage.getText();
		Assert.assertEquals(mandatemsg, "Status is required.");
	}

	// Scenario validate save button in Batch details pop up
	public void validateSaveButtonInBatchDetails() throws InterruptedException {
		// addNewBatch.click();
		ProgramNameDropdown.click();
		firstProgramNameOption.click();
		batchNameSuffix.click();
		batchNameSuffix.sendKeys("40");
		Thread.sleep(3000);
		batchDescription.click();
		batchDescription.sendKeys("this is test");
		Status.click();
		Thread.sleep(1000);
		selectStatus.click();
		noOfClassesInput.click();
		noOfClassesInput.sendKeys("5");
		saveButton.click();
		if (manageBatch.isDisplayed()) {
			System.out.println("New Batch Details saved");
		}
	}

	// Scenario validate cancel button in Batch details pop up
	public void validateCancelButtonInBatchDetails() {
		// addNewBatch.click();
		ProgramNameDropdown.click();
		secondProgramNameOption.click();
		batchNameSuffix.click();
		batchNameSuffix.sendKeys("50");
		batchDescription.click();
		Status.click();
		selectStatus.click();
		cancelButton.click();
		if (manageBatch.isDisplayed()) {
			System.out.println("New Batch Details cancelled");
		}
	}

	// Scenario validate close icon on the batch details pop up
	public void validateCloseButtonInBatchDetails() {
		// addNewBatch.click();
		batchDescription.click();
		closeButton.click();
		if (manageBatch.isDisplayed()) {
			System.out.println("Batch details closed without creating new batch");
		}
	}

	// Page Navigation methods
	public void checkLogoOnBatchPage() {
		if (manageBatch.isDisplayed()) {
			// LoggerLoad.info("Landed on Batch Page")
		}
		if (LMSlogo.isDisplayed()) {
			// LoggerLoad.info("LMS logo is visible")
		}
	}

	public void checkDisabledDeleteIcon() {
		manageBatch.click();
		disabledDeleteButton.getAttribute("disabled");
		/*
		 * boolean delete = disabledDeleteButton.isEnabled(); if (delete) {
		 * System.out.println("Delete Button is disabled");
		 * 
		 * } else { System.out.println("Delete Button is enabled"); }
		 */
	}

	public boolean checkEditButtonsonPage() {
		List<WebElement> editbuttons = driver.findElements(By.xpath("//button[@ng-reflect-icon ='pi pi-pencil']"));
		return !editbuttons.isEmpty();
	}

	public boolean checkDeleteButtonsonPage() {
		List<WebElement> deletebuttons = driver.findElements(By.xpath("//button[@ng-reflect-icon='pi pi-trash']"));
		return !deletebuttons.isEmpty();
	}

	public boolean checkboxesonPage() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//span[@class='p-checkbox-icon']"));
		return !checkboxes.isEmpty();
	}

	public void checkboxDatatable() {
		manageBatch.click();
		datatableCheckbox.isDisplayed();
	}
	
	//Edit Icon Methods & search 
	
	public void searchBatch() {
		checkaddNewBatch();
		searchSpan.click();
		searchButton.click();
		searchButton.sendKeys("SMP");
	}
	
	public void editBatch() {
		checkaddNewBatch();
		searchButton.click();
		searchButton.sendKeys("SMP");
		editBatch.click();
		batchDetails.isDisplayed();
	}
	
	public void programNameuneditableforEdit() {
		ProgramNameInput.click();
		String pm= ProgramNameInput.getAttribute("disabled");
		if(pm.equals("true"))
		{
			System.out.println("Program Name is uneditable");
		}
	}
		
		public void batchNameuneditableforEdit() {
			batchNameInput.click();
			String bn= batchNameInput.getAttribute("disabled");
			if(bn.equals("true"))
			{
				System.out.println("Batch Name is uneditable");
			}
	}
		
		
		public void enterDetailsforEdit() {
			batchDescription.clear();
			batchDescription.sendKeys("@");
			String bd= batchdescerrormsg.getText();
			Assert.assertEquals(bd, "This field should start with an alphabet and min 2 character.");
			noOfClassesInput.clear();
			//noOfClassesInput.sendKeys("10");
			String err= noOfClassesInput.getText();
			if(err.contains("Number of classes is required"))
			{
				System.out.println("Encountered Error");
			}
			
	}
		
		public void editDetailsAndSave() {
			batchDescription.clear();
			batchDescription.sendKeys("batch");
			editsaveButton.click();
			editsuccessfulmsg.click();
			Assert.assertEquals(editedfield.getText(), "batch");
			
			
			}
			
		public void editDetailsAndCancel() {
			batchDescription.clear();
			batchDescription.sendKeys("batch");
			cancelButton.click();
			}
	

}
