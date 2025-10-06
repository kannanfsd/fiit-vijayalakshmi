package com.learn.collection.list;

import java.util.*;

public class FirstCollectionDemo {
    public static void main(String[] args) {
        List fruits = new ArrayList();  //stack
        fruits.add("grapes");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("kiwi");
        System.out.println("List:"+ fruits);
        System.out.println("Fruits List size: "+fruits.size());

        Set fruitSet = new TreeSet();   // Heap
        fruitSet.add("grapes");
        fruitSet.add("orange");
        fruitSet.add("banana");
        fruitSet.add("apple");
        fruitSet.add("kiwi");
        System.out.println("Set: "+fruitSet);
        Iterator it = fruitSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
