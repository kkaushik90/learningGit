package com.xebia.refactoring.bad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Refactoring101Test {

	private Refactoring101 refactoring101;
	
	@Before
	public void setup(){
		refactoring101 = new Refactoring101();
	}

	@Test
	public void shouldReturnPotentialEnergy(){
		assertEquals(981.0,refactoring101.potentionalEnery(10, 10),0);
	}
}
