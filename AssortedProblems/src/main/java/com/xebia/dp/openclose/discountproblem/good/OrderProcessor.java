package com.xebia.dp.openclose.discountproblem.good;

import com.xebia.dp.openclose.discountproblem.bad.Order;

public class OrderProcessor {

	private DiscountStrategy strategy;
	private Order order;

	public OrderProcessor(DiscountStrategy strategy, Order order) {
		this.strategy = strategy;
		this.order = order;
	}

	public Double process() {
		return order.getItemTotal() - strategy.discount(order);
	}
}
