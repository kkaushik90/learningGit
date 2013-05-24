package com.xebia.dp.openclose.discountproblem.good;

import com.xebia.dp.openclose.discountproblem.bad.Order;

public class CodeADiscountStrategy implements DiscountStrategy {
	private final double RATE = 0.95;

	@Override
	public Double discount(Order order) {
		return RATE * order.getItemTotal();
	}

}
