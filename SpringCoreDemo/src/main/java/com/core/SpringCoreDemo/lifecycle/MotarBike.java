package com.core.SpringCoreDemo.lifecycle;

public class MotarBike {
	private String bikename;
	private double price;
	
	
	public MotarBike() {
		super();
	}

	

	public String getBikename() {
		return bikename;
	}



	public void setBikename(String bikename) {
		this.bikename = bikename;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "MotarBike [bikename=" + bikename + ", price=" + price + "]";
	}
	
	private void init() {
		System.out.println("This bean has been initialized");

	}
	
	private void destroy() {
		System.out.println("This bean has been Destroyed");

	}
	

}
