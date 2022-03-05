package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		 MinMaxFinder obj=new MinMaxFinder();
	        int[]ar={69,65,84,75};
	        int[] expected={65,84};
	        int[]actual= obj.findMinMax(ar);
	        assertArrayEquals(expected,actual);
	}

}
