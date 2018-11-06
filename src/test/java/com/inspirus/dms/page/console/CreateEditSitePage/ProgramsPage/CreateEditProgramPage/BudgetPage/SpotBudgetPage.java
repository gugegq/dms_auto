package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.BudgetPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotBudgetPage {
	
	//Constructor
	public SpotBudgetPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Initial Program Budget input box
	public WebElement budgetInDollars;
	
	//minAmountPerAward input box
	public WebElement minAmountPerAward;
	//maxAmountPerAward input box
	public WebElement maxAmountPerAward;
	//increments input box
	public WebElement increments;
	
	//The maximum number of awards a user can give a single participant in this program
	@FindBy(xpath="//form[@id='programBudgetForm']/fieldset/div[3]/input[1]")
	public WebElement maximumnumber;
	@FindBy(xpath="//form[@id='programBudgetForm']/fieldset/div[3]/input[2]")
	public WebElement perDays;
	

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
