package com.inspirus.dms.basic.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;

//import com.thoughtworks.selenium.Selenium;

public class ModifyDate {
	
//	Selenium myselenium;
	String gdate = "";
	
	//Get data & time of next minute
	public String modifyGoLiveDate(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.MINUTE,2);
		String gdate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
		return gdate;
	}
	//get yesterday date
	public String modifyEndDate(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -1);
		String endDate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
		return endDate;
	}
	public String modifyAwardStartDate(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH,1);
		String gdate=new SimpleDateFormat("MM/dd/yyyy").format(c.getTime());
		return gdate;
	}
	public String modifyAwardEndDate(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH,2);
		String gdate=new SimpleDateFormat("MM/dd/yyyy").format(c.getTime());
		return gdate;
	}
	public String modifyNominationStartDate(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, +1);
		String endDate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
		return endDate;
		
	}

public String modifyNominationEndDate(){
	Calendar c=Calendar.getInstance();
	c.add(Calendar.DAY_OF_MONTH, +5);
	String endDate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
	return endDate;
	
}

public String modifyReviewstartDate(){
	Calendar c=Calendar.getInstance();
	c.add(Calendar.DAY_OF_MONTH, +2);
	String endDate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
	return endDate;
	
}
public String modifyReviewendDate(){
	Calendar c=Calendar.getInstance();
	c.add(Calendar.DAY_OF_MONTH, +10);
	String endDate=new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(c.getTime());
	return endDate;
	
}

//get current date
	public String getCurrentDate(){
		Calendar c=Calendar.getInstance();
		String currentDate=new SimpleDateFormat("MM/dd/yyyy").format(c.getTime());
		return currentDate;
	}


}
