package com.xebia.dp.observer.bad;

import com.xebia.dp.observer.StockQuote;
/*
 * Publishes the stock quotes in NewsPapers
 */
public class NewsPaperStockQuoteClient {
	
	private StockQuote stockQuoteToPublish;
	
	public void publishToNewsPaper(StockQuote stockQuote){
		this.stockQuoteToPublish = stockQuote;
		/*
		 * Do N number of things before publishing to web
		 */
		System.out.println("NewsPaperStockQuoteClient : "+stockQuoteToPublish);
	}
	/*
	 * Other methods relevant to the news paper Stock quote client
	 */
	public StockQuote getPublishedStockQuote(){
		return stockQuoteToPublish;
	}
}
