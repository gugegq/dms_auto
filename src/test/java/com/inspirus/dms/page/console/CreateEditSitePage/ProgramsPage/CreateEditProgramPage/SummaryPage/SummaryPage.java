package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SummaryPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
	//Constructor
	public SummaryPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	/**
	 * SummaryPage
	 */
	//Summary Page label
	@FindBy(xpath="//form[@id='summaryForm']/fieldset/legend/span[1]")
	public WebElement programSummaryLabel;
	//Export Summary Link
	@FindBy(linkText="Export Program Summary")
	public WebElement exportSummaryLink;
	
	//Nomination - Super Approver labels
	@FindBy(xpath="//table[@id='listApproversTable']/thead/tr/th")
	public List<WebElement> programSummaryNomSuperApproverLabels;
	//Nomination - Super Approver Approver's email
	@FindBy(xpath="//table[@id='listApproversTable']/tbody/tr/td[3]")
	public List<WebElement> programSummaryNomSuperApproverEmails;
	
	//table[@id='listApproversTable']/tbody/tr[1]/td[3]
	
	
	//save cancel button
	@FindBy(xpath="//form[@id='summaryForm']/fieldset/div/button[1]")
	public WebElement saveExit;
	@FindBy(id="saveExit")
	public WebElement saveActivate;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
