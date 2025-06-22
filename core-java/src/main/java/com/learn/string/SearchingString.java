package com.learn.string;

public class SearchingString {
    public static void main(String[] args) {
        String data = "Hello, world!";
        int index = data.indexOf("world");
        System.out.println(index);

        boolean flag = data.contains("world");
        System.out.println(flag);

        boolean flag2 = data.startsWith("Hello");
        boolean flag3 = data.endsWith("!");
        System.out.println(flag2);
        System.out.println(flag3);

        boolean flag4 = data.matches(".*hi*.");
        System.out.println(flag4);

        String data1 = "   java   programming      ";
        System.out.println(data1);
        System.out.println(data1.trim());

        System.out.println(data);
        System.out.println(data.replace('o','*'));
        System.out.println(data.replace("world","Java!"));

        String data2 = "Java is a funny programming language.";
        System.out.println(data2.replaceAll("a|e|i|o|u", "*"));
        String data3 = "apple orange grapes apple orange grapes";
        System.out.println(data3.replaceFirst("apple","banana"  ));

    }
}
