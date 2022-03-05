package io.Junit;
public class MinAndMax {
	
    public String findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        return "Min = " + min + ", Max = " + max;
    }
}

//public class MinAndMax
//{
//    // Naive solution to find the minimum and maximum number in an array
//    public static int findMinAndMax(int[] nums)
//    {
//        // initialize minimum and maximum element with the first element
//        int max = nums[0];
//        int min = nums[0];
//        // do for each array element
//        for (int i = 1; i < nums.length; i++)
//        {
//        	// if the current element is greater than the maximum found so far
//            if (nums[i] > max) {
//                max = nums[i];
//                return max;
//            }
// 
//            // if the current element is smaller than the minimum found so far
//            else if (nums[i] < min) {
//                min = nums[i];
//                return min;
//            }
//        }
//		return max;
//    }
//}
// 
//        System.out.println("The minimum array element is " + min);
//        System.out.println("The maximum array element is " + max);
  
 