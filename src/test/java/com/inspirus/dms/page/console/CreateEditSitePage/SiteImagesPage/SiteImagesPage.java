package com.inspirus.dms.page.console.CreateEditSitePage.SiteImagesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteImagesPage {
	
	//Constructor
	public SiteImagesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//image Type drop-down box
	public WebElement imageType;
	//image Category drop-down box
	public WebElement imageCategory;
	//Add File Button
	@FindBy(id="file-upload-input-")
	public WebElement AddFile;
	//Start Upload button
	@FindBy(linkText="Start Upload")
	public WebElement StartUpload;
	//CancelAll button
	@FindBy(xpath="//fieldset/div[1]/div[2]/div[2]/div[1]/div[1]/div/button")
	public WebElement CancelAll;
	
	//Thanks
	@FindBy(linkText="Thanks")
	public WebElement Thanks;
	//Occasions
	@FindBy(linkText="Occasions")
	public WebElement Occasions;
	//Birthday
	@FindBy(linkText="Birthday")
	public WebElement Birthday;
	//Holidays
	@FindBy(linkText="Holidays")
	public WebElement Holidays;
	//Our Company
	@FindBy(linkText="Our Company")
	public WebElement OurCompany;
	//Anniversary
	@FindBy(linkText="Anniversary")
	public WebElement Anniversary;
	//Nomination Certificate
	@FindBy(linkText="Nomination Certificate")
	public WebElement NominationCertificate;
	//Spot Certificate
	@FindBy(linkText="Spot Certificate")
	public WebElement SpotCertificate;
	//Honors Certificate
	@FindBy(linkText="Honors Certificate")
	public WebElement HonorsCertificate;
	//Service Certificate
	@FindBy(linkText="Service Certificate")
	public WebElement ServiceCertificate;
	//Badge
	@FindBy(linkText="Badge")
	public WebElement Badge;
	//Program Icon
	@FindBy(linkText="Program Icon")
	public WebElement ProgramIcon;
	
}
