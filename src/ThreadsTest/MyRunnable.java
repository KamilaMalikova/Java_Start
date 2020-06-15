package ThreadsTest;

import static java.lang.System.out;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        go();
    }
    public void go(){
        try {
            out.println("I'm going to sleep");
            Thread.sleep(2000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore(){
        out.println("top o' the stack");
    }
}
