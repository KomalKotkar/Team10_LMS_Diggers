package pages;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File; 

import utilities.FileUtil;
import utilities.LoggerLoad;

public class LoginPage {

	private WebDriver driver;
	String loginTestDataFilePath = FileUtil.loginTestDataFilePath;
	public String actualColor;
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators using @FindBy annotations
	@FindBy(id = "username")
	private WebElement usernameField;
	
	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(text(),' LMS - Learning Management System ')]")
	private WebElement dashBoardLmsHeading;
	
	@FindBy (xpath = "//*[@id='mat-form-field-label-1']/span[2]")
	private WebElement userAsteriskLoc;
	
	@FindBy (xpath = "//*[@id='mat-form-field-label-3']/span[2]")
	private WebElement passwordAsteriskLoc;
	
	@FindBy (xpath = "//span[contains(text(),'User')]")
	private WebElement userPlaceHolder;
	
	@FindBy (xpath = "//span[contains(text(),'Password')]")
	private WebElement passwordPlaceHolder;
	
	@FindBy (tagName = "input")
	private List<WebElement> inputTextField;
	
	@FindBy (tagName = "p")
	private WebElement loginMess;
	
	@FindBy (xpath = "//div[@class='image-container']/img")
	private WebElement lmsImage;
	
	@FindBy (tagName = "form")
	private WebElement inputTextForm;
	
	// Methods to interact with the page
    public void enterUsername(String username) {
        usernameField.sendKeys(get(username));
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(get(password));
    }

    public void clickLogin() {
        loginButton.click();
    }
    
    public boolean validateDashboardHeading() {
    	if(dashBoardLmsHeading.isDisplayed()) {
    	return true;
    	}else return false;
    }
    public void verifyInputFieldAlignment() {

		
		getAlignment(inputTextForm);
	}

	public void verifyLoginButtonAlignment() {
		
		getAlignment(loginButton);
	}

	public void getAlignment(WebElement element)
	{
		Dimension windowSize = driver.manage().window().getSize();
		int windowWidth = windowSize.getWidth();
		int windowHeight = windowSize.getHeight();
		// Calculate the center coordinates
		int centerX = windowWidth / 2;
		int centerY = windowHeight / 2;
		// Find an element at the center 
		Point elementLocation = element.getLocation();
		// Compare element position with center coordinates
		if (elementLocation.getX() == centerX && elementLocation.getY() == centerY) {
			System.out.println("Element found at the center!");
		} else {
			System.out.println("Element not at the center.");
		}
	}
    public void fieldsSpellCheck() throws IOException {
		// Identify all input fields : inputTextField
		
		// Initialize spell checker
		JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());
		
		// Loop through each input field
		for (WebElement field : inputTextField) {
			// Extract text from the field
			String text = field.getAttribute("value");
			// Check spelling
			List<RuleMatch> mistakes = langTool.check(text);
			// Report any spelling mistakes
			if (!mistakes.isEmpty()) {
				System.out.println("Spelling mistakes found in field with ID: " + field.getAttribute("id"));
				for (RuleMatch mistake : mistakes) {
					System.out.println("Mistake: " + mistake);
				}
			} else {
				System.out.println("No Spelling mistakes found in field with ID: " + field.getAttribute("id"));

			}
		}
	}
    
    public String getLoginMessage() {
    	return loginMess.getText();
    }
    public String getFirstInputFieldText() {
    	return userPlaceHolder.getText();
    }
    
    public String getSecondInputFieldText() {
    	return passwordPlaceHolder.getText();
    }
    
    public boolean visibilityOfLoginButton() {
    	return loginButton.isDisplayed();
    }
    public boolean visibilityOfUserPlaceholderAsterisk() {
    	return userAsteriskLoc.isDisplayed();
    }
    public boolean visibilityOfPasswordPlaceholderAsterisk() {
    	return  passwordAsteriskLoc.isDisplayed();
    }
    public String get(String getData_name) {	
    	return FileUtil.readFromJson(loginTestDataFilePath, getData_name);
    }
    
    public void verifyCompanyName(String companyName) {
    	textOnImageVerification(companyName);
    }
   
    public void verifyLMSText(String appName) {
    	textOnImageVerification(appName);
    }
    
    public int getTextFieldCountOnLoginPage() {
    	return inputTextField.size();
    }
    public void textOnImageVerification(String expectedText)  {
    	
    	// Capture the image as a BufferedImage
        //BufferedImage image = ImageIO.read(new URL(lmsImage.getAttribute("src")));
        
       // Save the image to a file (optional)
       // ImageIO.write(image, "png", new File("./src/test/resources/TestData/RuntimeImageFile/image.png"));
        File screenshot = lmsImage.getScreenshotAs(OutputType.FILE);
       
        // Initialize Tesseract
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("./tessdata"); // Set the tessdata path
        tesseract.setLanguage("eng"); // Set language if needed

        // Extract text from the image
       
        String extractedText="";
		try {
			extractedText = tesseract.doOCR(screenshot);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Extracted Text: " + extractedText);
       
        if (extractedText.contains(expectedText)) {
             System.out.println(expectedText + " Text is present on the image.");
         } else {
             System.out.println(expectedText + " Text is not present on the image." );
           }
    }
    public boolean  verifyFieldColor(String fieldName) {
    	String actualFieldColor="";

    	// Expected color in RGBA format (for gray)
        String expectedColor = "rgba(0, 0, 0, 0.54)";
    	
        if(fieldName.equalsIgnoreCase("user")) {
    	actualFieldColor = userPlaceHolder.getCssValue("color");
    	} else if (fieldName.equalsIgnoreCase("password")) {
    		actualFieldColor = passwordPlaceHolder.getCssValue("color");
    	}
        if(actualFieldColor.equals(expectedColor)) {
        	return true;
        }
        else return false;
    	//return findTextColor(actualFieldColor);  
	}

	public String verifyPasswordFieldColor() {
		String passwordColor = passwordPlaceHolder.getCssValue("color");
		return findTextColor(passwordColor);   
	}
    
    public String findTextColor(String textColor)
	{
    	LoggerLoad.info("Text color " + textColor);
		Color color = Color.fromString(textColor);
		actualColor = color.asHex();
		LoggerLoad.info("hex value = " + color.asHex());
		return actualColor;
	}
}
