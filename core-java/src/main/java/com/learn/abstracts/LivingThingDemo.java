package com.learn.abstracts;

abstract class LivingThing {
    String message;
    //concrete method.
    void displayMessage() {
        System.out.println(message);
    }
    //abstract method.
    abstract void walk();
}
class Human extends LivingThing {
    @Override
    void walk() {
        System.out.println("Human walks with two legs.");
    }
}
class Dog extends LivingThing {
    @Override
    void walk() {
        System.out.println("Dog walks with four legs.");
    }
}

public class LivingThingDemo {
    public static void main(String[] args) {
        LivingThing livingThing = new Human();
        livingThing.message = "Instantiate via Human class.";
        livingThing.displayMessage();
        livingThing.walk();

        livingThing = new Dog();
        livingThing.message = "Instantiate via Dog class.";
        livingThing.displayMessage();
        livingThing.walk();
    }
}
