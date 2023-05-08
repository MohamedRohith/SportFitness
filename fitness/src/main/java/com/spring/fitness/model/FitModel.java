package com.spring.fitness.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fitness")
public class FitModel {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String bulking;
	private String cutting;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBulking() {
		return bulking;
	}
	public void setBulking(String bulking) {
		this.bulking = bulking;
	}
	public String getCutting() {
		return cutting;
	}
	public void setCutting(String cutting) {
		this.cutting = cutting;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FitModel [id=" + id + ", bulking=" + bulking + ", cutting=" + cutting + ", price=" + price + "]";
	}
	
	
}
