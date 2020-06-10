package Animals;

public class Hippo extends Animal{
    int size = 0;
    public Hippo(int dect){
        this();
        size = dect;
        System.out.println("Making a Hippo "+size);
    }
    public Hippo(){
        super();
        System.out.println("Making a Hippo");

    }
}
