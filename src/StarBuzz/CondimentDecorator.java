package StarBuzz;

import javax.management.Descriptor;

public abstract class CondimentDecorator extends Beverage{
    public CondimentDecorator(){
        this.Description = " with ";
    }
    public abstract String getDescription();
}
