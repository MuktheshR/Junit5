package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMax2Test {
	 @Test
	    void findMinMax2() {
	        MinMax2 minMax2 = new MinMax2();
	        assertAll(
	                () -> assertEquals("Min = 1, Max = 4", minMax2.findMinMax2(new int[]{1, 2, 3, 4})),
	                () -> assertEquals("Min = -5, Max = 20", minMax2.findMinMax2(new int[]{10,-5,2,20,17,4})),
	                () ->assertEquals("Min = 0, Max = 9", minMax2.findMinMax2(new int[]{4,8,0,7,9})),
	                () -> assertEquals("Min = -10, Max = 0", minMax2.findMinMax2(new int[]{-1,-10,-4,0}))
	        );
	 }
}
