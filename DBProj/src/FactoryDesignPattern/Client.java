package FactoryDesignPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String carName;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the car you want : ");
        carName = s.next();
        Car c = CarFactory.getCar(carName);
        c.printInfo();
    }
}
