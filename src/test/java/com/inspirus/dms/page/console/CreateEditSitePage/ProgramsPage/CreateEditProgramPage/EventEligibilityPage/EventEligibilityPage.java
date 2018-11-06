package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.EventEligibilityPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.EligibilityPage.EligibilityPage;

public class EventEligibilityPage extends EligibilityPage{

	//Constructor
	public EventEligibilityPage(WebDriver driver){
		super(driver);
	}
	
	//event first
	//Edit button  
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr/td[4]/a[1]")
	public WebElement Edit;
	//Eligibility button
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr/td[4]/a[2]")
	public WebElement Eligibility;
	//delete button
	@FindBy(xpath="//table[id='clientAdmin']/tbody/tr/td[4]/a[3]")
	public WebElement delete;

	//Date input box
	@FindBy(xpath="//form[@id='programEligibilityForm']/table/tbody/tr/td[2]/input")
	public WebElement Date;
	//Event Name input box
	@FindBy(xpath="//form[@id='programEligibilityForm']/table/tbody/tr/td[4]/input")
	public WebElement EventName;
	//special Event Eligibility Type drop-down box
	public WebElement specialEventEligibilityType;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
