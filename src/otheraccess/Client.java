package otheraccess;

import accessmodifier.Box;

public class Client extends accessmodifier.Box{
    public static void main(String args[]){
        Box b = new Box();
        b.i1 = 1;
        //b.i2 = 1; this wont work as it i2 is private
        //b.i3 = 1; this wont work as it i3 is protected
        //b.i4 = 1; this wont work as it i4 is package private
    }
}
