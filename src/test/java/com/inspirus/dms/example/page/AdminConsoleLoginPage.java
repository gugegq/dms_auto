package com.inspirus.dms.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.thoughtworks.selenium.Selenium;

public class AdminConsoleLoginPage {
	public WebDriver driver;
	public Selenium selenium;
	
	//Login Account input box
	public WebElement username;
	//Password input box
	public WebElement password;
	//Login Button
	public WebElement loginButton;
	//Username's label
	@FindBy (xpath="//@id='usernameControlGroup'/div[1]")
	public WebElement label_Username;
	
	//Construction function
	public AdminConsoleLoginPage (WebDriver driver, Selenium selenium) {
		this.driver = driver;
		this.selenium = selenium;
		PageFactory.initElements(driver, this);
	}
	
	//Login console
	public void Login (String url, String login_name, String login_password){
		driver.get(url);
		selenium.waitForPageToLoad("30000");
		username.sendKeys(login_name);
		password.sendKeys(login_password);
		loginButton.click();
		selenium.waitForPageToLoad("30000");
	}
}
