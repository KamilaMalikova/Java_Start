package StarBuzz;

public class MilkDecorator extends CondimentDecorator{
    public Beverage beverage;

    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;

    }

    @Override
    public int cost() {
        return 2+beverage.cost();
    }

    @Override
    public String getDescription() {
        return Description;
    }


}
