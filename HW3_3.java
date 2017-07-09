package day3.HW;
import java.util.Arrays;
import java.util.Scanner;

/*Enter from keyboard array from 10 numbers
divide it on 2 arrays of equal length
sort every half and show them on the screen*/

public class HW3_3 {

	public static void main(String[] args) {
		int [] a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 elements of array:");
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		a[3] = scan.nextInt();
		a[4] = scan.nextInt();
		a[5] = scan.nextInt();
		a[6] = scan.nextInt();
		a[7] = scan.nextInt();
		a[8] = scan.nextInt();
		a[9] = scan.nextInt();
		
		int [] a1 = Arrays.copyOfRange(a, 0, 5);
		int [] a2 = Arrays.copyOfRange(a, 5, 10);
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		
		System.out.println("Sorted first half of the array is:" + Arrays.toString(a1));
		System.out.println("Sorted first half of the array is:" + Arrays.toString(a2));
		scan.close();

	}

}
