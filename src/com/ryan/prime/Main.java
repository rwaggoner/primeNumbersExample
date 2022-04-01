package com.ryan.prime;

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

    //Use our helper method to get some user input
    int firstNumber = getNumberFromUser("first");
    int secondNumber = getNumberFromUser("second");

    //Pass in the user input, and get a list of prime numbers back
    List<Integer> primeNumberResults = primeNumberGenerator.generate(firstNumber, secondNumber);

    //Print out our results
    System.out.println(Arrays.toString(primeNumberResults.toArray()));
  }


  /**
   * This helper method will gather and validate user input before we attempt
   * to use any of their input to start our search for random numbers
   * @param numberAdjective
   * @return
   */
  private static int getNumberFromUser(String numberAdjective) {

    Scanner inputScanner = new Scanner(System.in);
    Boolean isValidNumber = false;
    int number = 0;

    while (!isValidNumber) {

      //Ask the user nicely to enter in a number
      System.out.printf("Please enter a valid (positive) integer for the %s number of your range to search... \n",
                        numberAdjective);

      final String numberInput = inputScanner.nextLine();

      try {
        //First let's see if the input is even an integer
        number = Integer.parseInt(numberInput);

        //If we made it this far, then we know we at least have a number
        //Let's check to make sure its a valid number
        if (number < 0) {

          //Something bad happened, so let's tell the user, then try again
          System.out.printf("ERROR: The input '%s' does not appear a positive integer. \n", numberInput);

        } else {

          //What a great number they have input, our job here is done.
          isValidNumber = true;
        }

      } catch (Exception e) {
        //Something bad happened, so let's tell the user, then try again
        System.out.printf("ERROR: The input '%s' does not appear to be a valid number, please enter a positive integer.\n",
                          numberInput);

      }
    }
    return number;
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
