package com.xebia.dp.openclose.discountproblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xebia.dp.openclose.discountproblem.bad.Order;
import com.xebia.dp.openclose.discountproblem.good.CodeADiscountStrategy;
import com.xebia.dp.openclose.discountproblem.good.CodeBDiscountStrategy;
import com.xebia.dp.openclose.discountproblem.good.OrderProcessor;

public class OrderProcessorGoodTest {

	private OrderProcessor orderProcessor;

	@Test
	public void shouldCalculteCorrectTotalAmountForDiscountCodeA() {
		Order order = new Order(new Double(300));
		orderProcessor = new OrderProcessor(new CodeADiscountStrategy(), order);
		Double totalAmount = orderProcessor.process();
		assertEquals(new Double(15), totalAmount);
	}

	@Test
	public void shouldCalculteCorrectTotalAmountForDiscountCodeB() {
		Order order = new Order(new Double(39000));
		orderProcessor = new OrderProcessor(new CodeBDiscountStrategy(), order);
		Double totalAmount = orderProcessor.process();
		assertEquals(new Double(33150), totalAmount);
	}
}
