package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasketballBallTest {
    @Test
    public void testBasketballBall() {
        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("Basketball ball is rolling!", basketballBall.roll());
    }
}