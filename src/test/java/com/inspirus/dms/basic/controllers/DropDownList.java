package com.inspirus.dms.basic.controllers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropDownList {

	// Validate the array is the same as the dropdownlist whatever the sort is
	public Boolean isTheSame(String[] options, WebElement element) {
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		WebElement[] droplist = new WebElement[list.size()];
		list.toArray(droplist);
		Boolean isSame = false;
		int j = 0;
		
		if (options.length == droplist.length) {
			for (int i = 0; i < droplist.length; i++) {
				for (String item : options) {
					if (item.equals(droplist[i].getText())) {
						System.out.println("option" + i + " is existed: " + item);
						j++;
						break;
					}
				}
			}
			if (j == options.length) isSame = true;
		} 
		
		return isSame;
	}

	// Validate the array is equal to the dropdownlist and with the same sort
	public Boolean isEqual(String[] options, WebElement element) {
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		WebElement[] droplist = new WebElement[list.size()];
		list.toArray(droplist);
		Boolean isEqual = true;
		
		if (options.length == droplist.length) {
			for (int i = 0; i < options.length; i++) {
				if (!options[i].equals(droplist[i].getText())) {
					System.out.println("option" + i + ": " + options[i]);
					System.out.println("droplist" + i + ": "
							+ droplist[i].getText());
					isEqual = false;
					break;
				}
			}
		} else {
			isEqual = false;
		}
		
		return isEqual;
	}

	// Validate the array is the same as the dropdownlist, but the sort in
	// opposite order
	public Boolean isSortInOpposite(String[] options, WebElement element) {
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		WebElement[] droplist = new WebElement[list.size()];
		list.toArray(droplist);
		Boolean isSortInOpposite = true;
		
		if (options.length == droplist.length) {
			for (int i = 0, j = 1; i < options.length; i++, j++) {
				if (!options[i].equals(droplist[options.length - j].getText())) {
					System.out.println("option" + i + ": " + options[i]);
					System.out.println("droplist" + i + ": "
							+ droplist[options.length - j].getText());
					isSortInOpposite = false;
					break;
				}
			}
		} else {
			isSortInOpposite = false;
		}
		
		return isSortInOpposite;
	}

	// Validate the string is existed in the dropdownlist
	public Boolean isExistedIn(String option, WebElement element) {
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		WebElement[] droplist = new WebElement[list.size()];
		list.toArray(droplist);
		Boolean isExistedIn = false;
		
		for (int i = 0; i < droplist.length; i++) {
			if (option.equals(droplist[i].getText())) {
				isExistedIn = true;
				break;
			}
		}
		
		return isExistedIn;
	}


}
