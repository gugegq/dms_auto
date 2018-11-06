package com.inspirus.dms.page.console.ConsoleHomePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsoleHomePage extends ConsoleHeader {

	//Create A New Site button
	@FindBy(xpath="//div[@class='container']/div/div/div/button")
	public WebElement CreateNewSite;

	//The sites' links
	@FindBy(xpath="//tr/td[1]/a")
	private List<WebElement> sites;
	//click a site
	public void choosesiteToEdit(String sitesname,WebDriver driver){
		PageFactory.initElements(driver, ConsoleHomePage.class);
		for (WebElement site : sites){
			if (site.getText().equals(sitesname)){
				site.click();
				break;
			}
		}
	}
	
	//Constructor
	public ConsoleHomePage(WebDriver driver){
		super(driver);
	}
}
