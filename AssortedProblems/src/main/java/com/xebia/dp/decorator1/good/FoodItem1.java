package com.xebia.dp.decorator1.good;

public class FoodItem1 extends FoodItem {
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
