package com.ryan.prime;

import java.util.ArrayList;
import java.util.List;

public class RyanPNG implements PrimeNumberGenerator {

  @Override
  public List<Integer> generate(int startingValue, int endingValue) {

    //Create a list to hold all of the prime number we (might) find
    List<Integer> primeNumbersGenerated = new ArrayList<>();

    int startingValueSorted;
    int endingValueSorted;

    //Sort the inputs, just so we can make assumptions about them in the future
    //to make our loops and such easier
    if (startingValue <= endingValue) {
      startingValueSorted = startingValue;
      endingValueSorted = endingValue;
    } else {
      startingValueSorted = endingValue;
      endingValueSorted = startingValue;
    }

    while (startingValueSorted <= endingValueSorted) {
      if (isPrime(startingValueSorted)) {

        //If the number was prime, add it to our growing list
        primeNumbersGenerated.add(startingValueSorted);
      }

      startingValueSorted++;
    }

    // Return the list of prime numbers we, hopefully, found
    return primeNumbersGenerated;

  }

  @Override
  public boolean isPrime(int value) {

    //This is just part of the definition of a prime number...must be > 1
    if (value <= 1) {
      return false;
    }

    //If the number is 3 or less (2) we don't need to do math here
    //the previous if tells us that if we go into this if statement, the number has to be a 3 or a 2
    if (value <= 3) {
      return true;
    }

    //Next do some lighter math to weed out as many numbers as quick as possible
    if (value % 2 == 0) {
      return false;
    }

    if (value % 3 == 0) {
      return false;
    }

    //This is just the general and generic way we look for and check primes
    for (int i = 5; i * i <= value; i = i + 6) {
      if (value % i == 0) {
        return false;
      }

      if (value % (i + 2) == 0) {
        return false;
      }
    }

    return true;
  }
}

