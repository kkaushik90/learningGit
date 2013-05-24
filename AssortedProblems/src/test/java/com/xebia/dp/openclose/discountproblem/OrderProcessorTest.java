package com.xebia.dp.openclose.discountproblem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.xebia.dp.openclose.discountproblem.bad.Order;
import com.xebia.dp.openclose.discountproblem.bad.OrderProcessor;

public class OrderProcessorTest {

	private OrderProcessor orderProcessor;

	@Before
	public void setup() {
		orderProcessor = new OrderProcessor();
	}

	@Test
	public void shouldCalculteCorrectTotalAmountForDiscountCodeA() {
		Order order = new Order(new Double(300));
		Double totalAmount = orderProcessor.calculateTotalPriceWithDiscountCode(order, 'A');
		assertEquals(new Double(15), totalAmount);
	}

	@Test
	public void shouldCalculteCorrectTotalAmountForDiscountCodeB() {
		Order order = new Order(new Double(39000));
		Double totalAmount = orderProcessor.calculateTotalPriceWithDiscountCode(order, 'B');
		assertEquals(new Double(33150), totalAmount);
	}
}
