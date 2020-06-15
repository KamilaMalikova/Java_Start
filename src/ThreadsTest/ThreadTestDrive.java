package ThreadsTest;

import static java.lang.System.out;
public class ThreadTestDrive implements Runnable{
    public static void main(String[] args) {
            Runnable threadJob = new MyRunnable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
            out.println("back in main");

            ThreadTestDrive runner = new ThreadTestDrive();
            Thread alpha = new Thread(runner);
            Thread betta = new Thread(runner);
            alpha.setName("Alpha thread");
            betta.setName("Betta thread");
            alpha.start();
            betta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<25; i++){
            out.println(Thread.currentThread().getName());
        }
    }
}
