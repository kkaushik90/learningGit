package com.xebia.dp.decorator1.good;

public class FoodItem2 extends FoodItem {
	private int price;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public FoodItem2() {
		this.name = "FoodItem2";
		this.price = 104;
	}

	public int getUnitPrice() {
		return price;
	}
}
