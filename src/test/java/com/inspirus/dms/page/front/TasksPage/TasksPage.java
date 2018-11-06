package com.inspirus.dms.page.front.TasksPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	
	//Constructor
	public TasksPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Tasks link
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/ul/li[1]/a")
	public WebElement Tasks;
	//Admin Tasks link
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/ul/li[2]/a")
	public WebElement AdminTasks;
	//Honors Tasks link
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/ul/li[3]/a")
	public WebElement HonorsTasks;
	//Search Tasks link
	@FindBy(linkText="Search Tasks")
	public WebElement SearchTasks;
	//Manager Tasks link
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/ul/li[1]/a")
	public WebElement ManagerTasks;
	
	//Manager Tasks First nomination Approve button
	@FindBy(xpath="//form[@id='nominationTaskForm0']/div[1]/div[1]/div[3]/div[3]/div[1]/a")
	public WebElement managerYes;
	@FindBy(linkText="Approve")
	public WebElement Approve;
	@FindBy (linkText="+ Value")
	public WebElement value;
	//Manager Tasks First Select Points button
	@FindBy(xpath="//div[@id='addValueDiv0']/div/button")
	public WebElement managerSelectPoints;
	//Tasks first nomination approve points
	@FindBy(xpath="//div[@id='rangeValueDiv0']/div/button")
	public WebElement managerApprovePoints;
	//Manager Tasks First nomination Yes level 1
	@FindBy(xpath="//div[@id='addValueDiv0']/div[1]/ul/li/a[@id='level1']/table[1]/tbody[1]/tr[2]/td")
	public WebElement managerYesLevel1;
	//Manager Tasks First nomination Yes level 2
	@FindBy(xpath="//div[@id='addValueDiv0']/div[1]/ul/li/a[@id='level2']/table[1]/tbody[1]/tr[2]/td")
	public WebElement managerYesLevel2;
	//Manager Tasks First nomination Yes level 3
	@FindBy(xpath="//div[@id='addValueDiv0']/div[1]/ul/li/a[@id='level3']/table[1]/tbody[1]/tr[2]/td")
	public WebElement managerYesLevel3;
	//Manager Tasks First nomination Yes Points Value
	@FindBy(xpath="//div[@id='addValueDiv0']/div[1]/ul[1]/li[1]/a/table/tbody/tr[2]/td")
	public WebElement managerYesPointsValue;
	//Manager Tasks First nomination Yes Comments Value
	@FindBy(id="adjustMessage0")
	public WebElement managerYesCommentsValue;
	//Manager Tasks First nomination Yes Cancel button
	@FindBy(xpath="//div[@id='adjustLevelDiv0']/span[1]/button[1]")
	public WebElement managerYesCancel;
	//Manager Tasks First nomination Yes Submit button
	@FindBy(xpath="//div[@id='adjustLevelDiv0']/span[1]/button[3]")
	public WebElement managerYesComplete;
	//Manager Tasks First nomination Yes Submit button - this apply to the ecard auto cc and the task go to the next approver
	@FindBy(xpath="//div[@id='adjustValueDiv0']/div/div/button[2]")
	public WebElement managerYesSubmit;
	//Manager Tasks First nomination Close button
	@FindBy(linkText="Close")//form[@id='nominationTaskForm0']/div/div/div[3]/div[3]/div[3]/a
	public WebElement close;
	//Manager Tasks First nomination No Comments Value
	@FindBy(id="dismissMessage0")
	public WebElement managerNoCommentsValue;
	//Manager Tasks First nomination No Cancel button
	@FindBy(xpath="//div[@id='dismissValueDiv0']/div[1]/div[1]/button[1]")
	public WebElement managerNoCancel;
	//Manager Tasks First nomination No Complete button
	@FindBy(xpath="//div[@id='dismissValueDiv0']/div[1]/div[1]/button[2]")
//	@FindBy(xpath="//button[@type='button'])[9]")
	public WebElement managerNoComplete;
	//Manager Tasks First nomination Elevate button
	@FindBy(linkText="Elevate")
	public WebElement managerElevate;
	//Manager Tasks First nomination elevate select level button
	@FindBy (xpath="//div[@id='elevateValueDiv0']/div[2]/div/button")
	public WebElement managerElevateSelectLevel;
	//Manager Tasks First nomination elevate select level button
	@FindBy (xpath="//div[@id='elevateValueDiv0']/div[2]/div/ul")
	public WebElement managerElevateLevelContent;	
	//Manager Tasks First nomination elevate select point point
	@FindBy (xpath="//div[@id='elevateLevelPoints0']/button")
	public WebElement managerElevateSelectPoint;
	//Manager Tasks First nomination elevate select point content
	@FindBy (xpath="//div[@id='elevateLevelPoints0']/ul")
	public WebElement managerElevatePointContent;
	//Manager Tasks First nomination elevate comments value
	@FindBy (id="adjustMessage0")
	public WebElement managerElevateCommentsValue;
	//Manager Tasks First nomination elevate Complete
	@FindBy (xpath="//div[@id='adjustLevelDiv0']/span/button[2]")
	public WebElement managerElevateComplete;
	//Manager Tasks Frist nomination elevate cancle
	@FindBy (xpath="//div[@id='adjustLevelDiv0']/span/button[1]")
	public WebElement managerElevateCancel;
	//Manager Tasks First nomination adjust pick a level button
	@FindBy (xpath="//div[@id='adjustValueDiv0']/div[1]/button")
	public WebElement managerAdjustLevel;
	//Manager Tasks First nomination adjust level 1
	@FindBy (xpath="//div[@id='adjustValueDiv0']/div[1]/ul[1]/li[1]/a")
	public WebElement managerAdjustLevel1;
	//Manager Tasks First nomination adjust level 2
	@FindBy (xpath="//div[@id='adjustValueDiv0']/div[1]/ul[1]/li[2]/a")
	public WebElement managerAdjustLevel2;
	//Manager Tasks First nomination adjust select points button
	@FindBy (xpath="//div[@id='adjustLevelPoints0']/button")
	public WebElement managerAdjustPoints;
	//Manager Tasks First nomination adjust select points1
	@FindBy (xpath="//div[@id='adjustLevelPoints0']/ul[1]/li[1]/a")
	public WebElement managerAdjustPoints1;

	
	
	//Tasks Approve button
	@FindBy(xpath="//form[@id='nominationTaskForm0']/div[1]/div[1]/div[3]/div[3]/div[1]/a")
	public WebElement adjustApprove;
	//Tasks adjust page approve then select points
	@FindBy (xpath="//span[@id='adjustApproveSelectionButton0']")
	public WebElement  adjustApprovePointSelection;
	//Tasks adjust page approve then select point, the drop down content
	@FindBy (xpath="//*[@id='adjustApproveValueDiv0']/div/ul")
	public WebElement adjustApprovePointContent;
	//points drop list
	@FindBy (xpath="//*[@id='adjustApproveValueDiv0']/div/ul/li")
	public List<WebElement> adjustApprovePointList;
	@FindBy (xpath="//button[@id='adjustLevelDivApprove0Btn']")
	public WebElement adjustApproveSubmit;
	//Tasks first nomination - if it is upon the highest level - approver Yes
	@FindBy(linkText="Adjust")
	public WebElement adjust;
	//Tasks first nomination - if it is upon the highest level - approver Yes and select level
	@FindBy (xpath="//div[@id='adjustValueDiv0']/div/button") 
	public WebElement adjustSelectLevel;
	//Manager Tasks First nomination adjust select level Content
	@FindBy (xpath="//div[@id='adjustValueDiv0']/div/ul")
	public WebElement adjustLevelContent;
	//Tasks first nomination - if it is upon the highest level - approver Yes and select point
	@FindBy (xpath="//div[@id='adjustLevelPoints0']/button")
	public WebElement adjustSelectPoint;
	//Manager Tasks First nomination adjust select point Content
	@FindBy (xpath="//div[@id='adjustLevelPoints0']/ul")
	public WebElement adjustPointContent;
	//Tasks first nomiation - if it is upon the highest level - approver Yes and point value drop down
	@FindBy (xpath="//div[@id='adjustLevelPoints0']/button")
	public WebElement adjustPointValue;
	//Tasks First nomination - if it's upon the highest level - adjust comments value
	@FindBy (id="adjustMessage0")
	public WebElement adjustCommentsValue;
	//Tasks First nomination adjust select submit
	@FindBy (xpath="//button[@id='adjustLevelDivPending0Btn']")
	public WebElement adjustSubmit;
	//Tasks First nomination adjust cancle
	@FindBy (xpath="//div[@id='adjustLevelDiv0']/span/button[1]")
	public WebElement adjustCancel;
	
	

	//Tasks first nomination - Sender's message
	@FindBy(css="blockquote")
	public WebElement sendersMessage;
}
