package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import factory.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.LoggerLoad;


public class ProgramPage {
	
	SoftAssert Assert = new SoftAssert();
private WebDriver driver = DriverFactory.getDriver();
String programURL = "https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/program";
String dashboardURL = "https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com";
	
	//constructor
	public ProgramPage()
	{
				PageFactory.initElements(driver,this);
	}

	@FindBy(linkText="Program") WebElement programlink1;
	@FindBy(xpath ="//a[text()='Program']") WebElement programlink;
		
	@FindBy(xpath ="//a[text()='Add New Program']") WebElement addProgramLink;
	 @FindBy(id = "programName") WebElement program_name;
	 @FindBy(id = "programDescription") WebElement program_desc;
	 
	 //ManageProgramHeading
	 @FindBy(xpath="//div[contains(text(),'Manage Program')]")public WebElement manageprogramheader;
	 
	 //Search
    @FindBy (xpath="//input[@id='filterGlobal']") WebElement search;
    
    //Footer in total there are 33 programs
    @FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']") WebElement footerMsg;
    
    
    
    @FindBy (xpath="//span[@class='p-button-icon pi pi-trash']") WebElement dlt_btn;
    @FindBy (xpath="//span[@class='p-paginator-icon pi pi-angle-double-right']") WebElement pagentr_dubright;
      @FindBy (xpath="//span[@class='paginator-icon pi pi-angle-double-left']") WebElement pagentr_dubleft;
     @FindBy (xpath="//span[@class='p-paginator-current ng-star-inserted']") WebElement curr_page_showing;
      @FindBy (xpath="//span[@class='p-paginator-icon pi pi-angle-left']") WebElement pagentr_left;
      @FindBy (xpath="//span[@class='p-paginator-icon pi pi-angle-right']") WebElement pagentr_right;
    @FindBy (xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']") WebElement pname_asc_dsc;
    @FindBy (xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']") WebElement pdesc_asc_dsc;
   // <span class="p-dialog-header-close-icon ng-tns-c168-6 pi pi-times" ng-reflect-ng-class="pi pi-times"></span>
 @FindBy (xpath="//span[@class='p-dialog-header-close-icon ng-tns-c168-6 pi pi-times']") WebElement prmdetails_close_btn;
@FindBy (xpath="//button[@ng-reflect-label='Cancel']") WebElement radiobtn_cancel;
 @FindBy(id = "saveProgram") WebElement radiobtn_save;
 
   public void getprogrampage() 
    {		
		driver.get(programURL);
	}
   
   public void getdashboardpage() 
    {		
		driver.get(dashboardURL);
		//String curnturl = driver.getCurrentUrl();
		//if (curnturl == dashboardURL)
			//LoggerLoad.info("Admin is on the dashboard page");
	}
   
   public void getProgram()
   {
	 // programlink.click();
	}
   
   public void verifyHeaderText(String expheaderTxt) {
		//LoggerLoad.info("Admin see the header Text");
	//	Assert.assertEquals(manageprogramheader.getText(), expheaderTxt);
	}
   
   public void verifySearchText(String searchTxt) {
		//LoggerLoad.info("Admin see the Search Text box has text as \"Search\"");
		//Assert.assertEquals(search.getText(), searchTxt);
	}
 
   public void verifyFooterText(String expfooterTxt) {
		//LoggerLoad.info("Admin see the footer Text");
		//Assert.assertEquals(footerMsg.getText(), expfooterTxt);
	}
}
