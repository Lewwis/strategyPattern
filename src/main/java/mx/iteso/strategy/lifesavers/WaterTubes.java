package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;

public class WaterTubes extends Lifesaver {
    public WaterTubes() {
    	deflateBehavior = new Deflatable();
        type = "Water tube";
    }
}
