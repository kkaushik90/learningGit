package com.xebia.dp.chainOfResponsibility.good;

import java.util.ArrayList;
import java.util.List;

import com.xebia.dp.chainOfResponsibility.Bid;

public class BidProcessor {

	private List<BidHandler> bidHandlers;

	public BidProcessor() {
		bidHandlers = new ArrayList<BidHandler>();
		bidHandlers.add(new LowValueHandler());
		bidHandlers.add(new MediumValueHandler());
		bidHandlers.add(new HighValueHandler());
		bidHandlers.add(new SuperHighValueHandler());
	}

	public void processBid(Bid bid) {
		for (BidHandler handler : bidHandlers) {
			if (handler.canHandle(bid)) {
				bid.setBidStatus(true);
				handler.handle(bid);
				break;
			}
		}
		bid.setBidStatus(false);
		bid.setBidStatus(true);

	}
}
