package com.xebia.dp.observer.good;


public class StockQuotePublisher {
	
	private StockQuote stockQuote;
	
	public StockQuotePublisher() {
		
	}
	
	private void notifyClients(){
		stockQuote.notifyObservers(stockQuote);
		stockQuote.notifyObservers();
	}
	
	public void setStockQuote(StockQuote stockQuote){
		this.stockQuote = stockQuote;
		stockQuote.setChanged();
		//This can be moved from here. Other observers can also be added as well.
		stockQuote.addObserver(new NewsPaperStockQuoteClient());
		notifyClients();
	}
	
}
