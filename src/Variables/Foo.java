package Variables;

public class Foo {
   public final static int FOO_X;
   final int size = 3;
   final int whuffle;

   public Foo(){
       whuffle = 42;
   }
   static {
       FOO_X = (int) Math.random();
   }

   public void doStuff(final int x){

   }

   public void doMore(){
       final int z = 7;
   }

   final void calcWhuffie(){
       //this must never be overridden
   }
}
