package com.inspirus.dms.basic.controllers;

import com.thoughtworks.selenium.Selenium;

public class InputUpload {
	
	long stime = 5000;
	
	// the method for the upload profile function on the edit profile module
	public void Wall_Profile(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	// the method for the attachment function on the create page
	public void Wall_Attachment(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload3(GetPath(src));
		
	}
	
	// the method for the upload points function on the programs module for coordinator or client admin
	public void Wall_Points(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	public void SiteAssets_SiteLogo(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-dropzone\").click()");
//		selenium.click("file-upload-input-dropzone");
		Thread.sleep(stime);
		ExecUpload2(GetPath(src));
		
	}
	
	public void SiteAssets_CertificateLogo(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-dropzone2\").click()");
	//	selenium.click("file-upload-input-dropzone2");
		Thread.sleep(stime);
		ExecUpload2(GetPath(src));
		
	}
	
	public void SiteAssets_LoginPageImage(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-dropzone3\").click()");
		//	selenium.click("file-upload-input-dropzone3");
		Thread.sleep(stime);
		ExecUpload2(GetPath(src));
		
	}
	
	public void SiteAssets_MobileDesktopIcon(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementsByName(\"siteAsset.mobileIconFileData\")[0].click()");
		//selenium.click("file-upload-input-dropzone4");
		Thread.sleep(stime);
		ExecUpload2(GetPath(src));
		
	}
	
	public void SiteImages(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload2(GetPath(src));
		
	}
	
	
	public void ManageUsers(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	public void Programs_Eligibility(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	public void Programs_Images(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	public void Programs_Administration(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	
	public void Programs_HonorSuperApprover(String src, Selenium selenium) throws Exception{
		selenium.runScript("document.getElementById(\"file-upload-input-dropzone2\").click()");
		Thread.sleep(stime);
		ExecUpload(GetPath(src));
		
	}
	

	private String GetPath(String src){
		String path = "";
		String separation = "";
		String[] imgs = src.split(" ");
		
		for (int i=0; i<imgs.length; i++){
			path = path + separation + System.getProperty("user.dir") + "\\resources\\uploadFiles\\" + imgs[i];
			separation = " ";
		}
		System.out.println("path: "+ path);
		return path;
	}
	
	private void ExecUpload(String path) throws Exception{
		String UploadControl = System.getProperty("user.dir") + "\\resources\\UploadControl.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
	}
	
	private void ExecUpload2(String path) throws Exception{
		String UploadControl = System.getProperty("user.dir") + "\\resources\\UploadControl2.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
	}
	
	private void ExecUpload3(String path) throws Exception{
		String UploadControl = System.getProperty("user.dir") + "\\resources\\UploadControl3.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
	}
	
	/*  
	 *  The following methods have been abandoned
	 *   
	 *	
    // The first parameter is the image name with extension that you want to upload
	public void selectImgs(String src, Selenium selenium) throws Exception{
		String path = "";
		String separation = "";
		String[] imgs = src.split(" ");
		
		for (int i=0; i<imgs.length; i++){
			path = path + separation + System.getProperty("user.dir") + "\\resources\\images\\" + imgs[i];
			separation = " ";
		}
		System.out.println("path: "+ path);
		selenium.runScript("document.getElementById(\"file-upload-input-dropzone\").click()");
		Thread.sleep(1000);
		String UploadControl = "resources\\UploadControl.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
		
	}
	
    // The first parameter is the image name with extension that you want to upload
	// The second parameter is the name of the element Add files button
	public void selectImgs(String src, String name, Selenium selenium) throws Exception{
		String path = "";
		String separation = "";
		String[] imgs = src.split(" ");
		
		for (int i=0; i<imgs.length; i++){
			path = path + separation + System.getProperty("user.dir") + "\\resources\\images\\" + imgs[i];
			separation = " ";
		}
		System.out.println("path: "+ path);
		selenium.runScript("document.getElementsByName('"+name+"')[0].click()");
		Thread.sleep(1000);
		String UploadControl = "resources\\UploadControl.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
		
	}
	
	// The first parameter is the file name with extension that you want to upload
	public void selectFiles(String src, Selenium selenium) throws Exception{
		String path = "";
		String separation = "";
		String[] imgs = src.split(" ");
		
		for (int i=0; i<imgs.length; i++){
			path = path + separation + System.getProperty("user.dir") + "\\resources\\files\\" + imgs[i];
			separation = " ";
		}
		System.out.println("path: "+ path);
		selenium.runScript("document.getElementById(\"file-upload-input-\").click()");
		Thread.sleep(1000);
		String UploadControl = "resources\\UploadControl.exe " + path;
		System.out.println("control: " + UploadControl);
		Runtime.getRuntime().exec(UploadControl);
		
	}
	
	*/
}
