package java1;

import java.util.Arrays;

public class arrmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr1= {89,46,78,53,29};
	Arrays.sort(arr1);
	 int a=Arrays.binarySearch(arr1,78);
	 System.out.println(a);
	for(int b1:arr1)
		System.out.println(b1);
	System.out.println();

}
}