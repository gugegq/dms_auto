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
	
	
//	// Email_All
//	// Email Button
//	public static final String  frame_received_email = "a1j";
//	public static final String  received_email = "//*[@id=\\\":3i\\\"]/span";
//	// Email Content
//	// Meredith Young - Service Recognition Award Packet
//	public static final String  title_email = "//*[@id=\":7j\"]";
//	// Service Award Packet Shipped for - Meredith Young
//	public static final String  head_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/h2";
//	/*
//	 * 	Thank you for supporting the TEST, Service Award Program. 
//	 *  Your role is critical to the success of the program. 
//	 *  It is important to recognize and appreciate our employees for their continued service in helping make TEST a great company.
//	 */
//	public static final String  body1_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[1]";
//	// You recently should have received a Service Award Packet for Meredith Young.
//	public static final String  body2_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[2]";
//	// It was sent to:
//	public static final String  body3_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[3]";
//	// ##%saddress1%##
//	public static final String  body4_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[4]";
//	// ##%saddress2%##
//	public static final String  body5_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[5]";
//	// ##%saddress3%##
//	public static final String  body6_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[6]";
//	// ##%saddress4%##
//	public static final String  body7_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[7]";
//	// ##%scity%##, ##%sstate%## ##%szip%##
//	public static final String  body8_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[8]";
//	// ##%scountry%##
//	public static final String  body9_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[8]";		
//	// If you have not received this delivery or it was damaged in transit, please contact us via e-mail or call 888.332.7110 to order a replacement.
//	public static final String  body10_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[9]";
//	/*
//	 * Meredith Young will be receiving an e-mail directly from TEST with information on how to choose their service award. 
//	 * Please take the time to personally acknowledge their contributions to the company. 
//	 * This is a great opportunity to recognize your employee in a memorable way.
//	 * */
//	public static final String  body11_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[10]";
//	// Thank you again for your participation and for helping TEST in creating a company that cares about its people.
//	public static final String  body12_email = "//*[@id=\"m_3676574496665937459templateBody\"]/tbody/tr/td/text()[11]";	


		
}
