package com.xebia.dp.decorator1.bad;

public class FoodItem1 {
	private int price;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public FoodItem1() {
		this.name = "FoodItem1";
		this.price = 100;
	}

	public int getUnitPrice() {
		return price;
	}
}
