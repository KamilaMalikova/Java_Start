package StarBuzz;

public class WhipDecorator extends CondimentDecorator{
    public Beverage beverage;

    public WhipDecorator(Beverage beverage){
        this.beverage = beverage;
        this.Description = " with whip";
    }

    @Override
    public int cost() {
        return 3+beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+Description;
    }

}
