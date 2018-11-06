package com.inspirus.dms.page.front.MyAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBudgetTransactionsPage {
	
	//Constructor
	public MyBudgetTransactionsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Transfer Budget link
	@FindBy(linkText="Transfer Budget")
	public WebElement TransferBudget;
	//Program drop-down box
	public WebElement programId;
	//Points input box
	public WebElement transferPoints;
	//transfer To input box
	public WebElement transferTo;
	//Description textarea
	public WebElement transferDescription;
	//submit button
	@FindBy(xpath="//div[@id='collapseOne']//div[1]/div[7]/div[1]/button")
	public WebElement submit;
	//continue for confirm transfer
	@FindBy (xpath="//div[@id='confirmTransferModal']/div[3]/button[2]")
	public WebElement continueTransfer;
	//Show or Hide Export Filters link
	public WebElement showFiltersLink;
	//start Date input box
	public WebElement startDate;
	//end Date input box
	public WebElement endDate;
	//Program drop-down box
	public WebElement filterProgramId;
	//search By User Filter input box
	public WebElement searchByUserFilter;
	//Export button
	@FindBy(xpath="//div[4]/div/div/div[2]/div/div[2]/form/div[3]/button")
	public WebElement Export;
	//Reset button
	public WebElement resetBudget;
	//CSV link
	@FindBy(linkText="CSV")
	public WebElement CSV;
	//HTML link
	@FindBy(linkText="HTML")
	public WebElement HTML;
	//PDF link
	@FindBy(linkText="PDF")
	public WebElement PDF;
	//Summary view - Program column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[1]")
	public WebElement program;
	//Summary view - Transaction Type column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[2]")
	public WebElement transactionType;
	//Summary view - Date column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[3]")
	public WebElement date;
	//Summary view - Participant / EEID column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[4]")
	public WebElement participantEEID;
	//Summary view - Deposits column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[5]")
	public WebElement deposits;
	//Summary view - Withdrawals column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[6]")
	public WebElement withdrawals;
	//Summary view - Available Balance column name
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/thead/tr/th[7]")
	public WebElement availableBalance;
	//Summary View - Expand Summary icon
	@FindBy(xpath="//div[@id='spotBudgetTransactions']/table/tbody/tr[1]/td[1]/button")
	public WebElement expandSummaryIcon;
}
