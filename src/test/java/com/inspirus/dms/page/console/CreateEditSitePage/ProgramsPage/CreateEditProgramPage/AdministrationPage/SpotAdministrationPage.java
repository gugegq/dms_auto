package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.AdministrationPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotAdministrationPage {
	
	//Constructor
	public SpotAdministrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Initial budget
	@FindBy(id="budgetInDollars")
	public WebElement InitialBudget;
	//Sumbit button
	@FindBy(xpath="//div[@id='spotBudgetAmount2']/div[6]/div/button")
	public WebElement SubmitInitialBudget;
	
	//Adjust a Participant's Spot Budget drop-down link
	@FindBy(linkText="Adjust a Participant's Spot Budget")
	public WebElement AdjustParticipantSpotBudget;
	//Transfer a Spot Budget between Participants drop-down link
	@FindBy(linkText="Transfer a Spot Budget between Participants")
	public WebElement TransferSpotBudgetbetweenParticipants;
	//Upload the Allocated Spot Budget drop-down link
	@FindBy(linkText="Upload the Allocated Spot Budget")
	public WebElement UploadAllocatedSpotBudget;
	//Distribute the Spot Budget drop-down link
	@FindBy(linkText="Distribute the Spot Budget")
	public WebElement DistributeSpotBudget;
	//Spot Program Budget Adjustment drop-down link
	@FindBy(linkText="Spot Program Budget Adjustment")
	public WebElement SpotProgramBudgetAdjustment;
	//Transaction History drop-down link
	@FindBy(linkText="Transaction History")
	public WebElement TransactionHistory;
	
	
	//Enter Dollar Amount input box
	public WebElement adjustmentPointsDollarAmount;
	//Select the Type of Adjustment drop-down box
	public WebElement adjustType;
	//Enter a Description textarea
	@FindBy(id="adjustmentDescription")
	public WebElement adjustmentDescription;
	//To input box
	public WebElement toParticipant;
	//submit button 1
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div/form/div[6]/div/button[1]")
	public WebElement submit1;
	//reset button 1
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div/form/div[6]/div/button[2]")
	public WebElement reset1;
	

	//transfer From input box
	public WebElement transferFrom;
	//transfer To input box
	public WebElement transferTo;
	//Enter Dollar Amount input box
	public WebElement transferPointsDollarAmount;
	//Enter a Description textarea
	public WebElement transferDescription;
	//submit button 2
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/form/div[5]/div/button[1]")
	public WebElement submit2;
	//reset button 2
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/form/div[5]/div/button[2]")
	public WebElement reset2;
	
	
	//Run Spot Budget Adjustment Report button
	@FindBy(linkText="Run Spot Budget Adjustment Report")
	public WebElement RunSpotBudgetAdjustmentReport;
	//Add Files button
	@FindBy(id="file-upload-input-")
	public WebElement AddFiles;
	//Start Upload button
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/form/div[1]/div/a")
	public WebElement StartUpload;
	//Cancel button
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/form/div[1]/div/button")
	public WebElement Cancel;
	//cancel Button
	public WebElement cancelButton;
	
	
	//Enter Dollar Amount input box
	public WebElement distributionPointsDollarAmount;
	//Select the Type of Adjustment drop-down box
	public WebElement distributionAdjustType;
	//Enter a Description textarea
	public WebElement distributionDescription;
	//submit button 3
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div/form/div[4]/div/button[1]")
	public WebElement submit3;
	//reset button 3
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div/form/div[4]/div/button[2]")
	public WebElement reset3;
	
	
	//Enter Dollar Amount input box
	public WebElement programBudgetAdjustmentDollarAmount;
	//Select the Type of Adjustment drop-down box
	public WebElement programBudgetAdjustmentAdjustType;
	//Enter a Description textarea
	public WebElement programBudgetAdjustmentDescription;
	//submit button 4
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div/form/div[4]/div/button[1]")
	public WebElement submit4;
	//reset button 4
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div/form/div[4]/div/button[2]")
	public WebElement reset4;
	
	
	//Show/Hide Export Filters link
	public WebElement showFiltersLink;
	//start Date input box
	public WebElement startDate;
	//end Date input box
	public WebElement endDate;
	//search By User Filter input box
	public WebElement searchByUserFilter;
	//Export button
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[6]/div[2]/div/div[1]/div[2]/form/div[3]/button")
	public WebElement Export;
	//CSV link
	@FindBy(linkText="CSV")
	public WebElement CSV;
	//HTML link
	@FindBy(linkText="HTML")
	public WebElement HTML;
	//PDF link
	@FindBy(linkText="PDF")
	public WebElement PDF;
	//reset button 5
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[6]/div[2]/div/div[1]/div[2]/form/button")
	public WebElement reset5;
	//Refresh button
	@FindBy(xpath="//div[2]/div[2]/div[2]/div[2]/div[6]/div[2]/div/div[2]/button")
	public WebElement Refresh;
	
	//Transaction History table - Transfer Information header
	@FindBy(xpath="//div[@id='spotTransactions']/table/thead/tr/th[5]")
	public WebElement transInfoHeader;
	
	//Transaction History table - Description header
	@FindBy(xpath="//div[@id='spotTransactions']/table/thead/tr/th[6]")
	public WebElement descHeader;
	//Transaction History table - Date & Time column
	@FindBy(xpath="//div[@id='spotTransactions']/table/tbody/tr/td[1]")
	public List<WebElement> dateTimeCol;
	//Transaction History table - Transfer Information column
	@FindBy(xpath="//div[@id='spotTransactions']/table/tbody/tr/td[5]")
	public List<WebElement> transInfoCol;
	//Transaction History table - Description column
	@FindBy(xpath="//div[@id='spotTransactions']/table/tbody/tr/td[6]")
	public List<WebElement> descCol;
}
