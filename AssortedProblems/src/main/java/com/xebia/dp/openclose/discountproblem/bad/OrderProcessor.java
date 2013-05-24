package com.xebia.dp.openclose.discountproblem.bad;

public class OrderProcessor {

	public Double calculateTotalPriceWithDiscountCode(Order order,
			char discountCode) {

		Double itemTotal = order.getItemTotal();
		Double discountAmount = 0.0;

		switch (discountCode) {
		case 'A':
			discountAmount = 0.95 * itemTotal;
			break;
		case 'B':
			discountAmount = 0.15 * itemTotal;
			break;
		}
		return itemTotal - discountAmount;
	}

}
