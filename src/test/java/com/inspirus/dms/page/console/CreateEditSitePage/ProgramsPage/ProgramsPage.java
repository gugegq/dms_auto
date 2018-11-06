package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramsPage {
	
	//Constructor
	public ProgramsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//program Type drop-down box
	public WebElement programType;
	//programs titles
	@FindBy(xpath="//form[@id='manageProgramForm']/fieldset/legend")
	public WebElement programsTitle;
	//program Type drop-down box list
	@FindBy (xpath="//select[@id='programType']/option")
	public List<WebElement> programTypeList;
	//program Status Type drop-down box
	public WebElement programStatus;
	//program Status Type drop-down list
	@FindBy (xpath="//select[@id='programStatus']/option")
	public List<WebElement> programStatusList;
	//search by Program name input box
	public WebElement searchParam;
	//search button
	public WebElement searchProgram;
	//Create A New Program
	@FindBy(linkText="Create A New Program")
	public WebElement CreateNewProgram;
	
	//The first searched out upload program - upload button
	@FindBy(xpath="//div[@id='receivedProgramList']/ul/li/div[7]/div/a/span")
	public WebElement uploadButton;
	//pipe Delimited check box
	public WebElement pipeDelimited;
	//Point Template download button
	@FindBy(linkText="Point Template")
	public WebElement PointTemplate;
	//addFiles button
	@FindBy(id="file-upload-input-")
	public WebElement addFiles;
	//Start Upload button
	@FindBy(xpath="//form[@id='modalProgramPointsUploadForm']/div/div[1]/div/a")
	public WebElement StartUpload;
	//Start Upload button
	@FindBy(xpath="//button[@type='reset']")
	public WebElement Cancel;
	//cancel Button appeared after upload file error
	public WebElement cancelButton;
	//upload points button
	@FindBy (xpath="//div[@id='receivedProgramList']/ul/li[1]/div[7]/div/a/span")
	public WebElement uploadPoints;
	//x icon if upload modal
	@FindBy (xpath="//div[@id='uploadProgramPointsModal']/div/button")
	public WebElement x;
	//The programs' links
	@FindBy(xpath="//div[@id='receivedProgramList']/ul/li/div/div/a")
	private static List<WebElement> programs;
	//"Send Recognition with" Group newProgramName
	@FindBy(xpath="//div[@id='sentProgramList']/ul/li[1]/div[2]/div/a")
	public WebElement newProgramName;
	//click a program
	public void chooseprogramToEdit(String programname,WebDriver driver){
		PageFactory.initElements(driver, ProgramsPage.class);
		for (WebElement program : programs){
			if (program.getText().equals(programname)){
				program.click();
				break;
			}
		}
	}
	
}
