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
    final int firstNumber = getNumberFromUser("first");
    final int secondNumber = getNumberFromUser("second");

    //Pass in the user input, and get a list of prime numbers back
    final List<Integer> primeNumberResults = primeNumberGenerator.generate(firstNumber, secondNumber);

    //Print out our results
    System.out.println(Arrays.toString(primeNumberResults.toArray()));
  }


  /**
   * This helper method will gather and validate user input before we attempt to use any of their input to start our
   * search for random numbers
   */
  private static int getNumberFromUser(String numberAdjective) {

    //The scanner we will use to get some user input...
    final Scanner inputScanner = new Scanner(System.in);

    //This is the boolean that will keep us in our while loop, trying to get a valid number from the user
    //once we have a good number, we will set this to true to escape our loop
    boolean isValidNumber = false;

    //The number that will be retreived from the user, and return out of this method
    int number = 0;

    //Stay in this while loop until we get a valid number
    //With each input, we will check if it is a valid number. If is it not, give feedback and start over
    //If it is a valid number, we will update our boolean, and get out of here
    while (!isValidNumber) {

      //Ask the user nicely to enter in a number
      System.out.printf("Please enter a valid (positive) integer for the %s number of your range to search... \n",
                        numberAdjective);

      //Grab the input from the user, and start looking at it to see if it is valid
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
        System.out.printf(
            "ERROR: The input '%s' does not appear to be a valid number, please enter a positive integer.\n",
            numberInput);

      }
    }

    //Return that fantastic number we got
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
