package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoccerBallTest {
    @Test
    public void testSoccerBall() {
    	SoccerBall soccerBall = new SoccerBall();
        assertEquals("I'm bouncing normally!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
