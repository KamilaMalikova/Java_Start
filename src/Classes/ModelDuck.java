package Classes;

public class ModelDuck extends Duck implements FlyBehavior{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    @Override
    public void fly() {
        System.out.println("I implement fly behavior!");
    }
}
