package com.learn.abstracts;

import java.util.Scanner;

abstract class Shape{
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Square extends Shape{
    double length;
    public Square(double length) {
        this.length = length;
    }
    @Override
    double calculateArea() {
        return length*length;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the Length value in the square: ");
        double length = Double.parseDouble(sc.nextLine());
        Shape shape = new Circle(radius);
        shape.setColor("Circle: Green");
        double aoc = shape.calculateArea();
        System.out.printf("\nThe area of the circle is %.2f", aoc);
        System.out.println("\n"+shape.getColor());

        shape = new Square(length);
        shape.setColor("Square: Blue");
        double aos = shape.calculateArea();
        System.out.printf("\nThe area of the square is %.2f", aos);
        System.out.println("\n"+shape.getColor());
        sc.close();
    }
}
