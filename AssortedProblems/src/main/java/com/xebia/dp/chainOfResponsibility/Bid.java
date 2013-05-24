package com.xebia.dp.chainOfResponsibility;
/*
 * Class representing the bid
 */
public class Bid {

	private int bidAmount;
	
	private boolean bidStatus;
	
	private String bidder;
	
	private String bidApprovedBy;
	
	public Bid(int bidAmount, String bidder) {
		this.bidAmount = bidAmount;
		this.bidder = bidder;
		this.bidStatus= false; 
	}
	
	public int getBidAmount() {
		return bidAmount;
	}
	
	public String getBidApprovedBy() {
		return bidApprovedBy;
	}
	
	public void setBidStatus(boolean bidStatus) {
		this.bidStatus = bidStatus;
	}
	
	public boolean getBidStatus(){
		return bidStatus;
	}
	
	public void setBidApprovedBy(String bidApprovedBy) {
		this.bidApprovedBy = bidApprovedBy;
	}
	
	public String toString(){
		return "Bidder : " + bidder + " BidAmount : "+bidAmount;
	}
}
