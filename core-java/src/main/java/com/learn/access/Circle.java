package com.learn.access;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    public static double calculateArea(double radius) {
        double aoc = Math.PI * radius * radius;
        return aoc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = Double.parseDouble(sc.nextLine());
        //Circle circle = new Circle();
        //DecimalFormat df = new DecimalFormat("#.##");
        //System.out.println("Area of circle: "+df.format(calculateArea(radius)));
        System.out.printf("Area of circle: %.2f", calculateArea(radius));
        sc.close();
    }
}
