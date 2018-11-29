/**
 * @author: create by Jason
 * @description: com.inspirus.dms.test
 * @date:2018年11月29日
 */

// For Junit4
package com.inspirus.dms.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.inspirus.dms.test.Console.TC_01_DMS_6452_PacketConfirmationCheck;
import com.inspirus.dms.test.Console.TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM;

@RunWith(Suite.class)
//Add Test Case Here
@Suite.SuiteClasses({
	TC_01_DMS_6452_PacketConfirmationCheck.class,
	TC_02_DMS_6485_IssueTrackerToggleBetweenLinkedDandM.class
	})

public class AllTest01 {
	
}