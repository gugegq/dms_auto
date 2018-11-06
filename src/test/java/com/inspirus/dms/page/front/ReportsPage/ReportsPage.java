package com.inspirus.dms.page.front.ReportsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	
	//Constructor
	public ReportsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	   //Report navigation link	    
	  //  @FindBy (xpath="//a[@href='/cng/reporting.frm?activePage=reporting']")	   
	//	public WebElement Reports;     
	    
	    //loading... dialog
	    @FindBy (xpath="//div[@id='wait-dialog']/div")
	    public WebElement Loading;
	    //Registrration Detail report link
	    @FindBy (xpath="//div[@id='collapseTabularInner']/div/a")
	    public WebElement RegistrationDetailReportLink;
	    //Registrration Detail report dialog: header name
	    @FindBy (xpath="//div[@id='registrationReportModal']/div[@class='modal-header']/h4")
	    public WebElement RegistrationReportDialogHeader;
	    //Registrration Detail report dialog: body
	    @FindBy (xpath="//div[@id='registrationReportModal']/div[@class='modal-body']")
	    public WebElement RegistrationReportDialogBody;
	    //Registrration Detail report dialog: ok button
	    @FindBy (xpath="//div[@id='registrationReportModal']/div[@class='modal-footer']/a")
	    public WebElement RegistrationReportDialogOkbutton;
	    
}
