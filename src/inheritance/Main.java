package inheritance;
import java.util.List;
public class Main {
    private static void printName(List<User> users) {
        for(User u: users) {
            System.out.println(u.name);
        }
    }
    public static void main(String[] args){
        Instructor instructor =  new Instructor();
        Instructor instructor1 = new Instructor("Gaurav");
        instructor.login();
        instructor.teach();
        instructor1.login();
        instructor1.teach();
        User instructor2 = new Instructor("Anshuman");
        // name, age, email, login, teach
        instructor2.login();
        //instructor.teach();
        System.out.println(((Instructor)instructor2).company);
        //Instructor notInstructor = new User();
        if(instructor2 instanceof User){
            System.out.println("Instructor2 is instance of User");
        }
        if(instructor2 instanceof Instructor){
            System.out.println("Instructor2 is instance of Instructor");
        }
        if(instructor instanceof User){
            System.out.println("Instructor is instance of User");
        }
        if(instructor instanceof Instructor){
            System.out.println("Instructor is instance of Instructor");
        }
        printName(List.of(new Student("Sahil"), new Instructor("Rahul"), instructor));
    }
}