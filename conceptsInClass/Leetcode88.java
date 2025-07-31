package leetcode;
import java.util.*;

public class Leetcode88 {
	
	int[] mergedArray(int[] nums1,int m,int[] nums2,int n) {
		int p1 = m -1;
		int p2 = n - 1;
		for(int i = m+n-1;i >= 0;i--){

	            if (p2 < 0) {
	                break; 
	            }
	            if (p1 >= 0 && nums2[p2] > nums1[p1]) {
	                nums1[i] = nums2[p2];
	                p2--;
	            } else if (p1 < 0) {
	                nums1[i] = nums2[p2];
	                p2--;
	            } else {
	                nums1[i] = nums1[p1];
	                p1--;
	            }
	        }
		return nums1;
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> lst= new ArrayList<>();
		
		 for (int i = 0; i < 5; i++) {
	            List<Integer> inner = new ArrayList<>();
	            inner.add(10);
	            lst.add(inner);
	        }
		System.out.println(lst);
	}

}
