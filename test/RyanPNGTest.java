import com.ryan.prime.RyanPNG;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This testing class is just for testing some of the specific functions of the number generator implementation by on
 * its own, with being told what to do from a document.
 */
public class RyanPNGTest {

  RyanPNG ryanPNG;

  @BeforeClass
  public void initializeThingsForTests() {
    this.ryanPNG = new RyanPNG();
  }

  /**
   * This will test a range that does not include any prime numbers
   */
  @Test
  public void testInputs_endLessThan2() {

    final int startNumber = 0;
    final int endNumber = 1;

    //Call the number generator and grab the number is returns
    final List<Integer> generatedNumbers = ryanPNG.generate(startNumber, endNumber);

    //Start checking our results to make sure everything is looking ok
    Assert.assertTrue(generatedNumbers.isEmpty());
  }

  @Test
  public void testIsPrime_minTrue() {

    //The number we will use to pass in to our prime check test
    final int primeInputTest = 2;

    //Pass our number into the prime check
    final boolean primeCheckResult = ryanPNG.isPrime(primeInputTest);

    //Ensure the returned result is true
    Assert.assertTrue(primeCheckResult);

  }

  @Test
  public void testIsPrime_True() {

    //The number we will use to pass in to our prime check test
    final int primeInputTest = 61;

    //Pass our number into the prime check
    final boolean primeCheckResult = ryanPNG.isPrime(primeInputTest);

    //Ensure the returned result is true
    Assert.assertTrue(primeCheckResult);

  }

  @Test
  public void testIsPrime_false() {

    //The number we will use to pass in to our prime check test
    final int primeInputTest = 4;

    //Pass our number into the prime check
    final boolean primeCheckResult = ryanPNG.isPrime(primeInputTest);

    //Ensure the returned result is false
    Assert.assertFalse(primeCheckResult);
  }

  @Test
  public void testIsPrime_negativeInput() {

    //The number we will use to pass in to our prime check test
    final int primeInputTest = -1;

    //Pass our number into the prime check
    final boolean primeCheckResult = ryanPNG.isPrime(primeInputTest);

    //Ensure the returned result is false
    Assert.assertFalse(primeCheckResult);
  }

  /**
   * Ensure that you run a test against the range 7900 and 7920 (valid primes are 7901, 7907, 7919). This test will put
   * the start number first, and the end (larger) number last
   */
  @Test
  public void testGivenExampleRange_7900to7920_normalInput() {

    final int startNumber = 7900;
    final int endNumber = 7920;

    //Call the number generator and grab the number is returns
    List<Integer> generatedNumbers = ryanPNG.generate(startNumber, endNumber);

    //Create the list of the answers we will verify with
    final int[] answers = new int[]{7901, 7901, 7919};

    //Start checking our results to make sure everything is looking ok
    Assert.assertTrue(generatedNumbers.size() == answers.length);

    //Check to ensure that the right numbers are in our generated list
    for (int i = 0; i < answers.length; i++) {
      Assert.assertTrue(generatedNumbers.contains(answers[i]));
    }
  }

  /**
   * Ensure that you run a test against the range 7900 and 7920 (valid primes are 7901, 7907, 7919). This test will put
   * the end (larger) number first, and the start number last
   *
   * This should test `The code should handle inverse ranges such that 1-10 and 10-1 are equivalent.`
   */
  @Test
  public void testGivenExampleRange_7900to7920_reversedInput() {

    final int startNumber = 7920;
    final int endNumber = 7900;

    //Call the number generator and grab the number is returns
    List<Integer> generatedNumbers = ryanPNG.generate(startNumber, endNumber);

    //Create the list of the answers we will verify with
    final int[] answers = new int[]{7901, 7901, 7919};

    //Start checking our results to make sure everything is looking ok
    Assert.assertTrue(generatedNumbers.size() == answers.length);

    //Check to ensure that the right numbers are in our generated list
    for (int i = 0; i < answers.length; i++) {
      Assert.assertTrue(generatedNumbers.contains(answers[i]));
    }
  }

  /**
   * The first twenty-six prime numbers are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
   * 73, 79, 83, 89, 97, 101
   *
   * This is a basic test of the first 26 values as well as this line from the document `given range (inclusive of the
   * endpoints).`
   */
  @Test
  public void testFirst_26() {

    final int startNumber = 2;
    final int endNumber = 101;

    //Call the number generator and grab the number is returns
    List<Integer> generatedNumbers = ryanPNG.generate(startNumber, endNumber);

    //Create the list of the answers we will verify with
    final int[] answers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
        83, 89, 97, 101};

    //Start checking our results to make sure everything is looking ok
    Assert.assertTrue(generatedNumbers.size() == answers.length);

    //Check to ensure that the right numbers are in our generated list
    for (int i = 0; i < answers.length; i++) {
      Assert.assertTrue(generatedNumbers.contains(answers[i]));
    }
  }
}
