package introtooops;

public class Main {
    public static void main(String[] args){
        Student chirag =  new Student("Chirag",  1);
        Student anmol =  new Student( "Anmol",  2);
        chirag.solvesProblem(1);
        anmol.solvesProblem(2);
        chirag.solvesProblem(3);
        anmol.solvesProblem(2);
    }
}
