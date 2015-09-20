package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;

public class LifesaverCandies extends Lifesaver {
    public LifesaverCandies() {
    	deflateBehavior = new Deflatable();
        type = "Lifesaver candy";
    }
}