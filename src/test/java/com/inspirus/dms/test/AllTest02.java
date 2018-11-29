/**
 * @author: create by Jason
 * @description: com.inspirus.dms.test
 * @date:2018年11月29日
 */

package com.inspirus.dms.test;

import com.inspirus.dms.test.Console.TC_01_DMS_6452_PacketConfirmationCheck;
import com.inspirus.dms.test.Console.TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

// For Junit3
public class AllTest02 {
	
	public static Test Suite() {
		
		TestSuite suite = new TestSuite("Test for all suite");
		//Add Test Case here
		System.out.println("Add Test Case Here, and begin run TestCase\n");
		suite.addTest(new JUnit4TestAdapter(TC_01_DMS_6452_PacketConfirmationCheck.class));
		suite.addTest(new JUnit4TestAdapter(TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM.class));	
		return suite;
		
	}
}


