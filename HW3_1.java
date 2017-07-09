package day3.HW;

import java.util.Arrays;

/*1) create array from 10 elements.
2) Sort elements.
3) Show on the screen
4) Make possible to enter elements from keyboard*/

public class HW3_1 {

	public static void main(String[] args) {
		
		int[] a = {1,3,4,5,7,8,2,1,4};
		Arrays.sort(a);
		String sa = Arrays.toString(a);
		System.out.println("Sorted array 'a' is " + sa);

	}

}
