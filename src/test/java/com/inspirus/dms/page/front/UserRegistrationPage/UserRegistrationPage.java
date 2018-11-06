package com.inspirus.dms.page.front.UserRegistrationPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class UserRegistrationPage {
	
	//Constructor
	public UserRegistrationPage(WebDriver driver){
		jse = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}
	
	//Register Button
	public WebElement registerButton;
	//Cancel change imformation Button
	@FindBy(linkText="Cancel")
	public WebElement cancel;
	//uploadPicture Button
//	@FindBy(linkText="Upload Picture")
	@FindBy(xpath="//form[@id='profileImageForm']/div[2]/div[1]/div[1]/a")
	public WebElement uploadPicture;
	//I Agree/Decline Button
	@FindBy(linkText="I Agree")
	public WebElement agree;
	@FindBy(linkText="I Decline")
	public WebElement decline;
	//Add file Button
	@FindBy(linkText="Add file(s)...")
	public WebElement addFile;
	//Start Upload Button
	@FindBy(linkText="Start Upload")
	public WebElement startUpload;
	//Cancel Upload picture Button
	@FindBy(xpath="//div[4]/div/div/fieldset/form[1]/div[2]/div/div/div[3]/div[1]/div/button")
	public WebElement cancelUpload;
	//Delete headimg Button
	//@FindBy(xpath="//div[4]/div/div/fieldset/form[1]/div[2]/div/div/div[1]/ul/li/button")
	@FindBy(className = "imgDel")
	public WebElement delete;
	//preferred First Name input box
	public WebElement preferredFirstName;
	//email input box
	public WebElement email;
	//password input box
	public WebElement password;
	//passwordConfirm input box
	public WebElement passwordConfirm;
	//reminderAnswer1 input box
	public WebElement reminderAnswer1;
	//reminderAnswer2 input box
	public WebElement reminderAnswer2;
	//deduct From Points check box
	public WebElement deductFromPoints;
	//deduct From Points check box
	public WebElement deductFromPaycheck;
	//reminder Question1 select
	public WebElement reminderQuestion1;
	//reminder Question2 select
	public WebElement reminderQuestion2;
	
//	private WebDriver driver;
	private JavascriptExecutor jse = null;
	//Cancel button that listed at the bottom of the page
	@FindBys({
		@FindBy(id = "registerForm"),
		@FindBy(linkText = "Cancel")})
	private WebElement CancelRegistraterButton;
	@FindBy(xpath = "//a[@id='registerButton']")
	private WebElement register;

//	public UserRegistrationPage(WebDriver driver){
//		jse = (JavascriptExecutor) driver;
//		PageFactory.initElements(driver, this);
//	}
	
//	public void iniRegistrationPage(WebDriver driver){
//		PageFactory.initElements(driver, this);
//	}
	// Is 'Cancel' button that should be listed at the bottom of the page existed?
	public Boolean isCancelButtonExisted(){
		Boolean flag = false;
		try{
			this.scrollToView(reminderAnswer2);
			if (cancel.isDisplayed() && cancel.isEnabled()) flag = true;
		}catch(NoSuchElementException e){
			fail("The Cancel button that should be listed at the bottom of the page is not existed!");
		}
		return flag;
	}
	
	// Is 'Register' that should be listed at the bottom of the page button existed?
	public Boolean isRegisterButtonExisted(){
		Boolean flag = false;
		try{
			System.out.println("register.isDisplayed:" + register.isDisplayed());
			System.out.println("register.isEnabled:" + register.isEnabled());
			//this.scrollToView(register);
			if (register.isDisplayed() && register.isEnabled()) flag = true;
		}catch(NoSuchElementException e){
			fail("The register button that should be listed at the bottom of the page is not existed!");
		}
		return flag;
	}
	
	// Enter a info into element
	public void enterInfo(WebElement element, String info){
		try{
			element.clear();
			element.sendKeys(info);
		}catch(NoSuchElementException e){
			fail("Can not add info: " + info + "into element: " + element.getTagName());
		}
	}
	
	// Click on the 'Register' button
	public Object clickOnRegister(){
		if (isRegisterButtonExisted()){
			//this.register.click();
			jse.executeScript("arguments[0].click()", register);
		}
		return null;
	}
	
	// Set questions
	public void setSpecialQuestion(WebElement element, String questionOption){
		try{
			new Select(element).selectByVisibleText(questionOption);
		}catch(NoSuchElementException e){
			fail("element: " + element.getAttribute("id") + " or question option: " + questionOption + " is not existed");
		}
	}
	
	// get the value of the answers
	public String getValueOfAnswers(WebElement element){
		String answer = null;
		try{
			answer = element.getAttribute("value");
		}catch(NoSuchElementException e){
			fail("element: " + element.getAttribute("id") + " or attribute: value is not existed");
		}
		return answer;
	}
	
	// click on the 'upload picture'
	public void clickOnUploadPicture(){
		try{
			//this.scrollToView(uploadPicture);
			uploadPicture.click();
		}catch(NoSuchElementException e){
			fail("The upload picture button is not existed");
		}
	}
	
	// scroll to view
	public void scrollToView(WebElement element) {
		try{
			jse.executeScript("arguments[0].scrollIntoView()", element);
		}catch(NoSuchElementException e){
			fail ("The element does not exist, scroll into view failed!");
		}
	}
	
	// click on the 'I decline'
	public void clickOndecline(){
		try{
			//this.scrollToView(decline);
			decline.click();
		}catch(NoSuchElementException e){
			fail("The upload picture button is not existed");
		}
	}
	
	// click on the 'I agree'
	public void clickOnAgree(){
		try{
			//this.scrollToView(agree);
			agree.click();
		}catch(NoSuchElementException e){
			fail("The upload picture button is not existed");
		}
	}
}
