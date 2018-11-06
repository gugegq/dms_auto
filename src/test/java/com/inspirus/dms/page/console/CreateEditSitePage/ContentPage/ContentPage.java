package com.inspirus.dms.page.console.CreateEditSitePage.ContentPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentPage {
	
	//Constructor
	public ContentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Compact button
	@FindBy(xpath="//div[@id='programContent']/div[1]/button[1]")
	public WebElement Compact;
	//Full button
	@FindBy(xpath="//div[@id='programContent']/div[1]/button[2]")
	public WebElement Full;
	//last icon
	@FindBy(xpath="//div[@id='programContent']/div[3]/a[1]/i")
	public WebElement last;
	//next icon
	@FindBy(xpath="//div[@id='programContent']/div[3]/a[2]/i")
	public WebElement next;
	//Add New News Item button
	@FindBy(linkText="Add New News Item")
	public WebElement AddNewNewsItem;
}
