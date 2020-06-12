package StarBuzz;

public class Decaf extends Beverage{

    public Decaf(){
        this.Description = "Decaf";
    }
    @Override
    public int cost() {
        return 1;
    }
}
