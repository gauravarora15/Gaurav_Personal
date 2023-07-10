package construtors;

public class Performance {
    private int marks;
    private double psp;
    public Performance(){
        this.marks = 10;
        this.psp = 5.5;
    }
    public Performance(Performance performance){
        this.marks = performance.marks;
        this.psp = performance.psp;
    }
    public void updatePerformance(int marks, double psp){
        this.marks = marks;
        this.psp = psp;
    }
    public void print(){
        System.out.println("Marks : " + this.marks);
        System.out.println("Problem Solving Percentage : " + this.psp);
    }
}
