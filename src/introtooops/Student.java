package introtooops;
public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;

    public void solvesProblem(int count){
        this.totalProblemSolved += count;
        System.out.println(this.name + " solved " + this.totalProblemSolved + " problems");
    }

    //CONSTRUCTOR
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}
