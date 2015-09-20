package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationCapacityBehavior;

public abstract class Lifesaver {
	
    public DeflateBehavior deflateBehavior;
    public String type;
    public FlotationCapacityBehavior floatingCapacity;
    
    public String inflating() {
        return deflateBehavior.inflate();
    }
    public String deflating() {
        return deflateBehavior.deflate();
    }
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + type;
    }
}
