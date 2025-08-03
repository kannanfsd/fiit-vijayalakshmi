package com.learn.string;

public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        /*StringBuffer sb = new StringBuffer();
        sb.append("World");
        System.out.println(sb.toString());
        sb.insert(0, "Hello ");
        System.out.println(sb.toString());
        sb.deleteCharAt(4);
        System.out.println(sb.toString());
        sb.insert(4, 'o');
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());*/

        StringBuilder sb = new StringBuilder();
        sb.append("World");
        System.out.println(sb.toString());
        sb.insert(0, "Hello ");
        System.out.println(sb.toString());
        sb.deleteCharAt(4);
        System.out.println(sb.toString());
        sb.insert(4, 'o');
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}
