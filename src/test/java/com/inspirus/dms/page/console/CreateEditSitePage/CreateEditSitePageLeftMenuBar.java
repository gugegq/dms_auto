package com.inspirus.dms.page.console.CreateEditSitePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CreateEditSitePageLeftMenuBar {

	//General Info link
	@FindBy(linkText="General Info")
	public WebElement GeneralInfo;
	//Site Setup link
	@FindBy(linkText="Site Setup")
	public WebElement SiteSetup;
	//Site Assets link
	@FindBy(linkText="Site Assets")
	public WebElement SiteAssets;
	//Site Images link
	@FindBy(linkText="Site Images")
	public WebElement SiteImages;
	//User Rules link
	@FindBy(linkText="User Rules")
	public WebElement UserRules;
	//User Attributes link
	@FindBy(linkText="User Attributes")
	public WebElement UserAttributes;
	//Manage Users link
	@FindBy(linkText="Manage Users")
	public WebElement ManageUsers;
	//Programs link
	@FindBy(linkText="Programs")
	public WebElement Programs;
	//Content link
	@FindBy(linkText="Content")
	public WebElement Content;
	//Automation link
	@FindBys({
			@FindBy(className="nav-list"),
			@FindBy(linkText="Automation")}
			)
	public WebElement Automation;

	//Constructor
	public CreateEditSitePageLeftMenuBar(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
