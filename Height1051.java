package leetcode;

import java.util.*;

public class Height1051 {
	    public int heightChecker(int[] heights) {
	        int[] expected = heights.clone(); 
	        Arrays.sort(expected);           
	        int count = 0;
	        
	        for (int i = 0; i < heights.length; i++) {
	            if (heights[i] != expected[i]) {
	                count++;
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        Height1051 obj = new Height1051();
	        int[] heights = {1,1,4,2,1,3};
	        System.out.println("Mismatches: " + obj.heightChecker(heights)); // Output: 3
	    }
	}