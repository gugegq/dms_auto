package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.AwardLevelSetupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardLevelSetupPage {

	//Constructor
	public AwardLevelSetupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//add an Award Level button
	public WebElement addAwardLevel;
	//award Type drop-down box
	public WebElement awardType;
	//Award in Dollars input box
	public WebElement awardDollars;
	//Minimum - Budget in Dollars input box
	public WebElement minimumBudgetDollars;
	//Maximum - Budget in Dollars input box
	public WebElement maximumBudgetDollars;
	//catalog Code input box
	public WebElement catalogCode;
	//Level Description input box
	public WebElement description;
	//Message textarea
	public WebElement awardLevelMessage;
	//Insert a field drop-down button
	@FindBy(xpath="//form[@id='addAwardLevelForm']/div/div[2]/div[5]/div[2]/button[2]")
	public WebElement Insertafield;
	//customerName
	public WebElement customerName;
	//firstName
	public WebElement firstName;
	//middleInitial
	public WebElement middleInitial;
	//lastName
	public WebElement lastName;
	//suffix
	public WebElement suffix;
	//Spell Check
	@FindBy(linkText="Spell Check")
	public WebElement SpellCheck;
	//From search input box
	public WebElement fromHonorAwardLevelUserSearch;
	
	//Recognition Card Images button
	public WebElement selectEcards;
	//Recognition Card Images Cancel button
	@FindBy(xpath="//div[@id='selectImagesModal']/div[3]/button[1]")
	public WebElement CancelSelectImage;
	//Recognition Card Images submit button
	public WebElement saveHonorsAwardLevelEcards;
	//Certificate Images button
	public WebElement selectCertificate;
	//Certificate Images Cancel button
	@FindBy(xpath="//div[@id='selectCertificateModal']/div[3]/button[1]")
	public WebElement CancelSelectCertificate;
	//Certificate Images submit button
	public WebElement saveHonorsAwardLevelCertificate;

	//close Add Award Level window icon
	@FindBy(xpath="//div[@id='addHonorsAwardLevelModal']/div[1]/button")
	public WebElement closeAddAwardLevelwindow;
	//Add Award Level button
	@FindBy(id="saveAwardLevel")
	public WebElement saveAwardLevel;
	
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
