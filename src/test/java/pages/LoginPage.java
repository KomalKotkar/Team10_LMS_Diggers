package pages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File; 

import utilities.FileUtil;
import utilities.LoggerLoad;
import utilities.TestDataReader;

public class LoginPage {

	private WebDriver driver;
	String loginTestDataFilePath = FileUtil.loginTestDataFilePath;
	public String actualColor;
	WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	Actions action;
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
		
		@FindBy (xpath = "//*[@id='errormessage']")
		private WebElement invalidUsrPasswordErrorMsg;
		
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
				LoggerLoad.info("Element found at the center!");
			} else {
				LoggerLoad.info("Element not at the center.");
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
					LoggerLoad.info("Spelling mistakes found in field with ID: " + field.getAttribute("id"));
					for (RuleMatch mistake : mistakes) {
						LoggerLoad.info("Mistake: " + mistake);
					}
				} else {
					LoggerLoad.info("No Spelling mistakes found in field with ID: " + field.getAttribute("id"));

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
	        	LoggerLoad.info(expectedText + " Text is present on the image.");
	         } else {
	        	 LoggerLoad.info(expectedText + " Text is not present on the image." );
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
	    
	    public String getExpectedErrorMessage(String key) {
	    	return get(key);
	    }
	    
	    public boolean errorMsgValidation() {
			wait.until(ExpectedConditions.visibilityOf(invalidUsrPasswordErrorMsg));
			if (invalidUsrPasswordErrorMsg.isDisplayed()) {
				if ((invalidUsrPasswordErrorMsg.getText()).equals(get("ExpectedErrorMessage"))) {
					return true;
				} else
					return false;
			} else {
				LoggerLoad.info("Error Message is not Displayed!");
				return false;
			}
	    }
	    
	    public void launchUrl(String url) {
	    	driver.get(url);
	    }
	    
	    
	    public int actualResponseCode() throws MalformedURLException, IOException {
			String httpURL = driver.getCurrentUrl();	        
			// Send HTTP GET request to the current URL
			HttpURLConnection connection = (HttpURLConnection) new URL(httpURL).openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			int responseCode = connection.getResponseCode();
			LoggerLoad.info("URL:" +httpURL+" " +" Response Code:"+responseCode);
			return responseCode;
		}
	    
	    public void loginActionUsingMouse() {
			action = new Actions(driver);
			action.moveToElement(usernameField).sendKeys(get("ValidUsername")).build().perform();
			action.moveToElement(passwordField).sendKeys(get("ValidPassword")).build().perform();
			action.moveToElement(loginButton).click().perform();
		}
	    
	    public void loginActionUsingKeyboard
		(String username, String password) throws InterruptedException {
			action = new Actions(driver);
			//sending username using keyboard actions
			action.moveToElement(usernameField)
			.click()
			.sendKeys(usernameField, get(username)).build().perform();
			//sending password using keyboard actions
			action.moveToElement(passwordField).click()
			.sendKeys(passwordField, get(password)).build().perform();
			Thread.sleep(200);
			//clicking login button using keyboard actions	
			action.moveToElement(loginButton).click().perform();
		}
	    
	}
