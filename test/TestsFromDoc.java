import com.ryan.prime.RyanPNG;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * This test class is for tests that are explicitly called out in the code exercise document
 */
public class TestsFromDoc {

  /**
   * Ensure that you run a test against the range 7900 and 7920 (valid primes are 7901, 7907, 7919). This test will put
   * the start number first, and the end (larger) number last
   */
  @Test
  public void testGivenExampleRange_7900to7920_normalInput() {

    final int startNumber = 7900;
    final int endNumber = 7920;

    //Create our new PNG, so we can call the generate method...
    RyanPNG ryanPNG = new RyanPNG();

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

    //Create our new PNG, so we can call the generate method...
    RyanPNG ryanPNG = new RyanPNG();

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

    //Create our new PNG, so we can call the generate method...
    RyanPNG ryanPNG = new RyanPNG();

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

