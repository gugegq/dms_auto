package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.ImagesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagesPage {
	
	//Constructor
	public ImagesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

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

	//Thanks drop-down link
	@FindBy(linkText="Thanks")
	public WebElement Thanks;
	//use all Thanks images check box
	@FindBy(id="selectUnSelectCategory_THANKS")
	public WebElement useAllThanksImages;
	//Occasions drop-down link
	@FindBy(linkText="Occasions")
	public WebElement Occasions;
	//use all Occasions images check box
	@FindBy(id="selectUnSelectCategory_OCCASIONS")
	public WebElement useAllOccasionsImages;
	//Birthday drop-down link
	@FindBy(linkText="Birthday")
	public WebElement Birthday;
	//use all Birthday images check box
	@FindBy(id="selectUnSelectCategory_BIRTHDAY")
	public WebElement useAllBirthdayImages;
	//Holidays drop-down link
	@FindBy(linkText="Holidays")
	public WebElement Holidays;
	//use all Holidays images check box
	@FindBy(id="selectUnSelectCategory_HOLIDAYS")
	public WebElement useAllHolidaysImages;
	//Our Company drop-down link
	@FindBy(linkText="Our Company")
	public WebElement OurCompany;
	//use all Our Company images check box
	@FindBy(id="selectUnSelectCategory_OUR_COMPANY")
	public WebElement useAllOurCompanyImages;
	//Anniversary drop-down link
	@FindBy(linkText="Anniversary")
	public WebElement Anniversary;
	//use all Anniversary images check box
	@FindBy(id="selectUnSelectCategory_ANNIVERSARY")
	public WebElement useAllAnniversaryImages;
	
	//Nomination Certificate drop-down link
	@FindBy(linkText="Nomination Certificate")
	public WebElement NominationCertificate;
	//use all NominationCertificate images check box
	@FindBy(id="selectUnSelectCategory_NOMINATION_CERTIFICATE")
	public WebElement useAllNominationCertificateImages;
	//Spot Certificate drop-down link
	@FindBy(linkText="Spot Certificate")
	public WebElement SpotCertificate;
	//use all Spot Certificate images check box
	@FindBy(id="selectUnSelectCategory_SPOT_CERTIFICATE")
	public WebElement useAllSpotCertificateImages;
	//Honors Certificate drop-down link
	@FindBy(linkText="Honors Certificate")
	public WebElement HonorsCertificate;
	//use all Honors Certificate images check box
	@FindBy(id="selectUnSelectCategory_HONORS_CERTIFICATE")
	public WebElement useAllHonorsCertificateImages;
	//Service Certificate drop-down link
	@FindBy(linkText="Service Certificate")
	public WebElement ServiceCertificate;
	//use all Service Certificate images check box
	@FindBy(id="selectUnSelectCategory_SERVICE_CERTIFICATE")
	public WebElement useAllServiceCertificateImages;
	
	//Badge drop-down link
	@FindBy(linkText="Badge")
	public WebElement Badge;
	//use all Badge images check box
	@FindBy(id="selectUnSelectCategory_BADGE")
	public WebElement useAllBadgeImages;
	
	//save cancel button
	public WebElement saveExit;
	public WebElement saveContinue;
	@FindBy(xpath="//a[@id='createEditSite']/button")
	public WebElement Cancel;
	
	//Kim Li added
	//TC6459,TC6462,TC6474,TC6489
	//"User All" Check box 
	@FindBy(xpath = "//div[@id='ecardAccordion']/div/div[2]/input")
	public WebElement UserAllBox;
	
	//"Image check box path" 
	@FindBy(xpath = "//div[@id='ecardAccordion']/div/div[3]/ul[1]/li[1]/div/div/p[2]/input")
	public WebElement ImagePathBox;
	
	
	//Category link page
	@FindBy(xpath = "//div[@id='ecardAccordion']/div/div[1]/a")
	public WebElement CategoryLink;
}
