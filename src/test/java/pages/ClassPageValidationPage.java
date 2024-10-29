package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ClassPageValidationPage {

	WebDriver driver;

	public ClassPageValidationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Class')]")
	private WebElement classButton;

	@FindBy(xpath="//button[contains(text(),'Add New Class')]")
	private WebElement addNewClassButton;

	@FindBy(xpath="//div[contains(text(),'Manage Class')]")
	private WebElement manageClassText;

	@FindBy(id="filterGlobal")
	private WebElement searchBox;

	@FindBy(xpath="//th[contains(text(),'Batch Name')]")
	private WebElement headingBatchName;

	@FindBy(xpath="//th[contains(text(),'Class Topic')]")
	private WebElement headingClassTopic;

	@FindBy(xpath="//th[contains(text(),'Class Description')]")
	private WebElement headingClassDescription  ;

	@FindBy(xpath="//th[contains(text(),'Status')]")
	private WebElement headingStatus;

	@FindBy(xpath="//th[contains(text(),'Class Date')]")
	private WebElement headingClassDate ;

	@FindBy(xpath="//th[contains(text(),'Staff Name')]")
	private WebElement headingStaffName;

	@FindBy(xpath="//th[contains(text(),'Edit / Delete')]")
	private WebElement headingEditOrDelete;

	@FindBy(xpath="//span[starts-with(text(),'Showing')]")
	private WebElement numberOfClassesOnPage;

	@FindBy(xpath="//div[starts-with(text(),' In total ')]")
	private WebElement totalClasses;

	@FindBy(xpath="//span[@class='p-paginator-pages ng-star-inserted']")
	private WebElement pageNumberSpan;

	@FindBy(xpath="//span[@class='p-paginator-pages ng-star-inserted']/preceding-sibling::button")
	private WebElement doubleLeftArrow;

	@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-left']/ancestor::button")
	private WebElement singleLeftArrow;

	@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-right']/ancestor::button")
	private WebElement singleRightArrow;

	@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-double-right']/ancestor::button")
	private WebElement doubleRightArrow;

	@FindBy(xpath="//span[@class='p-paginator-pages ng-star-inserted']/button[2]")
	private WebElement pageNoTwo;

	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	private WebElement deleteIcon;
	
	
	public String getPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public void clickOnClassButton() {
		classButton.click();
	}

	public void clickOnAddNewClassButton() {
		addNewClassButton.click();
	}

	public String verifyManageClassText() {
		String manageClass= manageClassText.getText();
		System.out.println(manageClass);
		return manageClass;
	}

	public boolean validateSearchBox() {
		searchBox.isDisplayed();
		return true;
	}

	public void verifyHeadingsOfClassTable() throws InterruptedException {
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		List<WebElement> headings = List.of(headingBatchName,headingClassTopic,headingClassDescription,headingStatus,headingClassDate,headingStaffName,headingEditOrDelete);

		for(WebElement heading : headings) {
			//	System.out.println("Heading is not displayed" + heading);
			Assert.assertTrue(heading.isDisplayed());
		}
	}

	public String verifyNumberOfClassesOnPage() {
		String XtoYofZClasses = numberOfClassesOnPage.getText();
		return XtoYofZClasses;
	}

	public String VerifyTotalClasses() {
		String totalClassesCount = totalClasses.getText();
		System.out.println("Total Classes in class "+totalClassesCount);
		return totalClassesCount;
	}

	public void verifyPagination() {
		//String[] pageTextParts = pageNumberSpan.getText().split(" ");
		System.out.println("pageNumberSpan.getText() "  + pageNumberSpan.getText()+"  EOL");
		String[] split = pageNumberSpan.getText().split("\n");
		int pageCount = 0;
		for(String s : split) {
			System.out.println(s);
			pageCount++;
		}
		System.out.println("pageCount "+pageCount);
		//		int totalPageCount = Integer.parseInt(pageNumberSpan.getText().split(" ")[0]); // Example: "Page 1 of 3"
		int totalPageCount = split.length;
		System.out.println("totalPageCount" + totalPageCount);
		/*
		 * if(totalPageCount>1) { pageNoTwo.click(); }
		 */
		int currentPage = Integer.parseInt(pageNumberSpan.getText().split("\n")[0]);

		if (totalPageCount == 1) {
			System.out.println();

			Assert.assertFalse(singleLeftArrow.isEnabled(), "Single left arrow should be disabled");
			Assert.assertFalse(doubleLeftArrow.isEnabled(), "Double left arrow should be disabled");
			Assert.assertFalse(singleRightArrow.isEnabled(), "Single right arrow should be disabled");
			Assert.assertFalse(doubleRightArrow.isEnabled(), "Double right arrow should be disabled");

		} else {
			if (currentPage == 1 || currentPage == totalPageCount - 1) {
				System.out.println();
			Assert.assertTrue(singleRightArrow.isEnabled(), "Single right arrow should be enabled");
			Assert.assertTrue(doubleRightArrow.isEnabled(), "Double right arrow should be enabled");
			}
			if (currentPage > 1) {
				System.out.println();
				pageNoTwo.click();
				System.out.println("click");
				Assert.assertTrue(singleLeftArrow.isEnabled(), "Single left arrow should be enabled");
				Assert.assertTrue(doubleLeftArrow.isEnabled(), "Double left arrow should be enabled");
			} else {
				System.out.println("enable both");
				Assert.assertFalse(singleLeftArrow.isEnabled(), "Single left arrow should be disabled");
				Assert.assertFalse(doubleLeftArrow.isEnabled(), "Double left arrow should be disabled");
			}
			if (currentPage == totalPageCount) {
				System.out.println("last page");
				Assert.assertFalse(singleRightArrow.isEnabled(), "Single right arrow should be disabled");
				Assert.assertFalse(doubleRightArrow.isEnabled(), "Double right arrow should be disabled");
				Assert.assertTrue(singleLeftArrow.isEnabled(), "Single left arrow should be enabled");
				Assert.assertTrue(doubleLeftArrow.isEnabled(), "Double left arrow should be enabled");
			}
		}
}
	
	public boolean verifyDeleteIcon() {
		deleteIcon.isDisplayed();
		return true;
	}

}
