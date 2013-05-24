package com.xebia.dp.chainOfResponsibility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.xebia.dp.chainOfResponsibility.Bid;
import com.xebia.dp.chainOfResponsibility.good.BidProcessor;

public class GoodBidProcessorTest {
	private BidProcessor badBidProcessor;
	
	@Before
	public void setUp(){
		badBidProcessor = new BidProcessor();
	}
	
	@Test
	public void shouldProcessLowValues(){
		Bid bid = new Bid(1000, "TestBidder");
		badBidProcessor.processBid(bid);
		assertEquals(true, bid.getBidStatus());
		assertEquals("LowValueHandler", bid.getBidApprovedBy());
	}
	
	@Test
	public void shouldProcessMediumValues(){
		Bid bid = new Bid(10000, "TestBidder");
		badBidProcessor.processBid(bid);
		assertEquals(true, bid.getBidStatus());
		assertEquals("MediumValueHandler", bid.getBidApprovedBy());
	}
	
	@Test
	public void shouldProcessHighValue(){
		Bid bid = new Bid(100000, "TestBidder");
		badBidProcessor.processBid(bid);
		assertEquals(true, bid.getBidStatus());
		assertEquals("HighValueHandler", bid.getBidApprovedBy());
	}

	@Test
	public void shouldProcessSuperHighValue(){
		Bid bid = new Bid(1000000, "TestBidder");
		badBidProcessor.processBid(bid);
		assertEquals(true, bid.getBidStatus());
		assertEquals("SuperHighValueHandler", bid.getBidApprovedBy());
	}
}
