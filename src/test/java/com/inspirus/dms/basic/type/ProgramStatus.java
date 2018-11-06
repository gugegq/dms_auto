package com.inspirus.dms.basic.type;

public enum ProgramStatus {
	BLANK(""),
	ACTIVE("Active"),
	DRAFT("Draft"),
	EXPIRED("Expired"),
	INACTIVE("Inactive"),
	PENDING("Pending");
	
	private String programStatus;
	
	private ProgramStatus(String programStatus) {
		this.programStatus = programStatus;
	}
	
	public String getProgramStatus() {
		return programStatus;
	}

	public void setProgramType(String programStatus) {
		this.programStatus = programStatus;
	}
	
	public String getName() {
		return name();
	}
}