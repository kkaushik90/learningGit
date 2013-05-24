package com.xebia.dp.observer.bad;

import com.xebia.dp.observer.StockQuote;
/*
 * StockQuotePublisher publishes stock quotes.
 * It has various clients, which need the stock quotes published by the publisher.
 * In future, there may be need to add more clients.
 * Modify the code, so that Publisher remains as decoupled as possible of clients.
 * Also achieve the extensibility
 */
public class StockQuotePublisher {
	private NewsPaperStockQuoteClient newsPaperStockQuoteClient;
	private WebStockQuoteClient webStockQuoteClient;
	private TelevisionStockQuoteClient televisionStockQuoteClient;
	
	private StockQuote stockQuote;
	
	public StockQuotePublisher() {
	}
	
	public void setNewsPaperStockQuoteClient(
			NewsPaperStockQuoteClient newsPaperStockQuoteClient) {
		this.newsPaperStockQuoteClient = newsPaperStockQuoteClient;
	}
	
	public void setTelevisionStockQuoteClient(
			TelevisionStockQuoteClient televisionStockQuoteClient) {
		this.televisionStockQuoteClient = televisionStockQuoteClient;
	}
	
	public void setWebStockQuoteClient(WebStockQuoteClient webStockQuoteClient) {
		this.webStockQuoteClient = webStockQuoteClient;
	}
	
	private void notifyClients(){
		newsPaperStockQuoteClient.publishToNewsPaper(stockQuote);
		webStockQuoteClient.publishToWeb(stockQuote);
		televisionStockQuoteClient.publishToTVChannel(stockQuote);
	}
	
	public void setStockQuote(StockQuote stockQuote){
		this.stockQuote = stockQuote;
		notifyClients();
	}
	
}
