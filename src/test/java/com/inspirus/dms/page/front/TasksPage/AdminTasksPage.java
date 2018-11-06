package com.inspirus.dms.page.front.TasksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminTasksPage {
	//Constructor
	public AdminTasksPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Task Search Criteria drop-down link
	@FindBy(linkText="Task Search Criteria")
	public WebElement TaskSearchCriteria;
	
	//task Status multi-select box
	public WebElement taskStatus;
	//programs drop-down box
	public WebElement programs;
	//levels drop-down box
	public WebElement levels;
	//search by Manager input box
	public WebElement searchManager;
	//search by Receiver input box
	public WebElement searchNominee;
	//search by Sender input box
	public WebElement searchNominator;
	//search by start date field
	public WebElement nominationStartDateGroup;
	//search by end date field
	public WebElement nominationEndDateGroup;
	//search by start date picker
	@FindBy(id="adminTaskStartDate")
	public WebElement nominationStartDate;
	//search by end date picker
	@FindBy(id="adminTaskEndDate")
	public WebElement nominationEndDate;
	//Submit button
	@FindBy(xpath="//div[@id='taskSearch']/div/div[2]/div[2]/div[4]/button")
	public WebElement submit;
	//Error message
	public WebElement errorMessage;
	
	//reset button of the first task
	@FindBy(xpath="//table[@id='workflowTasksTable']/tbody/tr[2]/td/div/div[1]/p/button")
	public WebElement reset;
	//reset confirm button
	@FindBy(css="button.btn.btn-success")
	public WebElement resetConfirm;
	//elevate  first task
	@FindBy(linkText="Elevate")
	public WebElement elevate;
	//elevate level
	@FindBy(xpath="//form[@id='nominationTaskForm0']/div[5]/div[2]/button")
	public WebElement elevateLevel;
	//elevate points
	@FindBy(xpath="//div[@id='elevateLevelPoints0']/button")
	public WebElement elevatePoints;
	//elevate message
	@FindBy(id="adjustMessage0")
	public WebElement elevateMessage;
	//elevate submit
	@FindBy(xpath="//div[@id='adjustLevelDiv0']/div/span/button[2]")
	public WebElement elevateSubmit;
	//print cert link
	@FindBy(linkText="Print Certificate")
	public WebElement printCertLink;
	//image
	@FindBy(xpath="//table[@id='workflowTasksTable']/tbody/tr[2]/td/div/div[2]/div[2]/a/img")
	public WebElement image;
	//print icon
	@FindBy(xpath="//div[@id='viewCard']/div/div/a/img")
	public WebElement printIcon;
	//print pdf icon
	@FindBy(xpath="//div[@id='printCard']/a[1]/img")
	public WebElement printPdfIcon;
	//print html icon
	@FindBy(xpath="//div[@id='printCard']/a[2]/img")
	public WebElement printHtmlIcon;
	
	//select one level for elevate
	public void adminElevate(String level,String points,String message,WebDriver driver) throws InterruptedException{
//		AdminTasksPage.elevateLevel.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", this.elevateLevel);
		Thread.sleep(1000);
//		driver.findElement(By.linkText(level)).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.linkText(level)));
		Thread.sleep(1000);
//		AdminTasksPage.elevatePoints.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", this.elevatePoints);
		Thread.sleep(1000);
//		driver.findElement(By.linkText(points)).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.linkText(points)));
		Thread.sleep(1000);
		this.elevateMessage.sendKeys(message);
//		AdminTasksPage.elevateSubmit.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", this.elevateSubmit);
		Thread.sleep(5000);
	}
}
