package com.xebia.dp.decorator1.good;

public class FoodItem3 extends FoodItem {
	private int price;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public FoodItem3() {
		this.name = "FoodItem3";
		this.price = 106;
	}

	public int getUnitPrice() {
		return price;
	}
}
