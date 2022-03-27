import com.ryan.prime.RyanPNG;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * This testing class is just for testing some of the specific functions of the number generator implementation by
 * on its own, with being told what to do from a document.
 */
public class RyanPNGTest {

  /**
   * This will test a range that does not include any prime numbers
   */
  @Test
  public void testInputs_endLessThan2() {

    final int startNumber = 0;
    final int endNumber = 1;

    //Create our new PNG, so we can call the generate method...
    RyanPNG ryanPNG = new RyanPNG();

    //Call the number generator and grab the number is returns
    List<Integer> generatedNumbers = ryanPNG.generate(startNumber, endNumber);

    //Start checking our results to make sure everything is looking ok
    Assert.assertTrue(generatedNumbers.isEmpty());

  }

}
