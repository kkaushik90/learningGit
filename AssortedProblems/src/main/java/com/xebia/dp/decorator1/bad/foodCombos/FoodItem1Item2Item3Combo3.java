package com.xebia.dp.decorator1.bad.foodCombos;

import com.xebia.dp.decorator1.bad.FoodItem1;
import com.xebia.dp.decorator1.bad.FoodItem2;
import com.xebia.dp.decorator1.bad.FoodItem3;


public class FoodItem1Item2Item3Combo3{
	
	private FoodItem1 foodItem1;
	private FoodItem2 foodItem2;
	private FoodItem3 foodItem3;
	
	public FoodItem1Item2Item3Combo3() {
		foodItem1 = new FoodItem1();
		foodItem2 = new FoodItem2();
		foodItem3 = new FoodItem3();
	}
	
	public int evaluatePrice() {
		return foodItem1.getUnitPrice() + foodItem2.getUnitPrice() + foodItem3.getUnitPrice();
	}
	
}
