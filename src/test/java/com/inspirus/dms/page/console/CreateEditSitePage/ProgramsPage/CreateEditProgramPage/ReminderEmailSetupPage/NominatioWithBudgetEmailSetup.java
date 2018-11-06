package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ReminderEmailSetupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NominatioWithBudgetEmailSetup {
	
	//Constructor
	public NominatioWithBudgetEmailSetup(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Budget Owner Activity Email,Budget Account Summary Email
	//Day input
	@FindBy(id="monthlyDate")
	public WebElement monthlyDateInput;
		
	//Budget Owner Eligibility Notifications
	//Check-box monday
	@FindBy(id="monday")
	public WebElement mondaycheckbox;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
	
	
}
