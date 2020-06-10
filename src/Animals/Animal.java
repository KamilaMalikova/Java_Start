package Animals;

public class Animal {
    public Animal(){
        this(5);
        System.out.println("Making an animal");
    }

    public Animal(int a){
        System.out.println("Making an animal "+a);
    }

}
