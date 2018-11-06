package com.inspirus.dms.page.front.TasksPage;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksTabInTopNavigation {
	
	//Constructor
	public TasksTabInTopNavigation(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;
	// the active task tab
    @FindBy(xpath="//body/div[@class='container']//ul/li[@class='active']")
    private WebElement activeTab;
    // get the task tabs
    @FindBy(xpath="//body/div[@class='container']//ul/li")
    private List<WebElement> taskTabs;
    
//    public TasksTabInTopNavigation(WebDriver driver){
//    	this.driver = driver;
//    }
    
	public Boolean isActiveTab(String tabName) {
		try{
			System.out.println("active tab: "+ activeTab.getText());
			if (activeTab.getText().contains(tabName)){
				return true;
			}else return false;
		}catch(NoSuchElementException e){
			fail("The activeTab element: " + tabName + " is not existed!");
			return null;
		}
	}
	
	public HonorsTasksPage gotoHonorTasksTab(){
		clickTabs("Honors Tasks");
		HonorsTasksPage honorTaskPage = new HonorsTasksPage(driver);
		PageFactory.initElements(driver, honorTaskPage);
		return honorTaskPage;
	}
	
	public void clickTabs(String tabName){
		try{
			for(WebElement tab : taskTabs){
				if (tab.getText().contains(tabName)){
					tab.click();
				}
			}
		}catch(NoSuchElementException e){
			fail("The element: taskTabs is not existed!");
		}
	}

}
