package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GolfBallTest {
    @Test
    public void testGolfBall() {
    	GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing normally!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }
}
