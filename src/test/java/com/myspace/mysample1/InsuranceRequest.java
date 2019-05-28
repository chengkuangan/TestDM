package com.myspace.mysample1;

public class InsuranceRequest {

	private String id;

	private java.lang.String name;

	private java.lang.Integer age;

	private java.lang.String type;

	private java.lang.String car_reg;

	private java.lang.String car_model;

	private int car_year;

	private java.lang.Boolean cover_windscreen;

	private java.lang.Boolean cover_second_driver;

	private java.lang.String provider;

	private java.lang.String api;

	public InsuranceRequest() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getCar_reg() {
		return this.car_reg;
	}

	public void setCar_reg(java.lang.String car_reg) {
		this.car_reg = car_reg;
	}

	public java.lang.String getCar_model() {
		return this.car_model;
	}

	public void setCar_model(java.lang.String car_model) {
		this.car_model = car_model;
	}

	public java.lang.Boolean getCover_windscreen() {
		return this.cover_windscreen;
	}

	public void setCover_windscreen(java.lang.Boolean cover_windscreen) {
		this.cover_windscreen = cover_windscreen;
	}

	public java.lang.Boolean getCover_second_driver() {
		return this.cover_second_driver;
	}

	public void setCover_second_driver(java.lang.Boolean cover_second_driver) {
		this.cover_second_driver = cover_second_driver;
	}

	public int getCar_year() {
		return this.car_year;
	}

	public void setCar_year(int car_year) {
		this.car_year = car_year;
	}

	public java.lang.String getProvider() {
		return this.provider;
	}

	public void setProvider(java.lang.String provider) {
		this.provider = provider;
	}

	public java.lang.String getApi() {
		return this.api;
	}

	public void setApi(java.lang.String api) {
		this.api = api;
	}

	public InsuranceRequest(java.lang.String id, java.lang.String name,
			java.lang.Integer age, 
			java.lang.String car_reg, java.lang.String car_model, int car_year,
			java.lang.Boolean cover_windscreen,
			java.lang.Boolean cover_second_driver) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.car_reg = car_reg;
		this.car_model = car_model;
		this.car_year = car_year;
		this.cover_windscreen = cover_windscreen;
		this.cover_second_driver = cover_second_driver;
	}
	
}
