package com.inspirus.dms.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementLocation {
	
	WebDriver driver;
	
	// Console -> Customer Search
	public WebElement cust_Search = driver.findElement(By.xpath("//a[contains(text(),'Customer Search')]"));
	// Customer -> Customer Search -> Customer ID
	@FindBy(name="ID")
	public WebElement cust_Id;	
	// Customer -> Customer Search -> Customer ID -> Search
	public WebElement cust_Id_Search = driver.findElement(By.xpath("/html/body/div[3]/table[2]/tbody/tr[4]/td[2]/table/tbody/tr/td/table[4]/tbody/tr[2]/td[2]/input[2]"));
	// Customer -> Customer Search -> Customer ID -> Search -> programs
	public WebElement programs = driver.findElement(By.xpath("//a[contains(text(),'Programs')]"));
	public WebElement programs_code = driver.findElement(By.xpath("//a[contains(text(),'1801')]"));
	// Customer -> Customer Search -> Customer ID -> programs -> communications
	public WebElement communications = driver.findElement(By.xpath("//a[contains(text(),'communication')]"));
	// Customer -> Customer Search -> Customer ID -> programs -> communications -> add
	public WebElement add_btn = driver.findElement(By.xpath("//a[contains(text(),'add')]"));
	// Customer -> Customer Search -> Customer ID -> programs -> communications -> add -> All Input Value
	
	// Select Drop Down Menu
	
	// Event-Type
	// Anniversary Reminder
	public WebElement anniversary_reminder = driver.findElement(By.xpath("//select[@id='type_id']//option[@value='5'])"));
	// Non Response Reminder
	public WebElement non_response_reminder = driver.findElement(By.xpath("//select[@id='type_id']//option[@value='1'])"));
	// Packet Confirmation
	public WebElement packet_confirmation = driver.findElement(By.xpath("//select[@id='type_id']//option[@value='3'])"));
	// Ship Notification
	public WebElement ship_notification = driver.findElement(By.xpath("//select[@id='type_id']//option[@value='4'])"));
	// Solicitation
	public WebElement solicitation = driver.findElement(By.xpath("//select[@id='type_id']//option[@value='2'])"));
	
	// Status
	// Active
	public WebElement active = driver.findElement(By.xpath("//select[@id='status']//option[@value='Active'])"));
	// Inactive
	public WebElement inactive = driver.findElement(By.xpath("//select[@id='status']//option[@value='Inactive'])"));
	
	// Timing
	public WebElement timing = driver.findElement(By.xpath("//input[@id='timing_days']"));
	// Before / After
	// Before
	public WebElement before = driver.findElement(By.xpath("//select[@id='timing_period']//option[@value='Before'])"));
	// After
	public WebElement after = driver.findElement(By.xpath("//select[@id='timing_period']//option[@value='After'])"));

	// Date Field
	// Anniversary
	public WebElement anniversary = driver.findElement(By.xpath("//select[@id='timing_date_type']//option[@value='Anniversary'])"));
	// Brochure
	public WebElement brochure = driver.findElement(By.xpath("//select[@id='timing_date_type']//option[@value='Brochure'])"));
	// Certificate
	public WebElement certificate = driver.findElement(By.xpath("//select[@id='timing_date_type']//option[@value='Certificate'])"));
	
	// Method
	public WebElement email = driver.findElement(By.xpath("//select[@id='send_method']//option[@value='Email'])"));
	public WebElement print = driver.findElement(By.xpath("//select[@id='send_method']//option[@value='Print'])"));
		
	// Send To
	public WebElement recipient = driver.findElement(By.xpath("//select[@id='send_to']//option[@value='Recipient'])"));
	public WebElement supervisor = driver.findElement(By.xpath("//select[@id='send_to']//option[@value='Supervisor'])"));
	public WebElement manager = driver.findElement(By.xpath("//select[@id='send_to']//option[@value='Manager'])"));
	
	// Communication Content
	// From(alias)
	public WebElement from_alias = driver.findElement(By.xpath("//select[@id='from_alias'])"));
	// Message
	public WebElement message = driver.findElement(By.xpath("//td[contains(text(),'[ENTER CONTENT HERE]')]"));
	// insert default message	
	public WebElement insert_default_message_btn = driver.findElement(By.xpath("//a[contains(text(),'insert default message')]"));
	
	// insert default message	
	public WebElement preview_message = driver.findElement(By.xpath("//input[@value='preview message']"));	
		
}
