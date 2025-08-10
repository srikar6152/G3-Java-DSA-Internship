package week3.assignment;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[] {left, right};
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        return new int[] {}; 
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15}; 
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
