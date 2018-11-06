package com.inspirus.dms.page.console.CreateEditSitePage.UserAttributesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAttributesPage {

	//Constructor
	public UserAttributesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//BusinessUnit input box
	public WebElement clientFieldLabelBusinessUnit;
	//BusinessUnit checkbox
	public WebElement enableBusinessUnit;
	//BusinessUnit calendarFilter checkbox
	public WebElement calendarFilterBusinessUnit;
	//Department input box
	public WebElement clientFieldLabelDepartment;
	//Department checkbox
	public WebElement enableDepartment;
	//Department calendarFilter checkbox
	public WebElement calendarFilterDepartment;
	//Division input box
	public WebElement clientFieldLabelDivision;
	//Division checkbox
	public WebElement enableDivision;
	//Division calendarFilter checkbox
	public WebElement calendarFilterDivision;
	//GLCode input box
	public WebElement clientFieldLabelGLCode;
	//GLCode checkbox
	public WebElement enableGLCode;
	//GLCode calendarFilter checkbox
	public WebElement calendarFilterGLCode;
	//Location input box
	public WebElement clientFieldLabelLocation;
	//Location checkbox
	public WebElement enableLocation;
	//Location calendarFilter checkbox
	public WebElement calendarFilterLocation;
	//Region input box
	public WebElement clientFieldLabelRegion;
	//Region checkbox
	public WebElement enableRegion;
	//Region calendarFilter checkbox
	public WebElement calendarFilterRegion;
	//leLevel input box
	public WebElement clientFieldLabelLevel;
	//leLevel checkbox
	public WebElement enableLevel;
	//leLevel calendarFilter checkbox
	public WebElement calendarFilterLevel;
	//Function input box
	public WebElement clientFieldLabelFunction;
	//Function checkbox
	public WebElement enableFunction;
	//Function calendarFilter checkbox
	public WebElement calendarFilterFunction;
	//Station input box
	public WebElement clientFieldLabelStation;
	//Station checkbox
	public WebElement enableStation;
	//Station calendarFilter checkbox
	public WebElement calendarFilterStation;
	//Area input box
	public WebElement clientFieldLabelArea;
	//Area checkbox
	public WebElement enableArea;
	//Area calendarFilter checkbox
	public WebElement calendarFilterArea;
	//VBU1 input box
	public WebElement clientFieldLabelVBU1;
	//VBU1 checkbox
	public WebElement enableVBU1;
	//VBU1 calendarFilter checkbox
	public WebElement calendarFilterVBU1;
	//VBU2 input box
	public WebElement clientFieldLabelVBU2;
	//VBU2 checkbox
	public WebElement enableVBU2;
	//VBU2 calendarFilter checkbox
	public WebElement calendarFilterVBU2;
	//VBU3 input box
	public WebElement clientFieldLabelVBU3;
	//VBU3 checkbox
	public WebElement enableVBU3;
	//VBU3 calendarFilter checkbox
	public WebElement calendarFilterVBU3;
	//save cancle button
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	//@FindBy(xpath = "[@id='siteUserAttributesForm']/div[2]/button")
	@FindBy(xpath="//form[@id='siteUserAttributesForm']/div[2]/button")
	public WebElement SaveSite;
}
