package com.xebia.dp.chainOfResponsibility.good;

import com.xebia.dp.chainOfResponsibility.Bid;

public class LowValueHandler implements BidHandler {

	@Override
	public boolean canHandle(Bid bid) {
		return bid.getBidAmount() <= 2000 ? true : false;
	}

	@Override
	public void handle(Bid bid) {
		bid.setBidApprovedBy("LowValueHandler");
	}

}
