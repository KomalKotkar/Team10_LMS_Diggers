package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProgramPage {
	
//public WebDriver driver;
private WebDriver driver = DriverFactory.getDriver();
String programURL = "https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/program";
String dashboardURL = "https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com";
	
	//constructor
	public ProgramPage() {
		//this.driver = driver;
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
    @FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']") WebElement errMsg;
    
    
    
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
	}
   
   public void getProgram()
   {
	  // programlink.click();
	}
 
}
