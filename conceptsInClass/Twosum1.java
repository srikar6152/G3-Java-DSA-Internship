package leetcode;

public class Twosum1 { 
	public int[] twoSumProb(int arr[], int n) { 
		int[] arr2=new int[2];
		 for(int i=0;i<arr.length;i++) {
			 for (int j=i+1; j<arr.length;j++) {
				 if(arr[i]+arr[j]==n) { 
					 arr2[0]=arr[i];
					 arr2[1]=arr[j];
				 }
			}
		}
	return arr2;
}


public static void main(String[] args) {
	 Twosum1 t2= new Twosum1();
	 int array[]= {1,2,3,4,5,6};
	 int array2[]= new int[2];
	 array2=t2.twoSumProb(array, 10);
	 for(int i:array2) { 
		 System.out.println(i);
		 } 
	 }
}
