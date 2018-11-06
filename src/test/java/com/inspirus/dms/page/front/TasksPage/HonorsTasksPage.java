package com.inspirus.dms.page.front.TasksPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inspirus.dms.basic.controllers.ActionDriverHelper;

import static org.junit.Assert.*;

public class HonorsTasksPage extends TasksTabInTopNavigation{
	
	//Constructor
	public HonorsTasksPage(WebDriver driver){
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	
	// submit to get result
	@FindBy(css = "button.btn.btn-primary")
	public WebElement submit;
	// Export button
	@FindBy(css = "button.btn.dropdown-toggle")
	public WebElement Export;
	// export as html
	@FindBy(linkText = ".HTML")
	public WebElement html;

	// Create a Winner's Circle drop-down link
	@FindBy(linkText = "Create a Winner's Circle")
	public WebElement CreateWinnerCircle;
	// rates drop-down box
	public WebElement rates;
	// nomination Start Date input box
	public WebElement nominationStartDate;
	// nomination End Date input box
	public WebElement nominationEndDate;

	// Upload Winner's List button
	@FindBy(linkText = "Upload Winner's List")
	public WebElement UploadWinnerList;
	// pipe Delimited file check box
	public WebElement pipeDelimited;
	// Add Files button
	@FindBy(id = "file-upload-input-")
	public WebElement AddFiles;
	// Start Upload button
	@FindBy(xpath = "//div[@id='uploadUsersField']/div/div/div/a/span")
	public WebElement StartUpload;
	// Cancel All button
	@FindBy(xpath = "//button[@type='reset']")
	public WebElement CancelAll;
	// close Upload Winner's List button
	@FindBy(xpath = "//div[@id='uploadWinnerForm']/div[1]/button")
	public WebElement close;
	// Cancel button
	@FindBy(linkText = "Cancel")
	public WebElement Cancel;

	// search criterias
	// Task Status field
	@FindBy(id = "taskStatus")
	public WebElement taskStatus;
	// programs field
	@FindBy(id = "programs")
	public WebElement programs;
	// By receiver field
	@FindBy(id = "searchNominee")
	public WebElement searchNominee;
	// By sender field
	@FindBy(id = "searchNominator")
	public WebElement searchNominator;
	
	// search result of users
	@FindBy(xpath = "//li[@class='ui-menu-item']/a")
	public WebElement userList;
	// submit button
	@FindBy(css = "button.btn.btn-primary")
	public WebElement searchSubmit;

	// winner List link cells
	@FindBy(xpath = "//div[@id='workflowTasks']/table/tbody/tr/td[3]")
	public List<WebElement> linkCellsInWinnerList;

	// expanded task section
	// yes button
	@FindBy(linkText = "Yes")
	public WebElement yesButtonForTask;
	// no button
	@FindBy(linkText = "No")
	public WebElement noButtonForTask;

	// honor task table
	// the rows that listed in the honor task table
	@FindBy(xpath = "//table[@id='honorsTasksTable']/tbody/tr")
	public List<WebElement> rowsInHonorTaskTable;
	// honor task table receivers link
	@FindBy(xpath="//div[@id='workflowTasks']/table/tbody/tr/td[3]/a")
	public List<WebElement> honorReceiversLinks;

	public WebDriver driver;
	public JavascriptExecutor jse;

//	public HonorsTasksPage(WebDriver driver) {
//		super(driver);
//		this.driver = driver;
//		jse = (JavascriptExecutor) driver;
//	}

	public void initializeHonorTaskPage() {
		PageFactory.initElements(driver, this);
	}

	// set search criteria: task status
	public void setSearchCriteria_TaskStatus(String Name) {
		try {
			new Select(taskStatus).selectByVisibleText(Name);
		} catch (NoSuchElementException e) {
			fail("The task status field is not existed!");
		}
	}

	// set search criteria: program
	public void setSearchCriteria_Program(String Name) {
		try {
			new Select(programs).selectByVisibleText(Name);
		} catch (NoSuchElementException e) {
			fail("The programs field is not existed!");
		}
	}

	// set search criteria: by receiver
	public void setSearchCriteria_ByReceiver(String Name) throws Exception {
		try {
			searchNominee.clear();
			searchNominee.sendKeys(Name);
			Thread.sleep(1000);
			//if (userList.isDisplayed()){
			//	userList.click();
			//    Thread.sleep(1000);
			//}
			ActionDriverHelper.selectOption(driver, 1, 500, 2000);
		} catch (NoSuchElementException e) {
			fail("The searchNomiee field is not existed!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// click on search submit button
	public void clickSubmitOnSearch() {
		try {
			searchSubmit.click();
		} catch (NoSuchElementException e) {
			fail("The submit button is not existed in the search section!");
		}
	}
	
	// by link name to expand the task that listed in the winner list table
	public void clickOnTheLinkForIndividualTaskInWinnerList(String Name) {
		try {
			if (linkCellsInWinnerList.size() >= 1) {
				
				System.out.println("link num:" + linkCellsInWinnerList.size());

				Boolean flag = false;
				for (WebElement cell : linkCellsInWinnerList) {
					System.out.println("in winner list: link name = " + cell.getText());
					if (cell.getText().contains(Name) && !cell.getText().contains("(Team Leader)")) {
						flag = true;
						cell.findElement(By.tagName("a")).click();
						this.scrollToView(cell);
						break;
					}
				}
				if (flag == false) {
					fail("In winner list, the link: " + Name + " is not existed!");
				}

			} else
				fail("No search result returned in the winner list, when name = " + Name);
		} catch (NoSuchElementException e) {
			fail("The winner list element is not existed!");
		}
	}

	// by link name to expand the task that listed in the winner list table
	public void clickOnTheLinkForTeamTaskInWinnerList(String Name) throws InterruptedException {
		try {
			if (linkCellsInWinnerList.size() >= 1) {

				Boolean flag = false;
				for (WebElement cell : linkCellsInWinnerList) {
					System.out.println("in winner list: link name = " + cell.getText());
					if (cell.getText().contains(Name) && cell.getText().contains("(Team Leader)")) {
						flag = true;
						cell.findElement(By.tagName("a")).click();
						this.scrollToView(cell);
						break;
					}
				}
				if (flag == false) {
					fail("In winner list, the link: " + Name + " (Team Leader) is not existed!");
				}

			} else
				fail("No search result returned in the winner list, when leader name = " + Name);
		} catch (NoSuchElementException e) {
			fail("The winner list element is not existed!");
		}
	}
	
	

	// verify the yes button is existed in the expanded section for a task
	public Boolean isYesButtonDisplayedInExpandedSection() {
		try {
			//this.scrollToView(yesButtonForTask);
			if (yesButtonForTask.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// verify the no button is existed in the expanded section for a task
	public Boolean isNoButtonDisplayedInExpandedSection() {
		try {
			//this.scrollToView(noButtonForTask);
			if (noButtonForTask.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// get cells for special program and column
	public Boolean isThisTaskExistedInHonorTask(String programName,
			String receiverName) {
		try {
			int count = rowsInHonorTaskTable.size();
			Boolean flag = false;
			if (count >= 1) {
				for (int i = 1; i < count; i += 2) {
					String program = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[1]")).getText();
					String receiver = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[3]")).getText();
					if (program.equals(programName)
							&& receiver.contains(receiverName)) {
						flag = true;
					}
				}
				return flag;
			} else {
				fail("No data rows are listed in the honor task table!");
				return null;
			}
		} catch (NoSuchElementException e) {
			fail("honor task table is not existed!");
			return null;
		}
	}

	// in honor task section, get cells for special program and column
	public Boolean isThisTeamTaskExistedInHonorTask(String programName,
			String receiverName) {
		try {
			int count = rowsInHonorTaskTable.size();
			Boolean flag = false;
			if (count >= 1) {
				for (int i = 1; i < count; i += 2) {
					String program = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[1]")).getText();
					String receiver = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[3]")).getText();
					if (program.equals(programName)
							&& receiver.contains(receiverName) && receiver.contains("(Team Leader)")) {
						flag = true;
					}
				}
				return flag;
			} else {
				fail("No data rows are listed in the honor task table!");
				return null;
			}
		} catch (NoSuchElementException e) {
			fail("honor task table is not existed!");
			return null;
		}
	}
	
	// in honor task section, expand the task for special program and receiver
	public void clickOnReceiverLinkForSpecialPorgramInHonorTask(
			String programName, String receiverName) {
		try {
			Boolean flag = false;
			int count = rowsInHonorTaskTable.size();
			if (count >= 1) {
				for (int i = 1; i < count; i += 2) {
					String program = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[1]")).getText();
					WebElement link = rowsInHonorTaskTable.get(i - 1)
							.findElement(By.xpath("//td[3]/a"));
					if (program.equals(programName)
							&& link.getText().contains(receiverName)) {
						this.scrollToView(link);
						link.click();
						flag = true;
						break;
					}
				}
				if (flag == false)
					fail("No task is matched on the program name: "
							+ programName + " and receiver name: "
							+ receiverName);
			} else
				fail("No data rows are listed in the honor task table!");
		} catch (NoSuchElementException e) {
			fail("honor task table is not existed!");
		}
	}

	// scroll to view
	private void scrollToView(WebElement element) {
		try{
			jse.executeScript("arguments[0].scrollIntoView()", element);
		}catch(NoSuchElementException e){
			fail ("The element does not exist, scroll into view failed!");
		}
	}
	
	
	// in winner list section, get cells for special column
		public Boolean isThisTeamTaskExistedInWinnerList(String receiverName) {
			try {
				if (linkCellsInWinnerList.size() >= 1) {

					Boolean flag = false;
					for (WebElement cell : linkCellsInWinnerList) {
						System.out.println("in winner list: link name = " + cell.getText());
						if (cell.getText().contains(receiverName) && cell.getText().contains("(Team Leader)")) {
							flag=true;
							break;
						}
					}
					return flag;

				} else
					return false;
			} catch (NoSuchElementException e) {
				fail("The winner list element is not existed!");
			}
			return null;
		}
		
}
