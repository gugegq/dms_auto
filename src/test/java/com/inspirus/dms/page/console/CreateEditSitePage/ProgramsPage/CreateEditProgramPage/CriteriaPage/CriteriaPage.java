package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.CriteriaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CriteriaPage {
	
	//Constructor
	public CriteriaPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Add Category button
	@FindBy(linkText="Add Category")
	public WebElement AddCategory;
	//Category Name0 textarea
	public WebElement name0;
	public WebElement name1;
	//Description0 textarea
	public WebElement description0;
	//Criteria00 textarea
	public WebElement criterionText00;
	public WebElement criterionText01;
	public WebElement criterionText10;
	public WebElement criterionText11;
	//Category Active button
	@FindBy(xpath="//tr[@id='category0']/td/a[@class='btn btn-mini btn-success']")
	public WebElement Active0;
	//Add Criterion button
	@FindBy(xpath="//tr[@id='category0']/td/a[@class='btn btn-mini']")
	public WebElement AddCriterion;
	//Category Active button
	@FindBy(xpath="//div[@id='criterion00']/div/a")
	public WebElement Active00;
	//
	@FindBy(linkText="Active")
	public WebElement Active;
	@FindBy(linkText="Inactive")
	public WebElement Inactive;
	@FindBy(linkText="Delete")
	public WebElement Delete;

	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
