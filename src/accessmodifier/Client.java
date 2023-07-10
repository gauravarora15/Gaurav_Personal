package accessmodifier;

public class Client {
    public static void main(String args[]){
        Box b = new Box();
        b.i1 = 1;
        //b.i2 = 1; this wont work as it i2 is private
        b.i3 = 1;
        b.i4 = 1;
    }
}
