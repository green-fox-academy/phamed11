import com.greenfoxacademy.Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void testingTheSumMethod() {
    Sum basic = new Sum();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(11, 33));
    assertEquals(44, basic.sum(testList));
  }



}