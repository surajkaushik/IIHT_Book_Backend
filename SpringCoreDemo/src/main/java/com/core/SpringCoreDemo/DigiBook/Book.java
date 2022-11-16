package com.core.SpringCoreDemo.DigiBook;

public class Book {
	private String logo;
	private String title;
	private String category;
	private String author;
	private String publishedDate;
	private double price;
	private Boolean active;
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Book(String logo, String title, String category, String author, String publishedDate, double price,
			Boolean active) {
		super();
		this.logo = logo;
		this.title = title;
		this.category = category;
		this.author = author;
		this.publishedDate = publishedDate;
		this.price = price;
		this.active = active;
	}
	
	
	

}
