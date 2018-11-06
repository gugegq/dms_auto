package com.inspirus.dms.page.console.CreateEditSitePage.ContentPage.NewsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewNewsPage {
	
	//Constructor
	public ViewNewsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Back button
	@FindBy(linkText="Back")
	public WebElement Back;
}
