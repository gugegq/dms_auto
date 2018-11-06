package com.inspirus.dms.page.front.MessagesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inspirus.dms.page.console.MessagesPage.MessagesPage;

public class FrontMessagesPage extends MessagesPage{
	
	//Constructor
	public FrontMessagesPage(WebDriver driver){
		super(driver);
	}

    //Messages navigation link	    
    // @FindBy (xpath="//a[@href='/cng/messageConsole.frm?activePage=messageConsole']")	   
	//public WebElement Messages;
    //Messages count
    @FindBy (xpath="//li/a/span[@id='newMessageCount']")
    public WebElement Messagescount;   
    
    //Mark All As Read button
    @FindBy (xpath="//div[@id='consoleMessages']/div/a/span")
    public WebElement MarkAllAsReadButton;
    
    //subject name of first line message
    @FindBy (xpath="//table[@id='consoleMessageTable']/tbody/tr[1]/td[4]/a")
    public WebElement FirstLineSubjectName;
    
    //
    @FindBy (xpath="//table[@id='consoleMessageTable']/tbody/tr[1]/td[4]/div[@class='messageContent']/div")
    public WebElement FirstLineMessageContents;
    
    //Here link
    @FindBy (xpath="//table[@id='consoleMessageTable']/tbody/tr[1]/td[4]/div/div/a")
    public WebElement herelink;
    
}
