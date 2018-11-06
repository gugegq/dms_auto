package com.inspirus.dms.page.console.CreateEditSitePage.ProgramsPage.CreateEditProgramPage.FormSetupPage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSetupPage {
	
	//Constructor
	public FormSetupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Form Setup Link
	@FindBy(linkText="Form Setup")
	public WebElement FormSetupLink;			


	// "Create New Form" Button
	@FindBy(linkText="Create New Form")
	public WebElement CreateNewForm;			

	//-------------------------------------------------		
    //  Name Your Form Label  
	public String FormNameLabel = "/div/div/a/span[1]";		
	//  Form Section Icon chevron
	public String FormIconChevron="/div/div/a/span[2]";
    //	Name Your Form Inputbox	 
	public String FormNameInputbox = "/div/div[2]/div/input[3]";
    //	Name Your Form characters	
	public String FormNameMaximum = "/div/div[2]/div/div";
    //	Forms's Delete button	
	public String FormActiveBtn = "/div/div[2]/div/span[2]/a[1]";
    //	Forms's Delete and Active button
	public String FormDeleteBtn = "/div/div[2]/div/span[2]";
	//public String FormDeleteBtn = "/div/div[2]/div/span[2]/a";
    //	Introduction Message label	
	public String IntroductionMessageLabel = "/div/div[4]/div[1]/div/div/div/div[1]/a/span[1]";
    //	Introduction Message ifram
	public String IntroductionMessageIfram = "/div/div[4]/div[1]/div/div/div/div[2]/div/div/span/table/tbody/tr[2]/td/iframe";
    //	Introduction Message Preview button
	public String IntroductionMessagePreviewBtn = "/div/div[4]/div[1]/div/div/div/div[2]/div/div/a";
    //	Completion Message(required) Label
	public String CompletionMessageLabel = "/div/div[4]/div[5]/div/div/div/div[1]/a/span[1]";
    //	Completion Message(required) ifram
	public String CompletionMessageIfram = "/div/div[4]/div[5]/div/div/div/div[2]/div/div/span/table/tbody/tr[2]/td/iframe";
    //	Completion Message(required) Preview button
	public String CompletionMessagePreviewBtn = "/div/div[4]/div[5]/div/div/div/div[2]/div/div/a";
    //	Completion Message(required) Number Characters
	public String CompletionMessageMaximum = "/div/div[4]/div[5]/div/div/div/div[2]/div/div/div";
    //	Search field Instructions Label
	public String SearchLabel = "/div/div[4]/div[2]/div/label";
    //	Search field Instructions Input box
	public String SearchInputbox= "/div/div[4]/div[2]/div/input";
    //	Add New Question button
	public String AddNewQuestionBtn = "/div/div[4]/div[3]/div/a";
	//  Question&Answer Preview button
	public String PreviewQuestionBtn ="/div/div[4]/div[4]/div/div/div/div/div/button";
	
	public String[] paths ={
		FormNameLabel,
		FormIconChevron,
		FormNameInputbox,
		FormNameMaximum,
		FormActiveBtn,
		FormDeleteBtn,
		IntroductionMessageLabel,
		IntroductionMessageIfram,
		IntroductionMessagePreviewBtn,
		CompletionMessageLabel,
		CompletionMessageIfram,
		CompletionMessagePreviewBtn,
		CompletionMessageMaximum,
		SearchLabel,
		SearchInputbox,
		AddNewQuestionBtn,
		PreviewQuestionBtn
		
		};
	//* int fnm : fnm is which form number. start is from 2 (is first form).
	//* subpath: subpath is which element.
	public WebElement formElements(int fnm,String subPath, WebDriver driver){
		String fnmpath="";
		String arrypath="";
		for(int i=0;i<paths.length;i++){
			arrypath=paths[i];
			if (subPath.equals(arrypath)){
				if (subPath.equals(FormDeleteBtn)){					
					subPath="//div[@id='programFormsContainer']/div[" + fnm + "]"+ FormDeleteBtn;
				    int size = driver.findElement(By.xpath(subPath)).findElements(By.tagName("a")).size();				    
			        if  (size <= 1){
			        	  subPath=subPath+"/a[1]";
			        }else{
			              subPath=subPath+"/a[2]";       	  
			              }	
			         fnmpath= subPath ;
			    }else{
			    	 fnmpath="//div[@id='programFormsContainer']/div[" + fnm + "]" + subPath ;
			    }		       
		    break;
		    }			
		}
		return driver.findElement(By.xpath(fnmpath));
	}
	//----------------------------------------------------------------

	
	
    //Form Message preview modal
	//Preview Title
	@FindBy(id="previewFormSetupModalTitle")
	public WebElement PreviewTitle;
	//Preview content
	//@FindBy(xpath="//div[@id='contentPreview']/p")
	@FindBy(id="contentPreview")
	public WebElement PreviewContent;	
	//Print button
	@FindBy(xpath="//div[@id='formSetupPreviewForm'/div[3]/button[1]")
	public WebElement PreviewPrintButton;
	//Close button
	@FindBy(id="closeModal")
	public WebElement PreviewCloseButton;
	
    /*	
	//Preview Descitpion
	@FindBy(xpath="//div[@='programDescription']/div")
	public WebElement PreviewQuestionDescription;
	*/
			
	//Add Question Modal	
	@FindBy(id="myModalLabel")
	public WebElement AddQuestionModalLabel;
	    
		//Answer Required Label	    
		@FindBy(xpath="//div[@id='formQuestionContainer']/div[1]/div/span")
		public WebElement AnswerRequiredLabel;
		//Answer Required checkbox
		@FindBy(id="answerRequired1")
		public WebElement AnswerRequiredCheckbox;
		//Question Description
		@FindBy(id="questionContent")
		public WebElement QuestionDescription;
		// Question Description maximum
		@FindBy(xpath="//div[@id='formQuestionContainer']/div[2]/div/div[1]")
		public WebElement QuestionDescriptionMaximum;		
		//Don't enter your Required : Question is required
		@FindBy(xpath="//div[@id='formQuestionContainer']/div[2]/div/div[2]")
		public WebElement QuestionIsRequired;
		//Answer Type
		@FindBy(id="answerType")
		public WebElement AnswerType;	
		//Don't select an Answer Type :Answer type is required
		@FindBy(xpath="//div[@id='formQuestionContainer']/div[3]/div/div/span")
		public WebElement AnswerTypeIsRequired;
		//Answer Type option
		@FindBy(xpath="//select[@id='answerType']")
		public WebElement AnswerTypeOption;
		//Add button
		@FindBy(xpath="//tr[@id='questionOptionAddTr']/td[2]/a/span")
		public WebElement AddButton;

	    /* This funtion is for choose which answer controls(inputbox,add button,delete button) in the Add Question Modal.
	     * rr:  This is row number.
	     * contrl: There are three options (btn,label,"");  btn (is Add/Delete button) , lab (is Answer is required label), "" (is inputbox)
	     * For example: QuestionAnswerControlGroup(1,"", driver)
	     *              xpath = "//table[@id='questionAnswerOptionTable']/tbody/tr[1]/td/div/input" //focus on the first answer inputbox
	     * For example: QuestionAnswerControlGroup(2,"btn", driver)
	     *              xpath = "//table[@id='questionAnswerOptionTable']/tbody/tr[2]/td/a"  //focus on the second answer delete button
	     * For example: QuestionAnswerControlGroup(3,"lab", driver)
	     *              xpath = "//table[@id='questionAnswerOptionTable']/tbody/tr[3]/td/div/div" //focus on the answer is required label.
	     */
		
		public WebElement QuestionAnswerControlGroup(int rr, String contrl, WebDriver driver){	 
		  
		  if (contrl.equals("btn")){
			 String	controlPath="//table[@id='questionAnswerOptionTable']/tbody/tr["+rr+"]/td/a";
			 return driver.findElement(By.xpath(controlPath));
		   } else{
			 if (contrl.equals("lab")){
				 String controlPath="//table[@id='questionAnswerOptionTable']/tbody/tr["+rr+"]/td/div/div";
				 return driver.findElement(By.xpath(controlPath));
			 }
			 else{
				 String controlPath="//table[@id='questionAnswerOptionTable']/tbody/tr["+rr+"]/td/div/input";
				 return driver.findElement(By.xpath(controlPath));
			 }  
		   } 		 
		}
		//Include an optional comments field checkbox
		@FindBy(id="enableOptionalComments")
		public WebElement EnableOptionalComments;
	    //Scale Answer
	    @FindBy(xpath="//div[@id='scaleAnswer']")
	    public WebElement ScaleAnswer;
	    //Essay Answer
	    @FindBy(xpath="//div[@id='essayAnswer']")
	  	public WebElement EssayAnswer;
	    //Allow Attachments
	  	@FindBy(id="enableAttachment")
	  	public WebElement AllowAttachments;
		//Short Answer
		@FindBy(xpath="//div[@id='shortAnswerText']")
		public WebElement ShortAnswer;		
		//Date Answer
		@FindBy(id="dateEntryAnswer")
		public WebElement DateAnswer;		
		//Save button
		@FindBy(xpath="//div[@id='questionsModal']/div/div/div[3]/button")
		public WebElement QuestionModalSave;
		//Cancel button
		@FindBy(xpath="//div[@id='questionsModal']/div/div/div[3]/a")
		public WebElement QuestionModalCancel;		
		//Close icon 
		@FindBy(xpath="//div[@id='questionsModal']/div/div/div[1]/button")
		public WebElement QuestionModalClose;	
		 
		
        		

		//1. Question Desciption on Questions & Answers section [Row: question number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr/td[2]/div
        //2. Requird label on Questions & Answers section  [Row: question number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr[2]/td/span
		//3. Answers  [row: question number, col: answer number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr/td/table/tbody/tr[Col]/td/div
		//4 & 5. button on Questions & Answers section [Row: question number, col=1 : Edit button, Col=2 : Delete button]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr/td/a[col]
        //6. Date   [Row: question number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr[4]/td/span
        //7. dropdown   [Row: question number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[row]/td/table/tbody/tr/td/select
		//8. ShortTextarea  [Row: question number]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr/td/textarea
        //9. Essay  [Row: question number, Col=1: Textarea, col=2: 'Attach a file(optional)' Label, Col=3 : browser button ]
		//div[@id='programFormsContainer']/div[2]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr[Row]/td/table/tbody/tr/td/table/tbody/tr[col]/td
        //------------------------------------------------------------------------------------------------------------------------------------------		
		/* This function is for finding elements in the Quesiton & Answer section .
		 * formNumber:  which form number?[NOTE: the first form number is from 2.] (eg: if the form is the second form, then formNumber = 3);
		 * nRow: which question number?(eg: if the question is the first question, then nRow =1);
		 * cotrlName: Question = 1,Required=2,Answer=3,Edit= 4,Delete =5,Date =6,Dropdown=7,ShortTextarea =8,Essay=9;
		 * nCol: if CotrlName =3 or 9 , then nCol 
		*/

		public WebElement findQuesstionAndAnswerSectionElements(int formNumber,int nRow,int cotrlName,int nCol,WebDriver driver){
		String subPath ="//div[@id='programFormsContainer']/div[" + formNumber + "]/div/div[4]/div[4]/div/div/div/div/div[2]/div/div/table/tbody/tr["
		                + nRow + "]/td/table/tbody";
		String qaPath=subPath;
		if ((cotrlName!= 3) & (cotrlName!=9)){
			nCol=1;
		}
		switch(cotrlName){
		   case 1: //1. Question Desciption 
		      {
		           qaPath=subPath+"/tr/td[2]/div";
		  		   return driver.findElement(By.xpath(qaPath));		  		  
		      } 
		   case 2: //2. Requird label
	          {
	        	   qaPath=subPath+"/tr[2]/td/span";
	  			   return driver.findElement(By.xpath(qaPath));	  			 
	          }
		   case 3: //3. Answers [nCol: answer number]
	          {
	        	   qaPath=subPath+"/tr/td/table/tbody/tr["+nCol+"]/td/div";
	  			   return driver.findElement(By.xpath(qaPath));	  			  
	          } 
		   case 4: //4 Edit button
		      {
		           qaPath=subPath+"/tr/td/a[1]";
		  		   return driver.findElement(By.xpath(qaPath));		  		  
		      }
		   case 5: // 5. Delet button button
	          {
	        	   qaPath=subPath+"/tr/td/a[2]";
	  			   return driver.findElement(By.xpath(qaPath));	  			 
	          }
		   case 6: //6. Date  
	          {
	        	   qaPath=subPath+"/tr[4]/td/span";
	  			   return driver.findElement(By.xpath(qaPath));	  			  
	          } 
		   case 7: //7. dropdown 
		      {
		           qaPath=subPath+"/tr/td/select";
		  		   return driver.findElement(By.xpath(qaPath));		  		  
		      }
		   case 8: //8. Short Textarea
	          {
	        	   qaPath=subPath+"/tr/td/textarea";
	  			   return driver.findElement(By.xpath(qaPath));	  			 
	          }
		   case 9: //9. Essay [nCol=1: Textarea, nCol=2: 'Attach a file(optional)' Label, nCol=3 : browser button ]
	          {
	        	   qaPath=subPath+"/tr/td/table/tbody/tr["+nCol+"]/td";
	  			   return driver.findElement(By.xpath(qaPath));	  			  
	          }  
	       default:
	       {
	    	   System.out.println("cotrlName is incorrect ["+ cotrlName + "]");
	    	   return driver.findElement(By.xpath(qaPath));    	   
	    	  
	       }	
		}
		}
		
		//-----------------< Question & Answser Preview Modal >-----------------------
		// Question&Answer modal title
		@FindBy(id="previewFormSetupModalTitle")
		public WebElement previewQuestionDetailModalTitle;
		// X icon on the  Question & Answer modal 
		@FindBy(xpath="//form[@id='formSetupPreviewForm']/div[1]/button[1]")
		public WebElement previewQuestionDetailModalXBtn;
		// print button on the  Question & Answer modal 
		@FindBy(xpath="//form[@id='formSetupPreviewForm']/div[3]/button[1]")
		public WebElement previewQuestionDetailModalPrintBtn;
		// Close button on the  Question & Answer modal 
		@FindBy(id="closeModal")
		public WebElement previewQuestionDetailModalCloseBtn;
		
		//-----------------Need this function [findQuestionAnswerPreivewModalElements()] to find the following elements--------------
		//  Question Description 
		public String questionDescription = "/tr/td[2]/div";
		//  Question Required
		public String questionRequired ="/tr[2]/td/span";
		//  Question Answer
		public String questionAnswer="/td/div";
		//  Provide Details Label
		public String questionProvideDetailsLabel="/td/div/span";
		//  Provide details TextArea
		public String questionProvideDetailsTextAreaString="/td/div/textarea";
		//  Select dropdown
		public String questionSelectDropdown="/tr/td/select";
		//  Scale Control
		public String questionScale="/tr/td/table/tbody/tr/td";
		// Essay's TextArea
		public String questionEssayTextArea="/tr/td/table/tbody/tr/td/textarea";
		//  Attachement Label
		public String questionAttachementLabel="/tr/td/table/tbody/tr/td/span";
		//  Attachement Browser button
		public String questionAttachementBrowserBtn="/tr/td/table/tbody/tr/td/button";
		// Short Text Area
		public String questionShortTextArea="/tr/td/textarea";
		//  Date
		public String questionDateIcon="/td/span";
		
		public String[] qestionPaths ={
			questionDescription,
			questionRequired,
			questionAnswer,
			questionProvideDetailsLabel,
			questionProvideDetailsTextAreaString,
			questionSelectDropdown,
			questionScale,
			questionEssayTextArea,
			questionAttachementLabel,
			questionAttachementBrowserBtn,
			questionShortTextArea,
			questionDateIcon
		};
		//* qRow:  which is quetion number.
		//* aRow:  which is answer number. if the element is not answer, then aRow can equal to any int.
		//* req:  true or fals. true: which has required label; false: which has not required label.
		//* sPath:  this is sub-elements on preview question modal. eg: if the element is question description, then spath = questionDescription .
		// For example:  FormSetupPage.findQuestionAnswerPreivewModalElements(1,2,true,questionAnswer,driver);
		//      this is the No.2 answer of the No.1 question (the No.1 question has required Label.)
		public WebElement findQuestionAnswerPreivewModalElements(int qRow,int aRow,boolean req,String sPath, WebDriver driver){
			String previewmodalPath="";
			String pubPath="//div[@id='contentPreview']/div/div/table/tbody/tr["+qRow+"]/td/table/tbody";
			String arrypath="";
			String answerpath="";
			for(int j=0;j<qestionPaths.length;j++){
				arrypath=qestionPaths[j];
				if (sPath.equals(arrypath)){				
					if (sPath.equals(questionAnswer)){
						  if (req){
							 answerpath="/tr[4]/td[2]/table/tbody/tr["+aRow+"]";
							 pubPath=pubPath+answerpath;
						  }else{
							 answerpath="/tr[3]/td[2]/table/tbody/tr["+aRow+"]";
							 pubPath=pubPath+answerpath;
						   }						
				    }else{
				    	if (sPath.equals(questionProvideDetailsLabel)||(sPath.equals(questionProvideDetailsTextAreaString))){
				    		if (req){
				    			pubPath=pubPath+"/tr[5]";
				    		}else{
				    			pubPath=pubPath+"/tr[4]";
				    		}			    		
				    	}else{
				    		if (sPath.equals(questionDateIcon)){
					    		if (req){
					    			pubPath=pubPath+"/tr[4]";
					    		}else{
					    			pubPath=pubPath+"/tr[3]";
					    		}
				    		}
				    	}
				    }
					previewmodalPath=pubPath+sPath;
					break;					
			    }
			  }			
			return driver.findElement(By.xpath(previewmodalPath));
		}
		
		
		
		
		
		
		
	
		// Delete Form Dailog
		//  Confirm Message
		@FindBy(id="confirmMsg")
		public WebElement DeleteFormConfirmMsg;
		//  Ok Button
		@FindBy(id="okButton")
		public WebElement DeleteFormOkButton;	
		//  Cancel Button
		@FindBy(id="cancelButton")
		public WebElement DeleteFormCancelButton;		
		//  Close icon
		@FindBy(xpath="//div[@id='formSetupDeleteConfirmModel']/div[1]/button")
		public WebElement DeleteFormCloseIcon;	
		
		
		
		
		// Save and Exit button
		public WebElement saveExit;		
		// Save and Continue button
		public WebElement saveContinue;
		// Cancel button
		@FindBy(xpath="//a[@id='createEditSite']/button")
		public WebElement Cancelbtn;
}

