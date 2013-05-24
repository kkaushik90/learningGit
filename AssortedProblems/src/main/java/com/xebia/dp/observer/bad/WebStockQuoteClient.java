package com.xebia.dp.observer.bad;

import com.xebia.dp.observer.StockQuote;
/*
 * Publishes stock quotes over web
 */
public class WebStockQuoteClient {
	
	private StockQuote stockQuoteToPublish;
	
	public void publishToWeb(StockQuote stockQuote){
		this.stockQuoteToPublish = stockQuote;
		/*
		 * Do N number of things before publishing to web
		 */
		System.out.println("WebStockQuoteClient : "+stockQuoteToPublish);
	}
	
	/*
	 * Other methods relevant to the web Stock quote client
	 */

	public StockQuote getPublishedStockQuote(){
		return stockQuoteToPublish;
	}
}
