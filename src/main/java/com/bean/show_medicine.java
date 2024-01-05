package com.bean;

public class show_medicine {
	int medicine_id;
	String medicine_name;
	float current_price;
	String exp_date;
	int stock;
	
	public int getMedicine_id() {
		return medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public float getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(float current_price) {
		this.current_price = current_price;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
