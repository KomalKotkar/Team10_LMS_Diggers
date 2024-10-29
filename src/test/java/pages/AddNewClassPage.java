package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewClassPage {

	WebDriver driver;
	
	public AddNewClassPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@role='dialog']")
	private WebElement popupWindow;
	
	@FindBy(xpath="//span[contains(text(),'Class Details')]")
	private WebElement popupHeading;
	
	@FindBy(xpath="//span[contains(text(),'Class Details')]/following::span[1]")
	private WebElement closeButton;
	
	@FindBy(xpath="//button[@ng-reflect-label='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//button[@ng-reflect-label='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//label[@for='batchName']")
	private WebElement labelBatchName;
	
	@FindBy(xpath="//label[@for='classTopic']")
	private WebElement labelClassTopic;
	
	@FindBy(xpath="//label[@for='classDescription']")
	private WebElement labelClassDescription;
	
	@FindBy(xpath="//label[@for='classNo']")
	private WebElement labelNumberOfClasses;
	
	@FindBy(xpath="//label[contains(text(),'Staff Name')]")
	private WebElement labelStaffName;
	
	@FindBy(xpath="//input[@id=\"classTopic\"]")
	private WebElement classTopicInput;
	
	@FindBy(xpath="//span[@class=\"p-dropdown-trigger-icon ng-tns-c171-19 pi pi-chevron-down\"]")
	private WebElement batchNameDropdownButton;
	
	@FindBy(xpath="//span[contains(text(),'Micro service-01')]/parent::li")
	private WebElement batchNameOne;
	
	@FindBy(xpath="//button[@ng-reflect-icon=\"pi pi-calendar\"]")
	private WebElement datePickerIcon;
	
	@FindBy(xpath="//button[@class=\"p-datepicker-next p-link ng-tns-c178-41 p-ripple ng-star-inserted\"]")
	private WebElement nextMonthArrow;
	
	@FindBy(xpath="//span[contains(text(),'19')]")
	private WebElement particularDate19;
	
	@FindBy(xpath="//span[contains(text(),'20')]")
	private WebElement particularDate20;
	
	@FindBy(xpath="//div[@class=\"p-dropdown-trigger ng-tns-c171-42\"]")
	private WebElement staffNameDropdownButton;
	
	@FindBy(xpath="//span[contains(text(),'Getha Takur')]")
	private WebElement staffNameSelection;
	
	@FindBy(xpath="//div[@class=\"p-radiobutton p-component p-radiobutton-checked\"]")
	private WebElement activeRadioButton;
	
	@FindBy(xpath="//input[@aria-haspopup=\"listbox\"]")
	private WebElement listBox;
	
	@FindBy(id="classTopic")
	private WebElement checkboxClassTopic;
	
	@FindBy(xpath="//input[@id=\"icon\"]")
	private WebElement datePickerCheckbox;
	
	@FindBy(xpath="//div[@class='radio ng-star-inserted']")
	private WebElement statusActiveInactive;
	
	public void verifyPopupDispayedWithFeatures() {
		for(int i=1;i<=10;i++) {
		popupWindow.isDisplayed();
		popupHeading.isDisplayed();
		closeButton.isDisplayed();
		cancelButton.isDisplayed();
		saveButton.isDisplayed();
		labelBatchName.isDisplayed();
		labelClassTopic.isDisplayed();
		labelClassDescription.isDisplayed();
		labelNumberOfClasses.isDisplayed();
		labelStaffName.isDisplayed();
		}
	}
	
	public void verifyPopupWindow() {
		popupWindow.isDisplayed();
	}
	
	public void verifyPopupWithInputCheckboxes() {
		for(int i=1;i<=4;i++) {
		listBox.isDisplayed();
		checkboxClassTopic.isDisplayed();
		datePickerCheckbox.isDisplayed();
		statusActiveInactive.isDisplayed();
	}
	}
	
	
	public void fillClassTopic() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(batchNameDropdownButton)).click();
		Select select = new Select(batchNameDropdownButton);
		select.selectByVisibleText("Micro service-01");
//		batchNameDropdownButton.click();
//		batchNameOne.click();
//		datePickerIcon.click();
//		nextMonthArrow.click();
//		particularDate19.click();
//		particularDate20.click();
//		classTopicInput.sendKeys("Java class Topic");
//		staffNameDropdownButton.click();
//		staffNameSelection.click();
//		activeRadioButton.click();
	}
}
