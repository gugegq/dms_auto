package com.inspirus.dms.basic;

import org.openqa.selenium.WebDriver;


public class ElementLocation {
	
	WebDriver driver;
	
	// Console -> Customer Search
	public static final String  cust_Search = "//a[contains(text(),'Customer Search')]";
	// Customer -> Customer Search -> Customer ID
	public static final String  cust_Id = "//input[@name='ID']";	
	// Customer -> Customer Search -> Customer ID -> Search
	public static final String  cust_Id_Search = "/html/body/div[3]/table[2]/tbody/tr[4]/td[2]/table/tbody/tr/td/table[4]/tbody/tr[2]/td[2]/input[2]";
	// Customer -> Customer Search -> Customer ID -> Search -> programs
	public static final String  programs = "//a[contains(text(),'Programs')]";
	public static final String  programs_code = "//a[contains(text(),'1801')]";
	// Customer -> Customer Search -> Customer ID -> programs -> communications
	public static final String  communications = "//a[contains(text(),'communication')]";
	// Customer -> Customer Search -> Customer ID -> programs -> communications -> add
	public static final String  add_btn = "//a[contains(text(),'add')]";
	// Customer -> Customer Search -> Customer ID -> programs -> communications -> add -> All Input Value
	
	// Select Drop Down Menu
	
	// Event-Type
	// Anniversary Reminder
	public static final String  anniversary_reminder = "//select[@id='type_id']//option[@value='5']";
	// Non Response Reminder
	public static final String  non_response_reminder = "//select[@id='type_id']//option[@value='1']";
	// Packet Confirmation
	public static final String  packet_confirmation = "//select[@id='type_id']//option[@value='3']";
	// Ship Notification
	public static final String  ship_notification = "//select[@id='type_id']//option[@value='4']";
	// Solicitation
	public static final String  solicitation = "//select[@id='type_id']//option[@value='2']";
	
	// Status
	// Active
	public static final String  active = "//select[@id='status']//option[@value='Active']";
	// Inactive
	public static final String  inactive = "//select[@id='status']//option[@value='Inactive']";
	
	// Timing
	public static final String  timing = "//input[@id='timing_days']";
	// Before / After
	// Before
	public static final String  before = "//select[@id='timing_period']//option[@value='Before']";
	// After
	public static final String  after = "//select[@id='timing_period']//option[@value='After']";

	// Date Field
	// Anniversary
	public static final String  anniversary = "//select[@id='timing_date_type']//option[@value='Anniversary']";
	// Brochure
	public static final String  brochure = "//select[@id='timing_date_type']//option[@value='Brochure']";
	// Certificate
	public static final String  certificate = "//select[@id='timing_date_type']//option[@value='Certificate']";
	
	// Method
	public static final String  email = "//select[@id='send_method']//option[@value='Email']";
	public static final String  print = "//select[@id='send_method']//option[@value='Print']";
		
	// Send To
	public static final String  recipient = "//select[@id='send_to']//option[@value='Recipient']";
	public static final String  supervisor = "//select[@id='send_to']//option[@value='Supervisor']";
	public static final String  manager = "//select[@id='send_to']//option[@value='Manager']";
	
	// Communication Content
	// From(alias)
	public static final String  from_alias = "//input[@id='from_alias']";
	// Frame Message
	public static final String  frame_message = "iframe.cke_wysiwyg_frame";
	// Message
	public static final String  message = "#templateBody > tbody > tr > td";
	// insert default message	
	public static final String  insert_default_message_btn = "//a[contains(text(),'insert default message')]";
	
	// Preview Message Button	
	public static final String  preview_message = "//input[@value='preview message']";	
	// Send Preview	
	public static final String  send_preview = "//input[@id='send_preview_to']";	
	// Send Button	
	public static final String  send_btn = "//input[@id='send']";
	
	
	// Email_All
	// Email Button
	public static final String  received_email = "#\\:5c";
		
}
