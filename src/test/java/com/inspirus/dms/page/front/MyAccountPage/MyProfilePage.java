package com.inspirus.dms.page.front.MyAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	//Constructor
	public MyProfilePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//uploadPicture Button
	@FindBy(linkText="Upload Picture")
	public WebElement uploadPicture;
	//I Agree/Decline Button
	@FindBy(linkText="I Agree")
	public WebElement agree;
	@FindBy(linkText="I Decline")
	public WebElement decline;
	//Add file Button
	@FindBy(id="file-upload-input-")
	public WebElement AddFile;
	//Start Upload Button
	@FindBy(xpath="//div[@id='pictureControlGroup']/div/div[3]/div/div/a/span")
	public WebElement startUpload;
	//Cancel Upload picture Button
	@FindBy(xpath="//button[@type='reset']")
	public WebElement cancelUpload;
	//Delete headimg Button
	@FindBy(xpath="//div/div/ul/li/button[@type='button']")
	public WebElement delete;
	//cancel Upload picture Button next picture
	public WebElement cancelButton;
	//user Name input box
	public WebElement userName;
	//preferredFirstName input box
	public WebElement preferredFirstName;
	//firstName input box
	public WebElement firstName;
	//lastName input box
	public WebElement lastName;
	//email input box
	public WebElement email;
	//password input box
	public WebElement password;
	//passwordConfirm input box
	public WebElement passwordConfirm;
	//reminderQuestion1 drop-down box
	public WebElement reminderQuestion1;
	//reminderAnswer1 input box
	public WebElement reminderAnswer1;
	//reminderQuestion2 drop-down box
	public WebElement reminderQuestion2;
	//reminderAnswer2 input box
	public WebElement reminderAnswer2;
	
	//Current Tax Election deductPoints check box
	public WebElement deductPoints;
	//Current Tax Election change Button
	@FindBy(xpath="//fieldset/form[2]/div/div[2]/div/div[3]/a")
	public WebElement change;
	//Selecting 'Yes' check box
	public WebElement deductFromPoints;
	//Selecting 'No' check box
	public WebElement deductFromPaycheck;
	//submit Button
	public WebElement submitSelectionButton;
	//Cancel Button
	public WebElement closeButton;
	
	//profile Save Button
	@FindBy(xpath="//fieldset/form[2]/div/div[7]/div/a[1]")
	public WebElement Save;
	//profile save button - for edit profile page
	public WebElement profileSaveButton;
	//profile Cancel Button
	public WebElement Cancel;
	
	
	//register Button
	@FindBy(linkText="Register")
	public WebElement registerButton;
	
	//Assign Your Delegate
	public WebElement delegateUserSearchInput;
	public WebElement delegateApproveNomination;
	public WebElement delegateNomination;
	
	//error message section
	public WebElement errorMessage;
	
}
