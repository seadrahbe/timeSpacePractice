import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  @Test
  void testMostCommonTimeEfficient() {

    int[] testArr = {1, -2, 3, 4, 1, -2, 1};

    int actual = Practice.mostCommonTimeEfficient(testArr);

    assertEquals(1, actual);
  }

  @Test
  void testMostCommonTimeEfficientSame() {

    int[] testArr = {1, 2, 1, 2, 1, 2};

    int actual = Practice.mostCommonTimeEfficient(testArr);

    assertEquals(1, actual);
  }

  @Test
  void testMostCommonTimeEfficientEmpty() {

    int[] testArr = {};

    int actual = Practice.mostCommonTimeEfficient(testArr);

    assertEquals(0, actual);
  }

  @Test
  void testMostCommonTimeEfficientOneValue() {

    int[] testArr = {1};

    int actual = Practice.mostCommonTimeEfficient(testArr);

    assertEquals(1, actual);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
