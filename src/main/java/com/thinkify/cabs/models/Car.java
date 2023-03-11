package com.thinkify.cabs.models;

public class Car {

	private String company;
	private String model;
	private String makeYear;
	private String fuelType;

	public Car() {

	}

	public Car(String company, String model, String makeYear, String fuelType) {
		this.company = company;
		this.model = model;
		this.makeYear = makeYear;
		this.fuelType = fuelType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	
}
