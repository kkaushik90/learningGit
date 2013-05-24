package com.xebia.dp.observer.good;

import java.util.Observable;
import java.util.Observer;

import com.xebia.dp.observer.good.StockQuote;
/*
 * Publishes the stock quotes in NewsPapers
 */
public class NewsPaperStockQuoteClient implements Observer {
	
	private StockQuote stockQuoteToPublish;
	
	@Override
	public void update(Observable o, Object arg) {
		this.stockQuoteToPublish = (StockQuote)arg;
		System.out.println("NewsPaperStockQuoteClient : "+stockQuoteToPublish);
	}
	
	public StockQuote getPublishedStockQuote(){
		return stockQuoteToPublish;
	}
	
}
