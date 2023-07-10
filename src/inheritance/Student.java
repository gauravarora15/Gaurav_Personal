package inheritance;

public class Student extends User{
    Student(){
        System.out.println("Inside student Class Simple Constructor");
    }
    Student(String name){
        super(name);
        System.out.println("Inside student Class Parameterized Constructor");
    }
    void solveProblem(){
        System.out.println(name + "is solving Problem");
    }
}
