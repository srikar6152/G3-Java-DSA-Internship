package leetcode;

public class RemoveDuplicates {

    public int removeDuplicates11(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
    	
    	RemoveDuplicates aa = new RemoveDuplicates();
    	
        int[] arr = {33, 33, 35, 35, 35, 36, 36, 37, 37, 48};
        
        int n = aa.removeDuplicates11(arr);

        System.out.println("Number of unique elements: " + n);
        System.out.print("Unique elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
