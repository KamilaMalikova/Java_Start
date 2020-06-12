package StarBuzz;

public abstract class Beverage {
    protected String Description = "";

    public String getDescription() {
        return Description;
    }

    public abstract int cost();
}
