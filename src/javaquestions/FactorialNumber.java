package javaquestions;

//WAP to find factorial of a number

public class FactorialNumber {

	public static void main(String[] args) {

		int number = 0;
		getFact(number);
		
	}
	
	public static void getFact(int num) {
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
