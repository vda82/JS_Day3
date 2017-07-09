package day3.HW;
/* Define arrays of integers consisting from N elements
 Change first and last elements of array
 Show array on the screen*/

import java.util.Arrays;

public class HW3_2 {

	public static void main(String[] args) {
		int[] a = {10,2,3,4,5};
		int a1 = a[0];
		int a5 = a[4];
		
		a[0] = a5;
		a[4] = a1;
		String sa = Arrays.toString(a);
		
		System.out.println(sa);

	}

}
