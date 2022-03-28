package com.ryan.prime;

import java.util.List;

public class RyanPNG implements PrimeNumberGenerator {

  @Override
  public List<Integer> generate(int startingValue, int endingValue) {
    return null;
  }

  @Override
  public boolean isPrime(int value) {

    //This is just part of the definition of a prime number...must be > 1
    if (value <= 1) {
      return false;
    }

    final double sqrtOfValue = Math.sqrt(value);

    //This is just the general and generic way we look for and check primes
    for (int i = 2; i < sqrtOfValue; i++) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;
  }
}

