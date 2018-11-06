package com.inspirus.dms.basic.controllers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public String getCurrentSystemTime() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH-mm-ss");
		String time = dateFormat.format(now);
		return time;
	}

	public void errorScreenshot(WebDriver driver, String path, String number,
			String pictureFormat) throws IOException {
		String systemTime = this.getCurrentSystemTime();
		String pictureName = number + " " + systemTime + pictureFormat;
		File jpg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jpg, new File(path + pictureName));
	}
}
