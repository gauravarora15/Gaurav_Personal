package assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        Adder adder = new Adder();
        Thread t1 = new Thread(adder);
        t1.start();
        Subtractor subtractor = new Subtractor();
        Thread t2 = new Thread(subtractor);
        t2.start();
    }
}
