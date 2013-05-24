package com.xebia.dp.decorator1.good;

import java.util.List;

public class FoodItemsComboDecorator extends FoodItem {
	
	private List<FoodItem> foodItems;
	
	public FoodItemsComboDecorator(List<FoodItem> foodItems) {
		super();
		this.foodItems = foodItems;
	}

	@Override
	public int getUnitPrice() {
		int price = 0;
		for(FoodItem item : foodItems){
			price+=item.getUnitPrice();
		}
		return price;
	}

}
