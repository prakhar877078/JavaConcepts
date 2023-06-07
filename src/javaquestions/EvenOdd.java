package javaquestions;

//WAP to find whether a number is even or odd.

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is even or odd :");
		 
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("please enter correct number");
		}else if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("number is even");
			}else {
				System.out.println("number is odd");
			}
		}
		
	}

}
