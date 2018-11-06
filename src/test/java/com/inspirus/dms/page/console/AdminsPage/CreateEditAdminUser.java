package com.inspirus.dms.page.console.AdminsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditAdminUser {
	
	//userName input box
	public WebElement userName;
	//newPassword input box
	public WebElement newPassword;
	//passwordConfirm  input box
	public WebElement passwordConfirm;
	//firstName  input box
	public WebElement firstName;
	//lastName  input box
	public WebElement lastName;
	//email  input box
	public WebElement email;
	//userStatusType  select
	public WebElement userStatusType;
	//userAccessType  select
	public WebElement userAccessType;
	//userType  select
	public WebElement userType;
	//Save button
	@FindBy (linkText="Save")
	public WebElement Save;
	//Save button
	@FindBy (linkText="Cancle")
	public WebElement Cancel;
	
	//Constructor
	public CreateEditAdminUser(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
}
