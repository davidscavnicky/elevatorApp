package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to the elevator app!");
        new Elevator().runElevator();
    }
}
// the app calls elevator from random position to the
// customer and thereafter sends the lift to desired location

class Elevator {
//    public int floor = 0;
    public static int maxFloor = getRandomNumberInRange(4,10);
    public static int originFloor;

    public void runElevator() {
        originFloor = getRandomNumberInRange(0, maxFloor);

        System.out.println("The generated building has " + maxFloor + " floors.");
        System.out.println("At the moment, the elevator is on the " + originFloor + "th floor.");
        System.out.println("Please, write your floor's number: ");

        int currentFloor = readFloorInteger();

        if (originFloor == currentFloor) {
            movementInTheElevator();
        } else {
            movement(currentFloor);
            movementInTheElevator();
        }
    }
    private void movementInTheElevator() {
        System.out.println("The doors are opened. Please, enter your destination's floor: ");
        int nextFloor = readFloorInteger();
        movement(nextFloor);
        System.out.println("You have arrived at your destination.");
    }

    private void movement(int currentFloor) {
        if (currentFloor < originFloor) {
            moveDown(currentFloor);
        }else {
            moveUp(currentFloor);
        }
    }
    private void moveUp(int currentFloor){
        while (originFloor < currentFloor) {
            originFloor++;
            System.out.println(originFloor);
        }
    }

    private void moveDown(int currentFloor){
        while (originFloor > currentFloor) {
            originFloor--;
            System.out.println(originFloor);
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private int readFloorInteger() {
//        int someInput;
//        Scanner scanner = new Scanner(System.in);
//        someInput = scanner.nextInt();
//        return someInput;

//        int someInput;
//        Scanner scanner = new Scanner(System.in);
        int someInput = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            someInput = scanner.nextInt();
//            return someInput;
        } catch (Exception e) {
            System.out.println("The input value is not a valid integer.");
            System.exit(0);
        }
        return someInput;
    }

}

enum Direction {
    UP,DOWN
}