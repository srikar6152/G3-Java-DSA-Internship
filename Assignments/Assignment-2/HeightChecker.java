package week3.assignment;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] count = new int[101]; // heights range from 1 to 100
        for (int h : heights) {
            count[h]++;
        }

        int result = 0;
        int index = 0;

        for (int h = 1; h <= 100; h++) {
            while (count[h]-- > 0) {
                if (heights[index] != h) {
                    result++;
                }
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();
        int result = obj.heightChecker(new int[]{1, 1, 4, 2, 1, 3});
        System.out.println(result); // Output: 3
    }
}
