package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalBounceTest {
	@Test
	public void testIrregularBounce(){
		NormalBounce normalBounce = new NormalBounce();
		assertEquals("I'm bouncing normally!", normalBounce.bounce());
	}
}
