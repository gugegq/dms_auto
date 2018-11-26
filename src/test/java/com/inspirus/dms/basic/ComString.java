package com.inspirus.dms.basic;

public class ComString {
	
	//Customer
	public static final String customer_id = "D01000";
	public static final String program_code = "1801";
	public static final String cng_code = "M0013";

	
	//Recip Info
	public static final String first_name = "Dms_Recip_F";
	public static final String last_name = "Dms_Recip_L";	
	public static final String eid = "7654321";
	public static final String level_year = "05";
	public static final String anniv_date = "11/08/2018";
	public static final String serv_date = "11/08/2018";
	
	//Recipients
	public static final String recip_input = "4734259";
	
	//Issue Tracker
	//Assert Viable
	//4734259last, 4734259first D01000 DMS 1801
	public static final String excepted_result_dms= recip_input+"last, "+recip_input+"first "+customer_id+" DMS "+program_code;
	//4734259last, 4734259first 4 M0013 CNG
	public static final String excepted_result_cng= recip_input+"last, "+recip_input+"first 4 "+cng_code+" CNG";
	public static final String excepted_result_r2i= "";
	
	//Common Variable
	public static final long stime = 5000;


	

}
