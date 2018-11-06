package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.BudgetPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BudgetPage {
	
	//Constructor
	public BudgetPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//No Budget radio
	@FindBy(xpath="//fieldset/div[1]/div/label[1]/input[@value='NO_BUDGET']")
	public WebElement NoBudget;
	//Program Budget radio
	@FindBy(xpath="//fieldset/div[1]/div/label[2]/input[@value='PROGRAM']")
	public WebElement ProgramBudget;
	//the total budget for the program
	public WebElement budgetInDollars;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
