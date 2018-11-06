package com.inspirus.dms.basic.controllers;

import java.util.Date;

import com.thoughtworks.selenium.Selenium;

public class Calendar {

	Selenium myselenium;
	String sdate = "";
	
	public Calendar(Selenium selenium){
		myselenium = selenium;
	}
	
	
	public void setStartDate(String myDate){
		
		//changeto24(myDate);
		
		myselenium.type("id=startDate", changeto12(myDate));
	}
	
	private String changeto24(String myDate){
		Date startdate = new Date(myDate);
		java.text.DateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm");
		sdate = format.format(startdate);
		return sdate;
	}
	
	private String changeto12(String myDate){
		Date startdate = new Date(myDate);
		java.text.DateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy hh:mm a");
		sdate = format.format(startdate).replaceAll("上午", "AM").replaceAll("下午", "PM");
		return sdate;
	}

}
