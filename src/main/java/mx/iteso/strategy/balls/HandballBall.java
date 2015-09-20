package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.SphericalShape;

public class HandballBall extends Ball {
    public HandballBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Handball ball";
        form = new SphericalShape();
    }
}