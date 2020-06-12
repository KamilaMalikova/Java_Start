package StarBuzz;

public class SoyDecorator extends CondimentDecorator{
    public Beverage beverage;

    public SoyDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 1+beverage.cost();
    }

    @Override
    public String getDescription() {
        return Description;
    }


}
