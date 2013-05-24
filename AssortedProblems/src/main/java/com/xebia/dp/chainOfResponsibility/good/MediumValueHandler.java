package com.xebia.dp.chainOfResponsibility.good;

import com.xebia.dp.chainOfResponsibility.Bid;

public class MediumValueHandler implements BidHandler {

	@Override
	public boolean canHandle(Bid bid) {
		return bid.getBidAmount() <= 20000 ? true : false;
	}

	@Override
	public void handle(Bid bid) {
		bid.setBidApprovedBy("MediumValueHandler");
	}

}
