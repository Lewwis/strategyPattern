package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IrregularBounceTest {
	@Test
	public void testIrregularBounce(){
		IrregularBounce irregularBounce = new IrregularBounce();
		assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
	}
}
