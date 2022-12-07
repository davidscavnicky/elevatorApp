# elevatorApp
Visma project intro to bootcamp.

## Author
 - [David Scavnicky](https://github.com/Scadav00)

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
