package ru.netology.elevator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        Elevator elevatorRoute = new Elevator();

        while (true) {
            System.out.println("Enter level number 1-25 or 0 for exit:");
            int input = myScan.nextInt();
            if (input == 0) break;
            if ((input > 25) || (input < 0)) {
                System.out.println("!!! There is no such floor in the house !!!");
            } else {
                elevatorRoute.addLevel(input);
            }
        }

        elevatorRoute.displayRoute();

    }
}
