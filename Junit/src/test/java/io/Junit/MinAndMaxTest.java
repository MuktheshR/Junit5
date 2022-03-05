package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//import org.junit.jupiter.api.Test;

public class MinAndMaxTest {
  @Test
  void FindMinMax() {
      MinAndMax minMax2 = new MinAndMax();
      assertAll(
              () -> assertEquals("Min = 1, Max = 4",minMax2.findMinMax(new int[]{1, 2, 3, 4})),
              () -> assertEquals("Min = -5, Max = 20",minMax2.findMinMax(new int[]{10,-5,2,20,17,4})),
              () ->assertEquals("Min = 0, Max = 9", minMax2.findMinMax(new int[]{4,8,0,7,9})),
              () -> assertEquals("Min = -10, Max = 0", minMax2.findMinMax(new int[]{-1,-10,-4,0}))
      );

  }
}