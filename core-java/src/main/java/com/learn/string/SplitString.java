package com.learn.string;

public class SplitString {
    public static void main(String[] args) {
        String fruits = "apple,orange,grapes,banana";
        String[] fruitsArray = fruits.split(",");
        System.out.println(fruitsArray.length);

        String joinResult = String.join(" ", fruitsArray);
        System.out.println(joinResult);
    }
}
