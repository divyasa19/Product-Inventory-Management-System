package com.itvedant.models;

public class Product {
	//instance variables
	private int productId;
	private String productName,category;
	private double price;
	private int quantity;
	
	//default constructor
	public Product() {
		System.out.println("Product class object is created");
	}

	//parameterized constructor
	public Product(int productId, String productName, String category, double price, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	//getters and setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	toString() method
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
