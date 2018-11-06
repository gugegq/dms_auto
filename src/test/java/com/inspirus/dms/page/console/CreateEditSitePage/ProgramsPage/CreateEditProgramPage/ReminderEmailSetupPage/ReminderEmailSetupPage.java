package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ReminderEmailSetupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReminderEmailSetupPage {
	
	//Constructor
	public ReminderEmailSetupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Birthday Notification options
	//The day of check box
	public WebElement notifyManager;
	//1 day check box
	public WebElement notifyManager1Day;
	//3 day check box
	public WebElement notifyManager3Days;
	//14 day check box
	public WebElement notifyManager14Days;

	//from Email input box
	public WebElement fromEmail;
	//subject line input box
	public WebElement subject;
	//Preview button
	public WebElement linkId;
	
	//Print button
	@FindBy(xpath="//form[@id='programEmailTemplatePreviewForm']/div[3]/input")
	public WebElement print;
	//Close button
	@FindBy(xpath="//form[@id='programEmailTemplatePreviewForm']/div[3]/button")
	public WebElement close;
	//Insert a field drop-down button
	@FindBy(xpath="//form[@id='programEmailTemplateForm']/fieldset/div[4]/div/div/button[2]")
	public WebElement Insertafield;
	
	//currentYear
	public WebElement currentYear;
	//birthday
	public WebElement birthday;
	//participantName
	public WebElement participantName;
	//managerFirstName
	public WebElement managerFirstName;
	//managerLastName
	public WebElement managerLastName;
	//clientName
	public WebElement clientName;
	//iteAlternateName
	public WebElement iteAlternateName;
	//serviceYear
	public WebElement serviceYear;
	//anniversaryDate
	public WebElement anniversaryDate;
	
	
	//Spell Check button
	@FindBy(xpath="//form[@id='programEmailTemplateForm']/fieldset/div[4]/div/div/button[3]")
	public WebElement SpellCheck;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
