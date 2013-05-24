package com.xebia.dp.observer.good;

import java.util.Date;
import java.util.Observable;

import com.xebia.dp.observer.utils.DateFormatter;
/*
 * Class representing the stock quote. Check out StockQuotePublisher for more details
 */
public class StockQuote extends Observable {

	private Date date;
	private String stockName;
	private int stockPrice;

	public StockQuote(Date date, String stockName, int stockPrice) {
		this.date = date;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public Date getDate() {
		return date;
	}

	public String getStockName() {
		return stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public String toString() {
		return DateFormatter.format(date) + " | " + stockName + " | "
				+ stockPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof StockQuote))
			return false;
		StockQuote stockQuote = (StockQuote) obj;
		if (this.date.equals(stockQuote.getDate())
				&& this.stockPrice == stockQuote.getStockPrice()
				&& this.getStockName().equals(stockQuote.getStockName()))
			return true;
		return false;
	}
	
	public void setChanged(){
		super.setChanged();
	}
}
