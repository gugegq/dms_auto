package com.inspirus.dms.page.console.AdminsPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminsPage {
	
	public WebDriver driver;
	//Constructor
	public AdminsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//search input box
	public WebElement adminUserSearchParam;
	//search button
	public WebElement searchAdminUser;
	//add new user button
	public WebElement addUpdateAdmin;
	//view more button
	@FindBy(xpath="//div[2]/div/div[2]/a")
	public WebElement viewmore;
	
	//The users' links
	@FindBy(xpath="//tr/td[1]/a")
	private List<WebElement> users;
	//click a user
	public void chooseUserToEdit(String username,WebDriver driver){
		PageFactory.initElements(driver, AdminsPage.class);
		for (WebElement user : users){
			if (user.getText().equals(username)){
				user.click();
				break;
			}
		}
	}
	
}
