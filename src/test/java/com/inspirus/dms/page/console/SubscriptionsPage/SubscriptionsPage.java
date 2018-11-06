package com.inspirus.dms.page.console.SubscriptionsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionsPage {
	
	//Constructor
	public SubscriptionsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//ADD Subscription button
	@FindBy(linkText="+ ADD Subscription")
	public WebElement addSubscription;
	//WebElement select
	public WebElement subscriptionType;
	//siteId select
	public WebElement siteId;
	//submit button to save AddSubscription
	public WebElement saveAddSubscription;
	//Cancel button to save AddSubscription
	@FindBy(linkText="Cancel")
	public WebElement Cancel;
	//close AddSubscription button
	public WebElement closeAddSubscription;
	//Yes button to Unsubscribe
	@FindBy(linkText="Yes")
	public WebElement Yes;
	//No button to Unsubscribe
	@FindBy(linkText="No")
	public WebElement No;
	//close Unsubscribe Cancel Modal button
	public WebElement closeUnsubscribeCancelModal;
}
