package com.xebia.dp.decorator1.bad;

public class FoodItem3 {
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
