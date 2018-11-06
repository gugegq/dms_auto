package com.inspirus.dms.page.console.CreateEditSitePage.ContentPage.NewsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEditNewsPage {
	
	//Constructor
	public CreateEditNewsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//status drop-down box
	public WebElement status;
	//description input box
	public WebElement description;
	//start Date input box
	public WebElement startDate;
	//end Date input box
	public WebElement endDate;
	//Content Editor iframe
	public WebElement newsContentEditor_ifr;
	//backgroundColor input box
	public WebElement backgroundColor;
	//show button
	@FindBy(xpath="//fieldset/div[8]/div/div[1]/button[1]")
	public WebElement Show;
	//hide button
	@FindBy(xpath="//fieldset/div[8]/div/div[1]/button[2]")
	public WebElement Hide;
	//Add file button
	@FindBy(id="file-upload-input-")
	public WebElement AddFile;
	//Start Upload
	@FindBy(linkText="Start Upload")
	public WebElement StartUpload;
	//CancelAll button
	@FindBy(xpath="//fieldset/div[8]/div/div[2]/div[2]/div[1]/div/button")
	public WebElement CancelAll;
	//Compact button
	@FindBy(xpath="//fieldset/div[9]/div/div[1]/button[1]")
	public WebElement Compact;
	//Full button
	@FindBy(xpath="//fieldset/div[9]/div/div[1]/button[2]")
	public WebElement Full;
	//saveExit button
	public WebElement saveExit;
	//Cancel button
	@FindBy(id="createEditSite")
	public WebElement Cancel;
}
