package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class LifeVests extends Lifesaver{
    public LifeVests() {
    	deflateBehavior = new NotDeflatable();
        type = "Life vest";
    }
}