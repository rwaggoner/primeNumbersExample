package com.ryan.prime;

import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    startPrimeNumberGenerator();
  }

  private static void startPrimeNumberGenerator() {

    //Create the first message the user will see when running the application
    final String welcomeMessage = createStartMessage();

    final RyanPNG primeNumberGenerator = new RyanPNG();

    //Print out the instructions to our user
    System.out.println(welcomeMessage);

    Scanner inputScanner = new Scanner(System.in);

    //Next we need to collect input from our user(s)
    System.out.println("Please enter the first number of your range to search... ");
    final String fistNumberInput = inputScanner.nextLine();
    final int firstNumber = Integer.parseInt(fistNumberInput);

    System.out.println("Please enter the second number of your range to search... ");
    final String secondNumberInput = inputScanner.nextLine();
    final int secondNumber = Integer.parseInt(secondNumberInput);

    //Pass in the user input, and get a list of prime numbers back
    List<Integer> primeNumberResults = primeNumberGenerator.generate(firstNumber, secondNumber);

    //Print out our results
    System.out.println(Arrays.toString(primeNumberResults.toArray()));
    
  }

  /**
   * Small helper method to create the welcoming / starting message of our program.
   *
   * @return A String with our message
   */
  private static String createStartMessage() {

    //Create our buffer that we will use to build our string

    //Small string messages with instructions
    StringBuffer startMessageBuffer = new StringBuffer();
    startMessageBuffer.append("********************************************** \n");
    startMessageBuffer.append("\t\tPrime Number Coding Challenge\t\t");
    startMessageBuffer.append("\n********************************************** \n\n");
    startMessageBuffer.append(
        "This small program generator returns an ordered list of all prime numbers in a given range (inclusive of the endpoints).");

    //Return our starting message as a string, to be re used pretty easily
    return startMessageBuffer.toString();

  }
}
