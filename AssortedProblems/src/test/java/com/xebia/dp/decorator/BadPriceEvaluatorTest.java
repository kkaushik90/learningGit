package com.xebia.dp.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xebia.dp.decorator1.bad.foodCombos.FoodItem1Item2Combo1;
import com.xebia.dp.decorator1.bad.foodCombos.FoodItem2Item3Combo2;

public class BadPriceEvaluatorTest {
	@Test
	public void shouldEvaluateFoodItem1FoodItem2Combo(){
		assertEquals((new FoodItem1Item2Combo1()).evaluatePrice(), 100+104);
	}
	
	@Test
	public void shouldEvaluateFoodItem2FoodItem3Combo(){
		assertEquals((new FoodItem2Item3Combo2()).evaluatePrice(), 104+106);
	}
}
