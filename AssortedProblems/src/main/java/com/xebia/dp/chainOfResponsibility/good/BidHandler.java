package com.xebia.dp.chainOfResponsibility.good;

import com.xebia.dp.chainOfResponsibility.Bid;

public interface BidHandler {
	boolean canHandle(Bid bid);

	void handle(Bid bid);
}
