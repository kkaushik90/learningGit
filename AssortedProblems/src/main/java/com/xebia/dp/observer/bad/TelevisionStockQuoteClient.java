package com.xebia.dp.observer.bad;

import com.xebia.dp.observer.StockQuote;
/*
 * Publishes stock quotes on television
 */
public class TelevisionStockQuoteClient {
	
	private StockQuote stockQuoteToPublish;
	
	public void publishToTVChannel(StockQuote stockQuote) {
		this.stockQuoteToPublish = stockQuote;
		/*
		 * Do N number of things before publishing to web
		 */
		System.out.println("TelevisionStockQuoteClient : "+stockQuoteToPublish);
	}
	/*
	 * Other methods relevant to the Television Stock quote client
	 */

	public StockQuote getPublishedStockQuote(){
		return stockQuoteToPublish;
	}
}
