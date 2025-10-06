package com.learn.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        var doubleNumbers = new ArrayList<Double>();
        List<String> countryNames = new  ArrayList<>();
        System.out.println("Size of ArrayList: "+countryNames.size());
        countryNames.add("France");
        countryNames.add("Germany");
        countryNames.add("Italy");
        countryNames.add("India");
        countryNames.add("United Kingdom");
        System.out.println(countryNames);
        countryNames.add(1, "Srilanka");
        System.out.println(countryNames);
        countryNames.set(3, "Spain");
        System.out.println(countryNames);
        countryNames.remove("France");
        System.out.println(countryNames);
        // Array[] vs ArrayList
        String[] countries = countryNames.toArray(new String[countryNames.size()]);
        for(String country : countries){
            System.out.println(country);
        }
        String[] fruitsArray = {"kiwi", "gingerbread", "apple", "orange", "banana"};
        fruitsList = Arrays.asList(fruitsArray);
        System.out.println("Before Sort: "+fruitsList);
        Collections.sort(fruitsList);
        System.out.println("After Sort: "+fruitsList);
    }
}
