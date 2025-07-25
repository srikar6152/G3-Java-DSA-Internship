package leetcode;

import java.util.Arrays;

public class MergeSort {
	
	public int[] merge(int []nums1,int m,int n,int []nums2) {
		for(int i = 0;i<n;i++) {
			nums1[m+i] = nums2[i];
		}
		Arrays.sort(nums1);
		return nums1;
	}
	
	public static void main(String[] args) {
		MergeSort s1 = new MergeSort();
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int[] merged = s1.merge(nums1, 3, 3, nums2);
		
		for(int num : merged) {
			System.out.println(num + " ");
		}
		

	}

}
