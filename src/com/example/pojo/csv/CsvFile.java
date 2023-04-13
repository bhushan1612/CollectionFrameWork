package com.example.pojo.csv;

public class CsvFile {

	private String variable;
	private String breakdow;
	private String breakdownCategory;
	private String year;
	private String rdValue;
	private String status;
	private String footnotes;
	private String unit_for_TSM_and_CSV;

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getBreakdow() {
		return breakdow;
	}

	public void setBreakdow(String breakdow) {
		this.breakdow = breakdow;
	}

	public String getBreakdownCategory() {
		return breakdownCategory;
	}

	public void setBreakdownCategory(String breakdownCategory) {
		this.breakdownCategory = breakdownCategory;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRdValue() {
		return rdValue;
	}

	public void setRdValue(String rdValue) {
		this.rdValue = rdValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFootnotes() {
		return footnotes;
	}

	public void setFootnotes(String footnotes) {
		this.footnotes = footnotes;
	}

	public String getUnit_for_TSM_and_CSV() {
		return unit_for_TSM_and_CSV;
	}

	public void setUnit_for_TSM_and_CSV(String unit_for_TSM_and_CSV) {
		this.unit_for_TSM_and_CSV = unit_for_TSM_and_CSV;
	}

	@Override
	public String toString() {
		return "CsvFile [variable=" + variable + ", breakdow=" + breakdow + ", breakdownCategory=" + breakdownCategory
				+ ", year=" + year + ", rdValue=" + rdValue + ", status=" + status + ", footnotes=" + footnotes
				+ ", unit_for_TSM_and_CSV=" + unit_for_TSM_and_CSV + "]";
	}

}
