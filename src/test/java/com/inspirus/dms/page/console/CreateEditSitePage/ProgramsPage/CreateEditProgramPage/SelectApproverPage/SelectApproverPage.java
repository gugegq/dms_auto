package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SelectApproverPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SelectApproverPage {
	
	//Constructor
	public SelectApproverPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Assign a single Super Approver radio
	@FindBy(xpath="//input[@value='SINGLE_APPROVER']")
	public WebElement SINGLE_APPROVER;
	//Assign Super Approvers by User Groups radio
	@FindBy(xpath="//input[@value='MULTIPLE_APPROVER_SELECT']")
	public WebElement MULTIPLE_APPROVER_SELECT;
	//Upload a Super Approver list for User Groups radio
	@FindBy(xpath="//input[@value='MULTIPLE_APPROVER_UPLOAD']")
	public WebElement MULTIPLE_APPROVER_UPLOAD;
	//single Approver Search Param
	public WebElement singleApproverSearchParam;
	//search Single Approver Search Param button
	public WebElement searchSingleApproverSearchParam;
	//Approver cancel icon
	@FindBy(xpath="//div[@id='singleApproverContainer']/span/i")
	public WebElement Approvercancelicon;
	
	//User Attribute Type drop-down box
	@FindBy(xpath="//div[@id='multipleApproverSelection']/div[1]/select")
	public WebElement UserAttributeType2;
	//multiple approver Search button
//	@FindAll({
//	    @FindBy(xpath = "//div[@id='superApproversContainer']/div[1]/append/div[2]/a"),
//	    @FindBy(xpath = "//div[@id='superApproversContainer']/div[2]/append/div[2]/a")
//	})
	@FindBy(xpath="//div[@id='superApproversContainer']/div/div/append/div[2]/a")
	public List<WebElement> multipleApproverSearchBtn;
	//multiple approver input
	@FindBy(id="multiApproverSearchParam")
	public WebElement multipleApproverInput;
	
	
	//User Attribute Type drop-down box
	@FindBy(xpath="//div[@id='approverUpload']/select")
	public WebElement UserAttributeType3;
	//pipe Delimited file check box
	public WebElement pipeDelimited;
	//Nomination Approver Template
	@FindBy(linkText="Nomination Approver Template")
	public WebElement NominationApproverTemplate;
	//Add file(s)... button
	public WebElement fileData;
	//Start Upload button
	@FindBy(xpath="//div[@id='uploadContainer']/div[1]/div/a/span")
	public WebElement StartUpload;
	//Cancel Upload button
	@FindBy(xpath="//div[@id='uploadContainer']/div[1]/div/button")
	public WebElement CancelUpload;
	
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
}
