package com.learn.access;
class Overload {
    void display(){
        System.out.println("Display: Default method.");
    }
    void display(String name) {
        System.out.println("Display Name: " + name);
    }
    void display(String name, String location) {
        System.out.println("Display Name: " + name +" Location: " + location);
    }
    String display(String firstName, String loation, String pincode){
        return firstName + " " + loation + " " + pincode;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.display();
        overload.display("FIIT");
        overload.display("FIIT", "Ambattur");
        String responseData = overload.display("FIIT", "Ambattur", "600053");
        System.out.println(responseData);
    }
}
