package com.xebia.dp.chainOfResponsibility.bad;

import com.xebia.dp.chainOfResponsibility.Bid;
/*
 * BidProcessor processes a bid.
 * Depending upon the bid value, there may be different set of actions that need to be done.
 * Also these actions may vary in future, new actions may have to be introduced, already defined need to be 
 * modified.
 * Use design pattern to implement a flexible solution which may be extensible
 */
public class BidProcessor {

	public BidProcessor() {
	}
	
	public void processBid(Bid bid) {
		bid.setBidStatus(true);
		if(bid.getBidAmount()<=2000){
			bid.setBidApprovedBy("LowValueHandler");
			processLowValue(bid);
		}else if(bid.getBidAmount() <= 20000){
			processMediumValue(bid);
			bid.setBidApprovedBy("MediumValueHandler");
		}else if(bid.getBidAmount() <= 200000){
			processHighBidValue(bid);
			bid.setBidApprovedBy("HighValueHandler");			
		}else if(bid.getBidAmount() <= 2000000){
			processSuperHighValue(bid);
			bid.setBidApprovedBy("SuperHighValueHandler");			
		}else{
			bid.setBidStatus(false);
		}
		
	}

	private void processSuperHighValue(Bid bid) {
		// Do N tasks to process super high bid value
	}

	private void processHighBidValue(Bid bid) {
		// Do N tasks to process super high bid value
	}

	private void processMediumValue(Bid bid) {
		// Do N tasks to process super high bid value
	}

	private void processLowValue(Bid bid) {
		// Do N tasks to process super high bid value
	}
}
