package concurrency.framework;

public class NumberPrinter implements Runnable{
    public int i;
    public NumberPrinter(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("I am running in NumberPrinter on thread -: " + Thread.currentThread().getName());
        System.out.println(i);
    }
}
