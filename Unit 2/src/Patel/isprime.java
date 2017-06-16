
package Patel;

import java.util.Scanner;

public class isprime {

		public static void main(String[] args) {
		Scanner kp = new Scanner(System.in);
		System.out.println(" Enter a number ");
		int number = kp.nextInt();
		if(prime(number)==true){
			System.out.println("The number you have entered into the program is a prime number");
		}
		else if (prime(number)==false){
			System.out.println("The number you have entered into the program is not a prime number");
			
		}
		
	}
	public static boolean isDivisible(int x, int y){
		if(x%y==0){
			return true;
		}
		return false;
		}
	
	public static boolean prime(int number){
		for(int i=2;i<number/2;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	
}
	

	
			
		