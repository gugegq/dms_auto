package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.SetupRulesPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WellBeingSetupRulesPage {
	
	//Constructor
	public WellBeingSetupRulesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/button")
	public WebElement mapNewProgram;
	
	@FindBy(id="mappingLifeDojoDescription")
	public WebElement mappingDescription;
	
	@FindBy (xpath="//form[@id='lifeDojoLevelForm']/div[2]/div[2]/div/input[1]")
	public List <WebElement> levels;
	
	@FindBy(xpath="//div[@id='lifeDojoLevelModal']/div[3]/a[1]")
	public WebElement mappingSubmit;
	
	@FindBy(xpath="//div[@id='lifeDojoLevelModal']/div[3]/a[2]")
	public WebElement mappingCancel;
	
	@FindBy(xpath="//form[@id='lifeDojoSetupRulesForm']/div[2]/div/div/div[1]/input[4]")
	public List<WebElement> awardLevels;
	
	@FindBy(xpath="//form[@id='lifeDojoSetupRulesForm']/div[2]/div/div/div[2]/div[1]/input")
	public List<WebElement> awardDollar;
	
	@FindBy(xpath="//form[@id='lifeDojoSetupRulesForm']/div[2]/div[1]/div/a")
	public WebElement mapNewLevel;
	
	@FindBy(id="saveContinue")
	public WebElement saveContinue;
	
	@FindBy(id="saveExit")
	public WebElement saveExit;
	
	//Mapping error message
	@FindBy(id="lifeDojoMappingMessage")
	public WebElement errorMsg;
	
}
