package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.BirthdayEligibilityPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthdayEligibilityPage {
	
	//Constructor
	public BirthdayEligibilityPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Save and Continue button
	public WebElement saveContinue;
}
