package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PullBallTest {
    @Test
    public void testPullBall() {
    	PullBall pullBall = new PullBall();
        assertEquals("I'm bouncing normally!", pullBall.performBounce());
        assertEquals("I can't deflate!", pullBall.performDeflate());
        assertEquals("I can't inflate!", pullBall.performInflate());
        assertEquals("Pull ball is rolling!", pullBall.roll());
    }
}
