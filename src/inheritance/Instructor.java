package inheritance;

public class Instructor extends User{
    String company = "X";
    Instructor(){
        System.out.println("Inside Instructor Class Simple Constructor");
    }
    Instructor(String name){
        super(name);
        System.out.println("Inside Instructor Class Parameterized Constructor");
    }
    void teach(){
        System.out.println(name + " is teaching");
    }
}
