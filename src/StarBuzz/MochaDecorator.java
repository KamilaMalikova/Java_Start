package StarBuzz;

public class MochaDecorator extends CondimentDecorator{
    public Beverage beverage;

    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
        this.Description = " with mocha";
    }

    @Override
    public int cost() {
        return 2+beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+Description;
    }


}
