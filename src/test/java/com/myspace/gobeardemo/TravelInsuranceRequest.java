package com.myspace.gobeardemo;

public class TravelInsuranceRequest {

	private int duration;
	private double totalPremium;
	private double standardPremium;
	private double additionalPremium;
	private java.lang.String location;
	private boolean family;
	private int additionalWeek;

	private java.util.Date startDate;

	private java.util.Date endDate;

	public TravelInsuranceRequest() {
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public double getStandardPremium() {
		return this.standardPremium;
	}

	public void setStandardPremium(double standardPremium) {
		this.standardPremium = standardPremium;
	}

	public double getAdditionalPremium() {
		return this.additionalPremium;
	}

	public void setAdditionalPremium(double additionalPremium) {
		this.additionalPremium = additionalPremium;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public boolean isFamily() {
		return this.family;
	}

	public void setFamily(boolean family) {
		this.family = family;
	}

	public int getAdditionalWeek() {
		return this.additionalWeek;
	}

	public void setAdditionalWeek(int additionalWeek) {
		this.additionalWeek = additionalWeek;
	}

	public java.util.Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public TravelInsuranceRequest(java.lang.String location, boolean family,
			java.util.Date startDate, java.util.Date endDate) {
		this.location = location;
		this.family = family;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
