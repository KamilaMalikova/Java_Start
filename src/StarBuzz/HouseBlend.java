package StarBuzz;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        this.Description = "House blend";
    }

    @Override
    public int cost() {
        return 1;
    }

}
