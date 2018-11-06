package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.BasicInfoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicInfoPage {
	
	//Constructor
	public BasicInfoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Program Type drop-down box
	public WebElement programType;
	//Program Type input box
	public WebElement programTypeLabel;
	//Program Name input box
	public WebElement name;
	//Program code input box
	public WebElement code;
	//Client Reporting Code input box
	public WebElement billToCode;
	//status drop-down box
	public WebElement status;
	//Go-Live Date input box
	@FindBy(id="startDateTemp")
	public WebElement startDate;
	//End Date input box
	@FindBy(id="endDateTemp")
	public WebElement endDate;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/h2/span[3]/span")
	public WebElement programStatus;
	
	//Celebrate Birthday's/Anniversaries Beginning Date input box
	public WebElement celebrateBeginning;
	//nomination Start Date input box
	@FindBy(id="nominationStartDateTemp")
	public WebElement nominationStartDate;
	//nomination End Date input box
	@FindBy(id="nominationEndDateTemp")
	public WebElement nominationEndDate;
	
	//Description iftame
	@FindBy(id="descriptionBasic_ifr")
	public WebElement Descriptioniframe;
	//Preview button
	@FindBy(id="linkId")
	public WebElement Preview;
	//Program Icon link
	@FindBy(linkText="Program Icon")
	public WebElement ProgramIcon;
	//Hide Program check box
	public WebElement hideProgram;
	
	//Program Coordinator(s) Search input box
	public WebElement clientAdminSearchParam;
	//Search button
	public WebElement searchClientAdminSearchParam;
	
	//remove Coordinators 1
	@FindBy(xpath="//div[@id='clientAdminsContainer']/table/tbody/tr/td[3]/append/a/span")
	public WebElement RemoveCoordinators1;
	
	//save cancel button
	public WebElement saveExit;
	@FindBy(id="saveContinue")
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
	
	public WebElement tinymce;
	
	//programs_createWizard_1stProgramIcon
	@FindBy(xpath="//div[@id='PROGRAM_ICONSection']/div[1]/ul[1]/li[1]/div[1]/input[1]")
	public WebElement programs_createWizard_1stProgramIcon;
}
