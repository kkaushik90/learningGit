package com.xebia.dp.decorator1.bad.foodCombos;

import com.xebia.dp.decorator1.bad.FoodItem2;
import com.xebia.dp.decorator1.bad.FoodItem3;


public class FoodItem2Item3Combo2{
	private FoodItem2 foodItem2;
	private FoodItem3 foodItem3;
	
	
	public FoodItem2Item3Combo2() {
		foodItem3 = new FoodItem3();
		foodItem2 = new FoodItem2();
	}
	
	public int evaluatePrice() {
		return foodItem2.getUnitPrice() + foodItem3.getUnitPrice();
	}
}
