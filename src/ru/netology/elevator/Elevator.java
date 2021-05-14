package ru.netology.elevator;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {


    Queue<Integer> elevator = new LinkedList<Integer>();

    public void addLevel(Integer level) {
        elevator.add(level);
    }

    public void displayRoute() {
        System.out.println("The elevator proceeded to the following levels:");
        int timeLevelSec = 5;
        int timeDoorsSec = 10;
        int totalSeconds = 0;
        int currentFloor,  previousFloor = 1;
        System.out.print("Level 1 (always started from 1 level) -> ");
        while (elevator.peek() != null) {
            currentFloor = elevator.peek();
            totalSeconds = totalSeconds + Math.abs(currentFloor - previousFloor) * timeLevelSec + timeDoorsSec;
            System.out.print("Level " + elevator.poll() + " -> ");
            previousFloor = currentFloor;
        }
        totalSeconds += Math.abs(1 - previousFloor) * timeLevelSec;
        System.out.println("Level 1 (returned after route)");
        System.out.println("Time spent by the elevator on the route = " + totalSeconds + " sec");
    }
}
