package com.learn.interfaces;

interface  IVehicle{
    void drive();
    void turnLeft();
    void brake();
}
interface IPublicTransport {
    void getNumberOfPeople();
}
class MotorizedVehicle {
    void checkMotor() {
        System.out.println("The motor of the vehicle is in good condition");
    }
}
class Car extends MotorizedVehicle implements IVehicle{
    @Override
    public void drive() {
        System.out.println("The car is in drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("The car is turning left mode");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking mode");
    }
}
class Train implements IVehicle, IPublicTransport {
    @Override
    public void drive() {
        System.out.println("The train is in drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("The train is turning left mode");
    }

    @Override
    public void brake() {
        System.out.println("The train is braking mode");
    }

    @Override
    public void getNumberOfPeople() {
        System.out.println("The number of people is in train is 1200");
    }
}
public class SecondInterfaceDemo {
    public static void main(String[] args) {
        IVehicle vehicle = new Car();
        vehicle.drive();
        vehicle.turnLeft();
        vehicle.brake();
        Car car = new Car();
        car.checkMotor();

        vehicle = new Train();
        vehicle.drive();
        vehicle.turnLeft();
        vehicle.brake();
        IPublicTransport transport = new Train();
        transport.getNumberOfPeople();
    }
}
