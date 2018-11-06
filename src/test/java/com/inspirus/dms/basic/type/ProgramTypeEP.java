package com.inspirus.dms.basic.type;

public enum ProgramTypeEP {
	BLANK(""),
	AWARD_CODE("Award Code"),
	BIRTHDAY("Birthday"),
	COMMUNITY_ANNOUNCEMENT("Community Announcement "),
	FORMS("Forms"),
	HONORS("Honor's"),
	LEARNING("Learning"),
	NOMINATION("Nomination"),
	NOMINATION_WITH_BUDGETS("Nomination With Budgets"),
	ONBOARDING("Onboarding"),
	PEER_TO_PEER("Peer to Peer"),
	REGISTRATION("Registration"),
	RETIREMENT("Retirement"),
	SERVICE_ANNIVERSARY("Service Anniversary"),
	SERVICE_ANNIVERSARY_UNITY("Service Anniversary Unity"),
	SPECIAL_EVENT("Special Event"),
	SPOT("Spot"),
	SURVEY("Survey"),
	UPLOAD("Upload"),
	WELL_BEING("Well-being"),
	WELLNESS("Wellness");
	
	private String programType;
	
	private ProgramTypeEP(String programType) {
		this.programType = programType;
	}
	
	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}
	
	public String getName() {
		return name();
	}
}
