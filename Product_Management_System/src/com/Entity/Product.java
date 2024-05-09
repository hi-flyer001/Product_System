package com.Entity;

public class Product {
	
	private int id;
	
	private int quantity;
	
	private String name;
	
	public Product() {
		super();
	}
	
	public Product(int id,int quantity,String name) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", name=" + name + "]";
	}
	
	
	

}
