package com.xebia.dp.chainOfResponsibility.good;

import com.xebia.dp.chainOfResponsibility.Bid;

public class HighValueHandler implements BidHandler {

	@Override
	public boolean canHandle(Bid bid) {
		return bid.getBidAmount() <= 200000 ? true : false;
	}

	@Override
	public void handle(Bid bid) {
		bid.setBidApprovedBy("HighValueHandler");
	}

}
