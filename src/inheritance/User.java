package inheritance;

public class User {
    String name = "default";
    private String email = "default@default.com";
    int age = 25;
    User(){
        System.out.println("Inside User Class Simple Constructor");
    }
    User(String name){
        this.name = name;
        System.out.println("Inside User Class Parameterized Constructor");
    }
    void login(){
        System.out.println(name + " is successfully logged in.");
    }
}
