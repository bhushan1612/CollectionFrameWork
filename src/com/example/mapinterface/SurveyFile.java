package com.example.mapinterface;

public class SurveyFile {

	private String variable;
	private String breakdow;
	
	public String getVariable() {
		return variable;
	}
	
	public String getBreakdow() {
		return breakdow;
	}

	public SurveyFile(String variable, String breakdow) {
		super();
		this.variable = variable;
		this.breakdow = breakdow;
	}

	public SurveyFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CsvPojoFile [variable=" + variable + ", breakdow=" + breakdow + "]";
	}
	
	
}
