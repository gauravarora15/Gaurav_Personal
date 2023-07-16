package concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World" + Thread.currentThread().getName());
        System.out.println("The next Line");

        PrintSomething printSomething = new PrintSomething();
        Thread t1 = new Thread(printSomething);
        t1.start();
        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
