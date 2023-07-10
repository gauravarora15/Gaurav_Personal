package accessmodifier;

public class Box {
    public int i1;//CAN BE ACCESSED FROM ANHYWHERE
    private int i2;//ONLY ACCESSED INSIDE CLASS
    protected int i3;//PACKAGE PRIVATE WITH ACCESS TO THE CHILD CLASSES OUTSIDE PACKAGE TILL ALL LEVELS
    int i4;//PACKAGE PRIVATE: CANT BE ACCESSED OUTSIDE PACKAGE
    static int i5;
    static void doTimePass(){
        i5 = 100;
        //i1 = 2; won't work as non static variable cant be accessed in static method
    }
    void doPassTime(){
        i5 = 100;
        i1 = 2;
    }
}