package io.Junit;

import java.util.Arrays;

public class MinMaxFinder {
	  public int[] findMinMax(int[] arr){
	        int[] as = new int[2];
	        as[0] = (Arrays.stream(arr).min().getAsInt());
	        as[1] = (Arrays.stream(arr).max().getAsInt());
	    	        return as;
	    }
	  
}
