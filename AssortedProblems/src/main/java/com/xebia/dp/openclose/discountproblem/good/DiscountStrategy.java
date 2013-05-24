package com.xebia.dp.openclose.discountproblem.good;

import com.xebia.dp.openclose.discountproblem.bad.Order;

public interface DiscountStrategy {
	
	Double discount(Order order);
}
