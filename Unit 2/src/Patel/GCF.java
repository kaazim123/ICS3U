
package Patel;

import java.util.Scanner;

public class GCF {

	public static void main(String[]args){
		Scanner kp=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1=kp.nextInt();
		System.out.println("Please enter the second number");
		int num2=kp.nextInt();
		System.out.println("The GCF (Greatest Common Factor) of the two numbers is " +gcf(num1,num2));
	}
}
public static boolean isDivisible(int x, int y){
	if(x%y==0){
		return true;
	}
	return false;
	}
	public static int gcf(int num1, int num2){
		if(num1>num2){
			for(int a=num1; a>0;a--){
				if(isDivisible(num1, a)==true&& isDivisible(num2, a)==true){
					return a;	
				}
			}
		}
	if (num2>num1){
		for(int a= num2;a>0;){
			if(isDivisible(num2,a)==true&&isDivisible(num2,a)==true){
		
			
			}
			return a;
	}	
}
	return num1;
