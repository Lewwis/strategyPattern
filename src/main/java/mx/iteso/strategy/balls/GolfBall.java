package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.SphericalShape;

public class GolfBall extends Ball {
    public GolfBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Golf ball";
        form = new SphericalShape();
    }
}
