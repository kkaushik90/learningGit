package com.xebia.dp.observer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.xebia.dp.observer.StockQuote;
import com.xebia.dp.observer.bad.NewsPaperStockQuoteClient;
import com.xebia.dp.observer.bad.StockQuotePublisher;
import com.xebia.dp.observer.bad.TelevisionStockQuoteClient;
import com.xebia.dp.observer.bad.WebStockQuoteClient;

import static org.junit.Assert.assertEquals;

public class BadStockQuotePublisherTest {
	
	private StockQuotePublisher badStockQuotePublisher;
	private NewsPaperStockQuoteClient newsPaperStockQuoteClient;
	private TelevisionStockQuoteClient televisionStockQuoteClient;
	private WebStockQuoteClient webStockQuoteClient;
	private StockQuote stockQuote;

	@Before
	public void setUp(){
		badStockQuotePublisher = new StockQuotePublisher();
		newsPaperStockQuoteClient = new NewsPaperStockQuoteClient();
		televisionStockQuoteClient = new TelevisionStockQuoteClient();
		webStockQuoteClient = new WebStockQuoteClient();
		badStockQuotePublisher.setNewsPaperStockQuoteClient(newsPaperStockQuoteClient);
		badStockQuotePublisher.setTelevisionStockQuoteClient(televisionStockQuoteClient);
		badStockQuotePublisher.setWebStockQuoteClient(webStockQuoteClient);
		stockQuote = new StockQuote(new Date(), "testStockName", 100);
	}
	
	@Test
	public void shouldPublishToAllClients(){
		badStockQuotePublisher.setStockQuote(stockQuote);
		assertEquals(stockQuote, newsPaperStockQuoteClient.getPublishedStockQuote());
		assertEquals(stockQuote, webStockQuoteClient.getPublishedStockQuote());
		assertEquals(stockQuote, televisionStockQuoteClient.getPublishedStockQuote());
	}
	
}
