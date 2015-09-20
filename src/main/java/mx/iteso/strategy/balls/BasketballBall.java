package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.SphericalShape;

public class BasketballBall extends Ball {
    public BasketballBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Basketball ball";
        form = new SphericalShape();
    }
}