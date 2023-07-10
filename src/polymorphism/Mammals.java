package polymorphism;
public class Mammals extends Animal{
    Mammals() {
        this.a = 10;
    }
    @Override
    void print() {
        System.out.println("Printing from class Mammals: " + a);
    }
}