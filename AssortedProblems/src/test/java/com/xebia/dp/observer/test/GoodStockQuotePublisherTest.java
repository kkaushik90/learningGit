package com.xebia.dp.observer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.xebia.dp.observer.good.StockQuote;
import com.xebia.dp.observer.good.StockQuotePublisher;
import static org.junit.Assert.assertEquals;

public class GoodStockQuotePublisherTest {
	
	private StockQuotePublisher goodStockQuotePublisher;
	
	private StockQuote stockQuote;

	@Before
	public void setUp(){
		goodStockQuotePublisher = new StockQuotePublisher();
		stockQuote = new StockQuote(new Date(), "testStockName", 100);
		
	}
	
	@Test
	public void shouldPublishToAllClients(){
		goodStockQuotePublisher.setStockQuote(stockQuote);
		assertEquals(1,stockQuote.countObservers());
	}
	
}
