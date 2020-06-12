package StarBuzz;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new WhipDecorator(new MochaDecorator(beverage1));
        out.println(beverage1.getDescription()+" $"+beverage1.cost());


    }
}
