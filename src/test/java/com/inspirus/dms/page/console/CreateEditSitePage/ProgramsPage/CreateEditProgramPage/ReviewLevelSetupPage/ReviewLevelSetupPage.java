package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ReviewLevelSetupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewLevelSetupPage {
	
	//Constructor
	public ReviewLevelSetupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//addReviewLevel
	public WebElement addReviewLevel;
	
	//Send E-Card Upon Nomination check box
	public WebElement sendEcardUponNomination;
	
	//Team nomination switch
	public WebElement allowTeamNominations;
	
	//Upload Images link
	@FindBy(linkText="Upload Images")
	public WebElement UploadImages;
	//image Type drop-down box
	public WebElement imageType;
	//image Category drop-down box
	public WebElement imageCategory;
	//AddFiles button
	@FindBy(id="file-upload-input-")
	public WebElement AddFiles;
	//StartUpload button
	@FindBy(xpath="//div[@id='imageUploadDiv']/div/div[1]/div/a/span")
	public WebElement StartUpload;
	//CancelAll button
	@FindBy(xpath="//div[@id='imageUploadDiv']/div/div[1]/div/button")
	public WebElement CancelAll;
	//close icon button
	@FindBy(xpath="//div[@id='uploadImagesForm']/div[1]/button")
	public WebElement closeUploadwindow;
	
	//Ecard Images drop-down link
	@FindBy(linkText="Ecard Images")
	public WebElement EcardImages;
	//Certificate Images (Optional) drop-down link
	@FindBy(linkText="Certificate Images (Optional)")
	public WebElement CertificateImages;
	
	//select Ecard images
	public WebElement selectEcards;
	//select Ecard images submit button
	public WebElement saveHonorsAwardLevelEcards;
	//select Ecard images cancel button
	@FindBy(xpath="//div[@id='selectImagesModal']/div[3]/button[1]")
	public WebElement cancel1;
	//select Certificate images
	public WebElement selectCertificate;
	//select Certificate images submit button
	public WebElement saveHonorsAwardLevelCertificate;
	//select Ecard images cancel button
	@FindBy(xpath="//div[@id='selectCertificateModal']/div[3]/button[1]")
	public WebElement cancel2;
	
	//level Name input box
	public WebElement levelName;
	//Notify drop-down box
	public WebElement sendEcardUponNominationChoice;
	
	//Reviewer Type drop-down box
	@FindBy(id="approvalLevelTypeHonor")
	public WebElement approvalLevelTypeHonor;
	//Review Type drop-down button
	public WebElement chevronReviewType;
	
	//Search Super Approver radio
	public WebElement searchApproverId;
	//Upload Super Approver radio
	public WebElement uploadApproverId;
	
	//Select a User Attribute Type drop-down box
	public WebElement attributeType;
	//superApprover User Search input box
	public WebElement superApproverUserSearch;
	//Add Approver cancel button
	@FindBy(xpath="//div[@id='searchApproverModal']/div[3]/button[1]")
	public WebElement cancelAddApprover;
	//Add Approver submit button
	public WebElement saveApprovers;
	
	//Upload Super Approvers drop-down link
	@FindBy(linkText="Upload Super Approvers")
	public WebElement UploadSuperApprovers;
	//Pipe Delimited File check box
	public WebElement pipeDelimited;
	//Honor Approver Template download link
	@FindBy(linkText="Honor Approver Template")
	public WebElement HonorApproverTemplate;
	//AddFiles button to Upload Honor Approvers
	@FindBy(id="file-upload-input-dropzone2")
	public WebElement AddFiles2;
	//StartUpload button to Upload Honor Approvers
	@FindBy(xpath="//div[@id='uploadSuperApproverField']/div[1]/div/a/span")
	public WebElement StartUpload2;
	//CancelAll button to Upload Honor Approvers
	@FindBy(xpath="//div[@id='uploadSuperApproverField']/div[1]/div/button/span")
	public WebElement CancelAll2;
	
	//Assign a Committee search input box
	@FindBy(id="approverUserSearch")
	public WebElement approverUserSearch;
	
	// Choose an approver drop-down box
	public WebElement approvalAdmin;
	
	//Add Review Level button
	public WebElement saveReviewLevel;
	//close icon button
	@FindBy(xpath="//div[@id='addReviewLevelModal']/div[1]/button")
	public WebElement closeAddReviewwindow;

	
	
	//add Nomination Period button
	public WebElement addNominationPeriod;
	//event Type
	public WebElement eventType;
	//Period Description 0
	public WebElement periodDescription0;
	//delete Nom Period 0
	public WebElement deleteNomPeriod0;
	//honorsStartDate0
	public WebElement honorsStartDate0;
	//honorsEndDate0
	public WebElement honorsEndDate0;
	//reviewStartDate0
	public WebElement reviewStartDate0;
	//reviewEndDate0
	public WebElement reviewEndDate0;
	
	//allowNominationsToRollover
	public WebElement allowNominationsToRollover;
	//allowHonoreesMultipleAwards
	public WebElement allowHonoreesMultipleAwards;
	
	//save and continue button
	public WebElement saveContinue;
}
