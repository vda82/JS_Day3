package day3.HW;
//average
import java.util.Scanner;
public class HW3_4 {

	public static void main(String[] args) {
		int [] x = new int [5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 elements:");
		x[0] = scan.nextInt();
		x[1] = scan.nextInt();
		x[2] = scan.nextInt();
		x[3] = scan.nextInt();
		x[4] = scan.nextInt();
		
		int sum = (x[0] + x[1] + x[2] + x[3] + x[4]);
		int len = x.length;
		double avg = sum/len;
		System.out.println(avg);
		scan.close();
	}

}
