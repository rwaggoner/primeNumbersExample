package com.ryan.prime;

import java.util.List;

/**
 * This interface provided from the coding example doc
 */
public interface PrimeNumberGenerator {

  List<Integer> generate(int startingValue, int endingValue);
  boolean isPrime(int value);

}
