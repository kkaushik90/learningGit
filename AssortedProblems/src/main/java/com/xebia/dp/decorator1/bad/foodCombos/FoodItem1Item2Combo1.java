package com.xebia.dp.decorator1.bad.foodCombos;

import com.xebia.dp.decorator1.bad.FoodItem1;
import com.xebia.dp.decorator1.bad.FoodItem2;


public class FoodItem1Item2Combo1{
	
	private FoodItem1 foodItem1;
	private FoodItem2 foodItem2;
	
	public FoodItem1Item2Combo1() {
		foodItem1 = new FoodItem1();
		foodItem2 = new FoodItem2();
	}
	
	public int evaluatePrice() {
		return foodItem1.getUnitPrice() + foodItem2.getUnitPrice();
	}
	
}
