package leetcode;

import java.util.*;

public class Leetcode219 {

	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        Set<Integer> set1 = new HashSet<Integer>();

	        for(int i = 0; i < nums.length; i++) {
	            if(set1.contains(nums[i])) {
	                return true;
	            }
	            set1.add(nums[i]);

	            if(set1.size() > k) {
	                set1.remove(nums[i - k]);
	            }
	        }

	        return false;
	    }


	    public static void main(String[] args) {
	        Leetcode219 sol = new Leetcode219();

	        int[] nums1 = {1, 2, 3, 1};
	        int k1 = 3;
	        System.out.println("Test 1: " + sol.containsNearbyDuplicate(nums1, k1)); // true

	        int[] nums2 = {1, 0, 1, 1};
	        int k2 = 1;
	        System.out.println("Test 2: " + sol.containsNearbyDuplicate(nums2, k2)); // true

	        int[] nums3 = {1, 2, 3, 4, 5};
	        int k3 = 2;
	        System.out.println("Test 3: " + sol.containsNearbyDuplicate(nums3, k3)); // false

	        int[] nums4 = {1, 2, 3, 1, 2, 3};
	        int k4 = 2;
	        System.out.println("Test 4: " + sol.containsNearbyDuplicate(nums4, k4)); // false
	    }
	}
