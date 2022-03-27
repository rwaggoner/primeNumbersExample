import org.junit.Assert;
import org.junit.Test;

public class ExampleTests {

  /**
   * Nothing exciting here. Just a simple test to ensure we can run it, and it passes.
   * This is just part of the initial project setup, and testing that it looks ok.
   */
  @Test
  public void testIsTrueReallyTrue() {

    String trueString = "true";
    Assert.assertTrue(Boolean.parseBoolean(trueString));
  }

}
