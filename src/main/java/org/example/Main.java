package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to the elevator app!");
        new Elevator().runElevator();
    }
}
// the app calls elevator from random position to the
// customer and thereafter sends the lift to the customer's desired location

class Elevator {
    public static int minimumFloorNumber = 4;
    public static int maxFloor = getRandomNumberInRange(minimumFloorNumber,10);
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
            movementOfTheElevator(currentFloor);
            movementInTheElevator();
        }
    }
    private void movementInTheElevator() {
        System.out.println("The doors are opened. Please, enter your destination's floor: ");
        int nextFloor = readFloorInteger();
        movementOfTheElevator(nextFloor);
        System.out.println("You have arrived at your destination.");
    }

    private void movementOfTheElevator(int currentFloor) {
        switch(directionChoice(currentFloor)) {
            case UP:
                System.out.println("The elevator is on the way UP.");
                while (originFloor < currentFloor) {
                    originFloor++;
                    printAndSleep(originFloor);
                }
                break;
            case DOWN:
                System.out.println("The elevator is on the way DOWN.");
                while (originFloor > currentFloor) {
                    originFloor--;
                    printAndSleep(originFloor);
                }
        }
    }
    private Direction directionChoice(int currentFloor){
        int change = currentFloor - originFloor;
        if (change >0) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }

    private void printAndSleep(int floorNumber) {
        System.out.println(floorNumber);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
        String someInput = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            someInput = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("The input value is not a valid integer.");
            System.exit(0);
        }
        return Integer.parseInt(someInput);
    }

    enum Direction {
        UP,DOWN
    }

}