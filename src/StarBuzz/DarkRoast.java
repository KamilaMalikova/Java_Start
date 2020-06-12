package StarBuzz;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.Description = "Dark roast";
    }

    @Override
    public int cost() {
        return 2;
    }

}
