package com.inspirus.dms.page.console.CreateEditSitePage.SiteAssetsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteAssetsPage {
	
	//Constructor
	public SiteAssetsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Menu Background input box
	public WebElement siteColor1;
	//Menu Highlight input box
	public WebElement siteColor2;
	//SMenu Text Color input box
	public WebElement fontColor1;
	//Site Text Color input box
	public WebElement fontColor2;
	//Link Color input box
	public WebElement hyperlinkColor;
	//fontFamily1 radio
	@FindBy(id="siteAsset.fontFamily1")
	public WebElement fontFamily1;
	//fontFamily2 radio
	@FindBy(id="siteAsset.fontFamily2")
	public WebElement fontFamily2;
	//fontFamily3 radio
	@FindBy(id="siteAsset.fontFamily3")
	public WebElement fontFamily3;
	//fontFamily4 radio
	@FindBy(id="siteAsset.fontFamily4")
	public WebElement fontFamily4;
	//fontFamily5 radio
	@FindBy(id="siteAsset.fontFamily5")
	public WebElement fontFamily5;
	//fontFamily6 radio
	@FindBy(id="siteAsset.fontFamily6")
	public WebElement fontFamily6;
	//save cancle button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	public WebElement SaveSite;
	
	//Site Logo AddFile button
	@FindBy(id="file-upload-input-dropzone")
	public WebElement SiteLogoAddFile;
	//Site Logo Start Upload
	@FindBy(xpath="//form[@id='siteLogoUploadForm']/div[1]/div/a/span")
	public WebElement SiteLogoStartUpload;
	//Site Logo Cancel Upload
	@FindBy(xpath="//fieldset/div/div[1]/div/form/div[1]/div/button")
	public WebElement SiteLogoCancelUpload;
	//Site Logo Cancel Upload
	@FindBy(xpath="//fieldset/div/div[1]/div/form/div[3]/table/tbody/tr/td[7]/button")
	public WebElement SiteLogoCancelButton;
	//Site Logo Delete button
	@FindBy(xpath="//fieldset/div/div[1]/div/div/ul/li/button")
	public WebElement SiteLogoDelete;
	//Site Logo Success Upload Message
	@FindBy(xpath="//div[@id='dropzone']/table/tbody/tr/td[5]")
	public WebElement SiteLogoSuccessMessage;
	//Site Logo Description
	@FindBy(id="fileDesc")
	public WebElement SiteLogoDescription;
	
	//Certificate Logo AddFile button
	@FindBy(id="file-upload-input-dropzone2")
	public WebElement CertificateLogoAddFile;
	//Certificate Logo Start Upload
	@FindBy(xpath="//form[@id='certLogoUploadForm']/div[1]/div/a/span")
	public WebElement CertificateLogoStartUpload;
	//Certificate Logo Cancel Upload
	@FindBy(xpath="//fieldset/div/div[2]/div/form/div[1]/div/button")
	public WebElement CertificateLogoCancelUpload;
	//Certificate Logo Cancel Upload
	@FindBy(xpath="//fieldset/div/div[2]/div/form/div[3]/table/tbody/tr/td[7]/button")
	public WebElement CertificateLogoCancelButton;
	//Certificate Logo Delete button
	@FindBy(xpath="//fieldset/div/div[2]/div/div/ul/li/button")
	public WebElement CertificateLogoDelete;
	//Certificate Logo Success Upload Message
	@FindBy(xpath="//div[@id='dropzone2']/table/tbody/tr/td[5]")
	public WebElement CertificateLogoSuccessMessage;
	
	//Log In Page Image AddFile button
	@FindBy(id="file-upload-input-dropzone3")
	public WebElement LogInImageAddFile;
	//Log In Page Image Start Upload
	@FindBy(xpath="//form[@id='loginPageImageUploadForm']/div[1]/div/a/span")
	public WebElement LogInImageStartUpload;
	//Log In Page Image Cancel Upload
	@FindBy(xpath="//fieldset/div/div[3]/div/form/div[1]/div/a")
	public WebElement LogInImageCancelUpload;
	//Log In Page Image Cancel Upload
	@FindBy(xpath="//fieldset/div/div[3]/div/form/div[3]/table/tbody/tr/td[7]/button")
	public WebElement LogInImageCancelButton;
	//Log In Page Image Delete button
	@FindBy(xpath="//fieldset/div/div[3]/div/div/ul/li/button")
	public WebElement LogInImageDelete;
	//Log In Page Image Success Upload Message
	@FindBy(xpath="//div[@id='dropzone3']/table/tbody/tr/td[5]")
	public WebElement LogInImageSuccessMessage;
	
	//Mobile Desktop Icon AddFile button
	@FindBy(id="file-upload-input-dropzone4")
	public WebElement MobileIconAddFile;
	//Mobile Desktop Icon Start Upload
	@FindBy(xpath="//form[@id='mobileIconUploadForm']/div[1]/div/a/span")
	public WebElement MobileIconStartUpload;
	//Mobile Desktop Icon Cancel Upload
	@FindBy(xpath="//fieldset/div/div[4]/div/form/div[1]/div/a")
	public WebElement MobileIconCancelUpload;
	//Mobile Desktop Icon Cancel Upload
	@FindBy(xpath="//fieldset/div/div[4]/div/form/div[3]/table/tbody/tr/td[7]/button")
	public WebElement MobileIconCancelButton;
	//Mobile Desktop Icon Delete button
	@FindBy(xpath="//fieldset/div/div[4]/div/div/ul/li/button")
	public WebElement MobileIconDelete;
	//Mobile Desktop Icon Success Upload Message
	@FindBy(xpath="//div[@id='dropzone4']/table/tbody/tr/td[5]")
	public WebElement MobileIconSuccessMessage;
}
