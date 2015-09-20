package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.SphericalShape;

public class PullBall extends Ball {
    public PullBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Pull ball";
        form = new SphericalShape();
    }
}