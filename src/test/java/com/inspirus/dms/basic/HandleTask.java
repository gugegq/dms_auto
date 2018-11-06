package com.inspirus.dms.basic;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import com.inspirus.dms.basic.*;
import com.inspirus.dms.basic.controllers.*;
import com.inspirus.dms.page.front.*;
import com.inspirus.dms.page.front.LoginPage.FrontLoginPage;
import com.inspirus.dms.page.front.TasksPage.TasksPage;
import com.thoughtworks.selenium.Selenium;

import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//4.0 - UI Create Nomination - to the “Create” page
public class HandleTask {
	Selenium selenium;
	WebDriver driver;
	

//	public static void dropTasks(WebDriver driver) throws Exception{
//		while(ActionDriverHelper.isTextPresent(driver, "Would you like to")){
////		while(selenium.isTextPresent("")){
//			PageFactory.initElements(driver, TasksPage.class);
//			TasksPage.close.click();
//			Thread.sleep(1000);
//			if (ActionDriverHelper.isTextPresent(driver,"Would you like to send comments to the Initiator of this nomination, so that they may better recognize people in the future? (optional)")){
//				TasksPage.managerNoCommentsValue.sendKeys("clear the task page.");
//				TasksPage.managerNoComplete.click();
//			}
//			else{
//				TasksPage.managerNoComplete.click();
//			}		
//			Thread.sleep(3000);
//		}   
//	}
	
	public static void dropTasks(WebDriver driver) throws Exception{
		while(ActionDriverHelper.isTextShown(driver, "Would you like to")){
//		while(selenium.isTextPresent("Would you like to")){
//			PageFactory.initElements(driver, TasksPage.class);
			TasksPage tasksPage = new TasksPage(driver);
			tasksPage.close.click();
			Thread.sleep(5000);
			if (ActionDriverHelper.isTextShown(driver,"Would you like to send comments to the Initiator of this nomination, so that they may better recognize people in the future? (optional)")){
				tasksPage.managerNoCommentsValue.sendKeys("clear the task page.");
//				TasksPage.managerNoComplete.click();
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", tasksPage.managerNoComplete);
			}
			else{
//				TasksPage.managerNoComplete.click();
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", tasksPage.managerNoComplete);
			}		
			Thread.sleep(10000);
		}   
	}
	// approve for no value name	
	public static void approve(String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.Approve.click();
		tasksPage.managerApprovePoints.click();
		driver.findElement(By.linkText(point)).click();
		Thread.sleep(1000);
		tasksPage.managerYesCommentsValue.sendKeys(comments);
		tasksPage.managerYesComplete.click();
		Thread.sleep(10000);
	}
	// approve for  value name
	public static void approve(String valueName,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.Approve.click();
		tasksPage.managerApprovePoints.click();
		driver.findElement(By.linkText(valueName+" "+point)).click();
		Thread.sleep(1000);
		tasksPage.managerYesCommentsValue.sendKeys(comments);
		tasksPage.managerYesComplete.click();
		Thread.sleep(3000);
	}
	
//	public static void addValue(boolean teamOrNot,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
//		TasksPage.Approve.click();
//		TasksPage.managerApprovePoints.click();
//		driver.findElement(By.linkText(point)).click();
//		Thread.sleep(1000);
//		TasksPage.managerYesCommentsValue.sendKeys(comments);
//		TasksPage.managerYesComplete.click();
//		Thread.sleep(3000);
//	}
	

	public static void noValueAdd(String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.close.click();
		tasksPage.managerNoCommentsValue.sendKeys(comments);
		tasksPage.managerNoComplete.click();
		Thread.sleep(10000);
	}
	
	public static void elevate(String level,String valueName,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.managerElevate.click();
		tasksPage.managerElevateSelectLevel.click();
		driver.findElement(By.linkText(level)).click();
		Thread.sleep(2000);
		tasksPage.managerElevateSelectPoint.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(valueName+" "+point)).click();
		tasksPage.managerElevateCommentsValue.sendKeys(comments);
		tasksPage.managerElevateComplete.click();
		Thread.sleep(3000);
	}
	
	public static void elevate(String level,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.managerElevate.click();
		tasksPage.managerElevateSelectLevel.click();
		driver.findElement(By.linkText(level)).click();
		Thread.sleep(2000);
		tasksPage.managerElevateSelectPoint.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(point)).click();
		tasksPage.managerElevateCommentsValue.sendKeys(comments);
		tasksPage.managerElevateComplete.click();
		Thread.sleep(10000);
	}
	
	// approve for no value name	
	public static void adjustApprove(String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.Approve.click();
		tasksPage.adjustApprovePointSelection.click();
//		driver.findElement(By.linkText(point)).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.linkText(point)));
		Thread.sleep(1000);
		tasksPage.adjustCommentsValue.sendKeys(comments);
		tasksPage.adjustApproveSubmit.click();
		Thread.sleep(10000);
	}
	
	public static void adjust(String level,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.adjust.click();
		tasksPage.adjustSelectLevel.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(level)).click();
		Thread.sleep(2000);
		tasksPage.adjustSelectPoint.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(point)).click();
		Thread.sleep(1000);	
		tasksPage.adjustCommentsValue.sendKeys(comments);
		tasksPage.adjustSubmit.click();
		Thread.sleep(3000);
	}
	
	public static void adjust(String level,String valueName,String point,String comments,WebDriver driver) throws Exception{
//		PageFactory.initElements(driver, TasksPage.class);
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.adjust.click();
		tasksPage.adjustSelectLevel.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(level)).click();
		Thread.sleep(2000);
		tasksPage.adjustSelectPoint.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(valueName+" "+point)).click();
		Thread.sleep(1000);	
		tasksPage.adjustSubmit.click();
		Thread.sleep(3000);
	}

	
}
