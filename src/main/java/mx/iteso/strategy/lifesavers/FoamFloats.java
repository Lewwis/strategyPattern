package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class FoamFloats extends Lifesaver {
    public FoamFloats() {
    	deflateBehavior = new NotDeflatable();
        type = "Foam float";
    }
}
