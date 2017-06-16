
package Patel;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner kp = new Scanner(System.in);
		System.out.println(" Enter a number ");
		int num = kp.nextInt();
		System.out.println("The sum of the digits are "+sumdigits(num));
		kp.close();
		
		
		
		

	}
	
	static int sumdigits(int num)
	{
		int sum =0;
		while(num>0){
			sum = sum + num%10;
			num = num/10;
			}
				return sum;
				
	}
	
}