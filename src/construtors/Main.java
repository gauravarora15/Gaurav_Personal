package construtors;
public class Main {
    public static void main(String[] args) {
        Performance performance = new Performance();
        Student chirag = new Student("Chirag", 1, 10, performance);
        Student anmol = new Student(chirag, "SHALLOW");
        Student anil = new Student(chirag, "DEEP");
        chirag.print();
        System.out.println("-----------");
        anmol.print();
        System.out.println("-----------");
        anil.print();
        System.out.println("-----------");
        anmol.updatePerformance(100, 88.8);
        anil.updatePerformance(95, 90.5);
        anmol.updateName("Anmol");
        anil.updateName("Anil");
        anmol.print();
        System.out.println("-----------");
        chirag.print();
        System.out.println("-----------");
        anil.print();
    }
}