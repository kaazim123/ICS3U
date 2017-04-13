
package Patel;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner kp = new Scanner(System.in);
		
		System.out.println(" Enter a number ");
		int num = kp.nextInt();
		int factorial = getFactorial(num);
		System.out.println(num + "! is: " + factorial);
	}
	
	public static int getFactorial(int num) {
		int factorial=1;
		for (int i=1;i<=num;i++) {
			factorial*=i;
		}
		return factorial;
	}
}
