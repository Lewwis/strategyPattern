package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandballBallTest {
    @Test
    public void testHandballBall() {
        HandballBall handball = new HandballBall();
        assertEquals("I'm bouncing normally!", handball.performBounce());
        assertEquals("I'm deflating!", handball.performDeflate());
        assertEquals("I'm inflating!", handball.performInflate());
        assertEquals("Handball ball is rolling!", handball.roll());
    }
}
