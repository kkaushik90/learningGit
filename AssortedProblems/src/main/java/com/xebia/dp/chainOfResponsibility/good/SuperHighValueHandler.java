package com.xebia.dp.chainOfResponsibility.good;

import com.xebia.dp.chainOfResponsibility.Bid;

public class SuperHighValueHandler implements BidHandler {

	@Override
	public boolean canHandle(Bid bid) {
		return bid.getBidAmount() <= 2000000 ? true : false;
	}

	@Override
	public void handle(Bid bid) {
		bid.setBidApprovedBy("SuperHighValueHandler");
	}

}
