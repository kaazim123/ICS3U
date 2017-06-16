
package Patel;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner kp = new Scanner(System.in);
		
		System.out.println(" Enter the amount of numbers you want. ");
		int n = kp.nextInt();
		int []num = new int[n];
		System.out.println("Enter the " + n + " numbers one by one");
		for (int i = 0; i<n; i++){
			num[i] = kp.nextInt();
		}
		System.out.println("the largest number is " + (largestNum(num)));
		}
		
		
	
	
	
	public static int largestNum(int[] number) {
		int GreatestNumber = number[0];

		for (int a = 1; a < number.length; a++) {

			GreatestNumber = Math.max(GreatestNumber, number[a]);
		}

		return GreatestNumber;
	}
}
