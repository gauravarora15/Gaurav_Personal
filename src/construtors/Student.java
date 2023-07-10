package construtors;

public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;
    private Performance performance;

    public void solvesProblem(int count){
        this.totalProblemSolved += count;
        System.out.println(this.name + " solved " + this.totalProblemSolved + " problems");
    }

    //CONSTRUCTOR
    public Student(String name, int id, int totalProblemSolved, Performance performance){
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
        this.performance = performance;
    }
    public Student(Student other, String copyType){
        this.name = other.name;
        this.id = other.id;
        this.totalProblemSolved = other.totalProblemSolved;
        if(copyType == "SHALLOW") {
            this.performance = other.performance;
        }
        else if(copyType == "DEEP"){
            this.performance = new Performance(other.performance);
        }
    }
    public void print(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Total Problems Solved : " + this.totalProblemSolved);
        this.performance.print();
    }
    public void updateName(String name){
        this.name = name;
    }
    public void updatePerformance(int marks, double psp){
        this.performance.updatePerformance(marks, psp);
    }
}
