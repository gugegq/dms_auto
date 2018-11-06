package com.inspirus.dms.page.console.MaintenancePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteMaintenancePage {
	
	//Constructor
	public SiteMaintenancePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//status select
	public WebElement status;
	//description input box
	public WebElement description;
	//description input box
	public WebElement notifyStartTime;
	//startTime input box
	public WebElement startTime;
	//endTime input box
	public WebElement endTime;
	//Content Editor input frame area
	@FindBy(id="content_ifr")
	public WebElement frame;
	//Content Editor add Image
	@FindBy(id="content_image")
	public WebElement addImage;
	//Save and Exit button
	@FindBy(xpath="//fieldset/div[9]/button[@class='btn btn-primary']")
	public WebElement saveandExit;
	//Cancel button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
}
