package StarBuzz;

public class Espresso extends Beverage{

    public Espresso(){
        this.Description = "Espresso";
    }
    @Override
    public int cost() {
        return 2;
    }
}
