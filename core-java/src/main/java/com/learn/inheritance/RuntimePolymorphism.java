package com.learn.inheritance;

class Animal {
    void whoAmI(){
        System.out.println("I am a generic animal");
    }
}
class Cow extends Animal {
    void whoAmI(){
        System.out.println("I am a cow");
    }
}

class Dog extends Animal {
    void whoAmI(){
        System.out.println("I am a dog");
    }
}

class Snake extends Animal {
    void whoAmI(){
        System.out.println("I am a snake");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.whoAmI();
        a = new Cow();
        a.whoAmI();
        a = new Dog();
        a.whoAmI();
        a = new Snake();
        a.whoAmI();
    }
}
