# elevatorApp
Project intro by DAVID SCAVNICKY. with written challenge. non thread solution

BRIEF DESCRIPTION OF THE PROBLEM

## Author
 - [David Scavnicky](https://github.com/Scadav00)
 
## Description of the problem

Elevator Challenge

The application is an elevator simulation, where the user can set the amount of floors and elevators in a building before starting the simulation.

A request can be made from any floor to go up or down to any other floor to pickup a person. There needs to be a minimum of 2 elevators in the simulation. There can be multiple requests.

When an elevator request is made, the unoccupied elevator closest to it will answer the call, unless an occupied elevator is moving and will pass that floor on its way. The elevators cannot climb above or go below the amount of floors available.

The exception is that if an unoccupied elevator is already stopped at that floor, then it will always have the highest priority answering that call.
 
## Description of the solution

This app simulates elevator. The number of maximum floors is randomly generated and is set not to be less than 4 floors. 
The elevator is capable of moving from the randomly generated floor upon the call of the customer.
Thereafter, the customer has an option to choose his desired destination and this is executed until the eleveator arrives
at the specific destination

## Used technologies

java version 11, libraries: java.io.BufferedReader/InputStreamReader, import java.util.Random;

## Description of the elevator alghorhitm

Two basic options - either elevator is in the same location as the customer or it needs to travel to the customer first.

1.input is read
2.difference of the actual position of elevator and destinationn is taken
3.based on the difference elevator has case UP or DOWN
4.loops the increment

## steps for compilation and debugging

run the program and answer the sentences

note: upon wrong input exception, program terminates with a describing sentence, the app needs to be rerun to try different inputs
