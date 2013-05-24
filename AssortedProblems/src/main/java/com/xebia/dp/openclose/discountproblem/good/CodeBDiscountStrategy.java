package com.xebia.dp.openclose.discountproblem.good;

import com.xebia.dp.openclose.discountproblem.bad.Order;

public class CodeBDiscountStrategy implements DiscountStrategy {
	private final double RATE = 0.15;

	@Override
	public Double discount(Order order) {
		return RATE * order.getItemTotal();
	}

}
