package com.ryan.prime;

public class Main {


  public static void main(String[] args) {
    startPrimeNumberGenerator();
  }

  private static void startPrimeNumberGenerator() {

    //Create the first message the user will see when running the application
    final String welcomeMessage = createStartMessage();

    //Print out the instructions to our user
    System.out.println(welcomeMessage);

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
    startMessageBuffer.append("Prime Number Coding Challenge");
    startMessageBuffer.append("\n ********************************************** \n\n");
    startMessageBuffer.append(
        "This small program generator returns an ordered list of all prime numbers in a given range (inclusive of the endpoints).");

    //Return our starting message as a string, to be re used pretty easily
    return startMessageBuffer.toString();

  }
}
