package com.inspirus.dms.page.console.MaintenancePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenancePage {

	//Constructor
	public MaintenancePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Schedule Maintenance button
	@FindBy(linkText="Schedule Maintenance")
	public WebElement scheduleMaintenance;
	
	//The Description of Schedule Maintenance links
	@FindBy(xpath="//tr/td[2]/a")
	private List<WebElement> ScheduleMaintenanceDescriptionS;
	//click a Maintenance's Description link
	public void chooseMaintenanceToEdit(String Description,WebDriver driver){
		PageFactory.initElements(driver, MaintenancePage.class);
		for (WebElement Des : ScheduleMaintenanceDescriptionS){
			if (Des.getText().equals(Description)){
				Des.click();
				break;
			}
		}
	}
}
